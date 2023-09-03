package com.Infinity.Nexus.screen.foundry;

import com.Infinity.Nexus.InfinityNexus;
import com.Infinity.Nexus.utils.MouseUtils;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import org.slf4j.Logger;

import java.util.Optional;

public class FoundryScreen extends AbstractContainerScreen<FoundryMenu> {

    //O caminho até a textura da GUI é setado aqui
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(InfinityNexus.MOD_ID, "textures/gui/foundry_gui.png");
    private EnergyInfoArea energyInfoArea;
    public static String energy = "§cLow§r";
    //Define a Scream
    public FoundryScreen(FoundryMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void init() {
        super.init();
        assingEnergyInfoArea();
    }

    private void assingEnergyInfoArea() {
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;
        energyInfoArea = new EnergyInfoArea(x + 161, y + 10,menu.blockEntity.getEnergyStorage());
    }

    private static final Logger LOGGER = LogUtils.getLogger();
    //Renderiza a GUI na posião x, y, com base no tanahdo da imagem e da tela
    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight+2);

        renderProgressArrow(pPoseStack, x, y);
        energyInfoArea.draw(pPoseStack);
    }

    private void renderProgressArrow(PoseStack pPoseStack, int x, int y) {
        if(menu.isCrafting()) {
            blit(pPoseStack, x + 9, y + 24, 176, 0, 8, menu.getScaledProgress());
        }
    }
    //Ainda não sei, pergunta pro player
    @Override
    public void render(PoseStack pPoseStack, int pMouseX, int pMouseY, float pPartialTick) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, pMouseX, pMouseY, pPartialTick);
        renderTooltip(pPoseStack, pMouseX, pMouseY);
    }
    @Override
    protected void renderLabels(PoseStack matrixStack, int mouseX, int mouseY) {
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;
        this.font.draw(matrixStack, this.title, 8.0F, -8f, 16777215);
        this.font.draw(matrixStack, this.playerInventoryTitle, 8.0F, (float) (imageHeight/2) - 8, 16777215);


        this.font.draw(matrixStack, "Energy: "+energy, 80f, (float) (imageHeight/2) - 8, 16777215);
        renderEnergyAreaTooltips(matrixStack,mouseX,mouseY, x,y);
    }

    private void renderEnergyAreaTooltips(PoseStack matrixStack, int mouseX, int mouseY, int x, int y) {
        if(isMouseAboveArea(mouseX,mouseY,x,y,161,10,6,52)){
            renderTooltip(matrixStack,energyInfoArea.getTooltips(),
                    Optional.empty(),mouseX - x,mouseY - y);
        }
    }

    private boolean isMouseAboveArea(int mouseX, int mouseY, int x, int y, int offsetX, int offsetY, int width, int height) {
        return MouseUtils.isMouseOver(mouseX,mouseY, x+offsetX,y+offsetY, width,height);
    }

}
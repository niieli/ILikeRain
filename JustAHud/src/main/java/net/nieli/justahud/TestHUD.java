package net.nieli.justahud;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class TestHUD extends DrawableHelper implements HudRenderCallback {
    private static final Identifier TEST = new Identifier(JustAHud.MODID, "textures/hud/ardispolicestop.png");
    @Override
    public void onHudRender(MatrixStack matrixStack, float tickDelta) {
        RenderSystem.setShaderTexture(0, TEST);
        DrawableHelper.drawTexture(matrixStack,200,20,0,0,0,100,100,100,100);
    }
}

package net.nieli.justahud;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JustAHud implements ModInitializer {

	public static final String MODID = "justahud";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

	@Override
	public void onInitialize() {
		HudRenderCallback.EVENT.register(new TestHUD());
		LOGGER.info("Hello Fabric world!");
	}
}

package edn.stratodonut.trackwork.client;

import edn.stratodonut.trackwork.sounds.TrackSoundScapes;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class ClientEvents {
    public static final ClientResourceReloadListener RESOURCE_RELOAD_LISTENER = new ClientResourceReloadListener();

    @SubscribeEvent
    public static void onTick(TickEvent.ClientTickEvent event) {
        Minecraft minecraft = Minecraft.getInstance();
        if (minecraft.level == null || event.phase == TickEvent.Phase.START) {
            return;
        }

        TrackSoundScapes.tick();
    }

    @Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModBusEvents {

        @SubscribeEvent
        public static void registerClientReloadListeners(RegisterClientReloadListenersEvent event) {
            event.registerReloadListener(RESOURCE_RELOAD_LISTENER);
        }
    }
}

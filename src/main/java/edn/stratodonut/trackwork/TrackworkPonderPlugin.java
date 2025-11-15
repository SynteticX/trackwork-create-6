package edn.stratodonut.trackwork;

import edn.stratodonut.trackwork.tracks.TrackPonderScenes;
import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.minecraft.resources.ResourceLocation;

public class TrackworkPonderPlugin implements PonderPlugin {
    @Override
    public String getModId() {
        return TrackworkMod.MOD_ID;
    }

    @Override
    public void registerScenes(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        helper.forComponents(
                TrackBlocks.PHYS_TRACK.getId(),
                TrackBlocks.SUSPENSION_TRACK.getId(),
                TrackBlocks.LARGE_PHYS_TRACK.getId(),
                TrackBlocks.LARGE_SUSPENSION_TRACK.getId(),
                TrackBlocks.MED_PHYS_TRACK.getId(),
                TrackBlocks.MED_SUSPENSION_TRACK.getId()
        ).addStoryBoard("tracks", TrackPonderScenes::trackTutorial);

        helper.forComponents(
                TrackBlocks.SIMPLE_WHEEL.getId(),
                TrackBlocks.MED_SIMPLE_WHEEL.getId()
        ).addStoryBoard("wheels", TrackPonderScenes::wheelTutorial);
    }
}


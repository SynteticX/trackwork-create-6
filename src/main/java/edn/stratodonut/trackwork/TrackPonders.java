package edn.stratodonut.trackwork;

import net.createmod.ponder.foundation.PonderIndex;

public class TrackPonders {

    public static final boolean REGISTER_DEBUG_SCENES = false;

    public static void register() {
        PonderIndex.addPlugin(new TrackworkPonderPlugin());
    }
}

package net.createmod.catnip.lang;

import net.createmod.catnip.utility.lang.LangBuilder;

public final class Lang {
    private Lang() {
    }

    public static String asId(String name) {
        return net.createmod.catnip.utility.lang.Lang.asId(name);
    }

    public static String nonPluralId(String name) {
        return net.createmod.catnip.utility.lang.Lang.nonPluralId(name);
    }

    public static LangBuilder builder(String namespace) {
        return net.createmod.catnip.utility.lang.Lang.builder(namespace);
    }
}

package com.vendoau.library.util;

import net.minestom.server.MinecraftServer;
import org.jetbrains.annotations.NotNull;

public class TextUtil {
    public static void broadcastMessage(@NotNull String message) {
        MinecraftServer.getConnectionManager().getOnlinePlayers().forEach(player -> player.sendMessage(message));
    }

    public static @NotNull String getSecondsString(int seconds) {
        return seconds + (seconds == 1 ? " second" : " seconds");
    }
}

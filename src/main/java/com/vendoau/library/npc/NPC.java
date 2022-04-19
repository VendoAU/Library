package com.vendoau.library.npc;

import com.vendoau.library.util.PacketUtil;
import net.minestom.server.coordinate.Pos;
import net.minestom.server.entity.Entity;
import net.minestom.server.entity.EntityType;
import net.minestom.server.entity.Player;
import net.minestom.server.entity.PlayerSkin;
import net.minestom.server.instance.Instance;
import org.jetbrains.annotations.Nullable;

public class NPC extends Entity {

    private final String username;
    private final PlayerSkin skin;

    public NPC(String username, @Nullable PlayerSkin skin, Instance instance, Pos pos) {
        super(EntityType.PLAYER);

        this.username = username;
        this.skin = skin == null ? PlayerSkin.fromUuid(uuid.toString()) : skin;

        setInstance(instance, pos);
    }

    public NPC(String username, Instance instance, Pos pos) {
        this(username, null, instance, pos);
    }

    public void sendToPlayer(Player player) {
        player.sendPacket(PacketUtil.addPlayerInfoPacket(uuid, username, skin));
        addViewer(player);
    }

    public void removeFromTab(Player player) {
        player.sendPacket(PacketUtil.removePlayerInfoPacket(uuid));
    }
}
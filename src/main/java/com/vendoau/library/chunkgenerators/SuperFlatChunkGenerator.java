package com.vendoau.library.chunkgenerators;

import net.minestom.server.instance.Chunk;
import net.minestom.server.instance.ChunkGenerator;
import net.minestom.server.instance.ChunkPopulator;
import net.minestom.server.instance.batch.ChunkBatch;
import net.minestom.server.instance.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SuperFlatChunkGenerator implements ChunkGenerator {

    @Override
    public void generateChunkData(@NotNull ChunkBatch batch, int chunkX, int chunkZ) {
        for (int x = 0; x < Chunk.CHUNK_SIZE_X; x++) {
            for (int z = 0; z < Chunk.CHUNK_SIZE_Z; z++) {
                batch.setBlock(x, -64, z, Block.BEDROCK);
                batch.setBlock(x, -63, z, Block.DIRT);
                batch.setBlock(x, -62, z, Block.DIRT);
                batch.setBlock(x, -61, z, Block.GRASS_BLOCK);
            }
        }
    }

    @Override
    public @Nullable List<ChunkPopulator> getPopulators() {
        return null;
    }
}
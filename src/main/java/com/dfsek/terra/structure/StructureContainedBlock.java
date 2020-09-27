package com.dfsek.terra.structure;

import com.dfsek.terra.structure.serialize.SerializableBlockData;
import com.dfsek.terra.structure.serialize.block.SerializableBlockState;
import com.dfsek.terra.structure.serialize.block.SerializableSign;
import org.bukkit.Bukkit;
import org.bukkit.block.BlockState;
import org.bukkit.block.Sign;
import org.bukkit.block.data.BlockData;

import java.io.Serializable;

public class StructureContainedBlock implements Serializable {
    public static final long serialVersionUID = 6143969483382710947L;
    private final SerializableBlockData bl;
    private transient BlockData data;
    private final int x;
    private final int y;
    private final int z;
    private final SerializableBlockState state;
    public StructureContainedBlock(int x, int y, int z, BlockState state, BlockData d) {
        if(state instanceof Sign) {
            this.state = new SerializableSign((org.bukkit.block.Sign) state);
        } else this.state = null;
        this.x = x;
        this.y = y;
        this.z = z;
        this.bl = new SerializableBlockData(d);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public BlockData getBlockData() {
        if(data == null) {
            data = bl.getData();
        }
        return data;
    }


    public SerializableBlockState getState() {
        return state;
    }
}

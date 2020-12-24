package com.dfsek.terra.generation.items.tree;

import com.dfsek.terra.api.math.vector.Location;
import com.dfsek.terra.api.structures.script.StructureScript;
import com.dfsek.terra.api.structures.structure.Rotation;
import com.dfsek.terra.api.world.tree.Tree;
import com.dfsek.terra.util.MaterialSet;

import java.util.Random;

public class TerraTree implements Tree {
    private final MaterialSet spawnable;
    private final int yOffset;
    private final StructureScript structure;

    public TerraTree(MaterialSet spawnable, int yOffset, StructureScript structure) {
        this.spawnable = spawnable;
        this.yOffset = yOffset;
        this.structure = structure;
    }

    @Override
    public synchronized boolean plant(Location location, Random random) {
        structure.execute(location.clone().add(0, yOffset, 0), Rotation.fromDegrees(90 * random.nextInt(4)));
        return true;
    }

    @Override
    public MaterialSet getSpawnable() {
        return spawnable;
    }

}

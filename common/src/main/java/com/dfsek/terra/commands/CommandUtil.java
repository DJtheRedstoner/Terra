package com.dfsek.terra.commands;

import com.dfsek.terra.api.command.CommandManager;
import com.dfsek.terra.api.command.exception.MalformedCommandException;
import com.dfsek.terra.commands.profiler.ProfileCommand;

public final class CommandUtil {
    public static void registerAll(CommandManager manager) throws MalformedCommandException {
        manager.register("structure", StructureCommand.class);
        manager.register("profile", ProfileCommand.class);
    }
}
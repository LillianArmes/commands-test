package me.lillian.commandstest.commands;

import me.lillian.commandstest.model.ColorModel;
import org.selyu.commands.core.annotation.Command;
import org.selyu.commands.core.argument.CommandArgs;

public final class ColorModelCommands {
    @Command(name = "of", desc = "Make a color from a string!")
    public void of(CommandArgs args, ColorModel model) {
        args.getSender().sendMessage("Model: " + model.toString());
    }
}

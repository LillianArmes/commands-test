package me.lillian.commandstest;

import me.lillian.commandstest.commands.ColorModelCommands;
import me.lillian.commandstest.model.ColorModel;
import me.lillian.commandstest.provider.ColorModelProvider;
import org.jetbrains.annotations.NotNull;
import org.selyu.commands.core.ICommandService;

import static java.util.Objects.requireNonNull;

public final class CommandsTest {
    private CommandsTest() {
    }

    public static void registerDefaults(@NotNull ICommandService service) {
        requireNonNull(service, "service");
        service.bind(ColorModel.class).toProvider(new ColorModelProvider());
        service.register(new ColorModelCommands(), "colormodel", "cmodel");
    }
}

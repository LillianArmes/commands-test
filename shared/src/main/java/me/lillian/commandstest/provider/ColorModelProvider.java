package me.lillian.commandstest.provider;

import me.lillian.commandstest.model.ColorModel;
import org.jetbrains.annotations.NotNull;
import org.selyu.commands.core.argument.CommandArg;
import org.selyu.commands.core.provider.IParameterProvider;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.stream.Collectors;

public final class ColorModelProvider implements IParameterProvider<ColorModel> {
    private static final List<String> DEFAULT_SUGGESTIONS = List.of(
            "red",
            "pink",
            "gray"
    );

    @Override
    public @NotNull ColorModel provide(@NotNull CommandArg arg, @NotNull List<? extends Annotation> annotations) throws IllegalArgumentException {
        return new ColorModel(arg.get());
    }

    @Override
    public @NotNull String argumentDescription() {
        return "color model";
    }

    @Override
    public @NotNull List<String> getSuggestions(@NotNull String input) {
        return DEFAULT_SUGGESTIONS.stream()
                .filter(suggestion -> input.length() == 0 || suggestion.startsWith(input.toLowerCase()))
                .collect(Collectors.toList());
    }
}

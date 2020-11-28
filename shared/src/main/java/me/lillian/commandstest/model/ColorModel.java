package me.lillian.commandstest.model;

import org.jetbrains.annotations.NotNull;

import static java.util.Objects.requireNonNull;

public final class ColorModel {
    private final String color;

    public ColorModel(@NotNull String color) {
        requireNonNull(color, "color");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorModel{" +
                "color='" + color + '\'' +
                '}';
    }
}

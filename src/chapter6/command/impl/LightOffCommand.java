package chapter6.command.impl;

import chapter6.command.Command;
import chapter6.objects.Light;

public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();

    }
}

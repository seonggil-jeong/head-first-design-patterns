package chapter6.command.impl;

import chapter6.command.Command;
import chapter6.objects.Stereo;

public class StereoOnWithCDCommand implements Command {
    private final Stereo stereo;


    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}

package chapter6;

import chapter6.command.impl.LightOnCommand;
import chapter6.controller.SimpleRemoteControl;
import chapter6.objects.Light;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Living Room");
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}

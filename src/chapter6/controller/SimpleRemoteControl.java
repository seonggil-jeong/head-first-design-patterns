package chapter6.controller;


import chapter6.command.Command;

public class SimpleRemoteControl {
    Command slot; // command object

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command; // can change command dynamically by calling this method
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}

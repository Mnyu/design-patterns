package _03_behavioural._02_command._01_command_plus_undo_operations;

public interface Command {
    void call();
    void undo();
}

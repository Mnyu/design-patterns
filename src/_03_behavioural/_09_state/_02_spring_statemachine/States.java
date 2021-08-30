package _03_behavioural._09_state._02_spring_statemachine;

public enum States {
    OFF_HOOK, // starting state
    ON_HOOK, // terminal state
    CONNECTING,
    CONNECTED,
    ON_HOLD
}

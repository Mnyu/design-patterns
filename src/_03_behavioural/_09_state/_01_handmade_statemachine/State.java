package _03_behavioural._09_state._01_handmade_statemachine;

public enum State {
    OFF_HOOK, // starting state
    ON_HOOK, // terminal state
    CONNECTING,
    CONNECTED,
    ON_HOLD
}

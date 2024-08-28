package com.ericsson.s345g.channel;

public enum CState {
    CLOSED,
    READY,
    CLOSING, // failed to open connection
    FAILED, // Reconnect didn't work! Give up.
    DROPPED, // failed to write, closed by the other end
}
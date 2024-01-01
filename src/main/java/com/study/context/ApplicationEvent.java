package com.study.context;


import java.util.EventObject;

public class ApplicationEvent extends EventObject {
    private static final long serialVersionUID = 1768783539L;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}

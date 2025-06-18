package org.example.utils;


public abstract class Dictionary {

    public static final String ACTOR_NAME="the automation engineer";
    public static final String BASE_URL="https://reqres.in/api";
    public static final String CREATE_USER_RESOURCE="/users";



    private Dictionary() {
        throw new IllegalStateException("Utility class");
    }
}

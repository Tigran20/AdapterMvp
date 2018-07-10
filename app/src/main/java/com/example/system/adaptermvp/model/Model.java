package com.example.system.adaptermvp.model;

public class Model {

    private String hello;
    private String world;

    public Model(String hello, String world) {
        this.hello = hello;
        this.world = world;
    }

    public String getHello() {
        return hello;
    }

    public String getWorld() {
        return world;
    }
}

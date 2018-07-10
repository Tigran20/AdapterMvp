package com.example.system.adaptermvp.model;

import java.util.ArrayList;

public class Data {

    public static ArrayList<Model> getList() {
        ArrayList<Model> list = new ArrayList<>();

        for (int i = 1; i < 25; i++) {
            list.add(new Model("Alex", "Troy " + i));
        }

        return list;
    }
}

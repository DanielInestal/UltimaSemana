package com.dancraft;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Persona person = new Persona("Alfonso", "Gonzalez Brion", "Alfonso@gmail.com", 46);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
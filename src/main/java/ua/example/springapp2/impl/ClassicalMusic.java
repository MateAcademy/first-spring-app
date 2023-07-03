package ua.example.springapp2.impl;

import ua.example.springapp2.Music;

/**
 * @author Serhii Klunniy
 */
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}

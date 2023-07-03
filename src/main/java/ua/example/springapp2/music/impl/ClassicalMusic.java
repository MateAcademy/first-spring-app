package ua.example.springapp2.music.impl;

import ua.example.springapp2.music.Music;

/**
 * @author Serhii Klunniy
 */
public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit() {
        System.out.println("Init method in class ClassicalMusic");
    }

    public void doMyDestroy() {
        System.out.println("Destroy method in class ClassicalMusic");
    }

    public static Music getClassicalMusic() {
        return new ClassicalMusic();
    }

}

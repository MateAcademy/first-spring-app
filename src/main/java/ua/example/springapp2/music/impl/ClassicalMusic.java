package ua.example.springapp2.music.impl;

import ua.example.springapp2.music.Music;

/**
 * @author Serhii Klunniy
 */
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    private void doMyInit() {
        System.out.println("Init method in class MusicPlayer");
    }

    private void doMyDestroy() {
        System.out.println("Destroy method in class MusicPlayer");
    }

}

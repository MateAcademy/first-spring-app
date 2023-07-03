package ua.example.springapp2.music.impl;

import org.springframework.stereotype.Component;
import ua.example.springapp2.music.Music;

/**
 * @author Serhii Klunniy
 */
//@Component
public class ClassicalMusic implements Music {

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

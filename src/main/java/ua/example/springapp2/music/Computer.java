package ua.example.springapp2.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        musicPlayer.playMusic();
        return "exit ";
    }


    public void doMyInit() {
        System.out.println("Init method in class Computer");
    }

    public void doMyDestroy() {
        System.out.println("Destroy method in class Computer");
    }
}
package ua.example.springapp2.music;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@Component
public class Computer {

    @Value("${musicPlayer.id}")
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

    @PostConstruct
    public void doMyInit() {
        System.out.println("Init method in class Computer");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy method in class Computer");
    }
}

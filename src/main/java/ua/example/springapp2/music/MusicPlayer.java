package ua.example.springapp2.music;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ua.example.springapp2.music.Music;
import ua.example.springapp2.music.impl.ClassicalMusic;
import ua.example.springapp2.music.impl.RockMusic;

/**
 * @author Serhii Klunniy
 */
@Data
@Component
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MusicPlayer {

    Music classicalMusic;
    RockMusic rockMusic;
    int volume;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
        System.out.println("Playing: " + rockMusic.getSong());
    }

    private void doMyInit() {
        System.out.println("Init method in class MusicPlayer");
    }

    private void doMyDestroy() {
        System.out.println("Destroy method in class MusicPlayer");
    }
}

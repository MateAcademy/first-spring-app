package ua.example.springapp2.music;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import ua.example.springapp2.music.Music;

/**
 * @author Serhii Klunniy
 */
@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MusicPlayer {
     Music music;
     String name;
     int volume;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    private void doMyInit() {
        System.out.println("Init method in class MusicPlayer");
    }

    private void doMyDestroy() {
        System.out.println("Destroy method in class MusicPlayer");
    }
}

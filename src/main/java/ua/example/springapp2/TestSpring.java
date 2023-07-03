package ua.example.springapp2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.example.springapp2.music.MusicPlayer;
import ua.example.springapp2.music.impl.RockMusic;

/**
 * @author Serhii Klunniy
 */
public class TestSpring {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            var musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.playMusic();
            System.out.println(musicPlayer);

//            var musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//            boolean comparison = musicPlayer == musicPlayer2;
//            System.out.println(comparison);

 //           RockMusic musicBean = context.getBean("musicBean", RockMusic.class);
        }
    }
}

package ua.example.springapp2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.example.springapp2.configuration.SpringConfig;
import ua.example.springapp2.music.Computer;
import ua.example.springapp2.music.MusicPlayer;
import ua.example.springapp2.music.impl.RockMusic;

/**
 * @author Serhii Klunniy
 */
public class TestSpring {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringConfig.class);
        var computer = context.getBean("computer", Computer.class);
        System.out.println(computer.getId());

//        try (var context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
//            var computer = context.getBean("computer", Computer.class);
//            System.out.println(computer.getId());

//           System.out.println(musicPlayer);
//           var musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//           boolean comparison = musicPlayer == musicPlayer2;
//           System.out.println(comparison);
//           RockMusic musicBean = context.getBean("musicBean", RockMusic.class);
//        }
    }
}

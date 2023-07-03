package ua.example.springapp2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.example.springapp1.TestBean;

/**
 * @author Serhii Klunniy
 */
public class TestSpring {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            var testBean = context.getBean("musicPlayerBaen", MusicPlayer.class);
            testBean.playMusic();
        }
    }
}

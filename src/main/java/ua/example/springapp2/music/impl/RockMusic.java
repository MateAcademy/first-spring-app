package ua.example.springapp2.music.impl;

import lombok.Data;
import org.springframework.stereotype.Component;
import ua.example.springapp2.music.Music;

/**
 * @author Serhii Klunniy
 */
@Data
@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    private RockMusic() {
    }

    public void doMyInit() {
        System.out.println("Init method in class RockMusic");
    }

    public void doMyDestroy() {
        System.out.println("Destroy method in class RockMusic");
    }

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }
}

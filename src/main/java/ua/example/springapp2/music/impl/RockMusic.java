package ua.example.springapp2.music.impl;

import lombok.Data;
import ua.example.springapp2.music.Music;

/**
 * @author Serhii Klunniy
 */
@Data
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    private void doMyInit() {
        System.out.println("Init method in class RockMusic");
    }

    private void doMyDestroy() {
        System.out.println("Destroy method in class RockMusic");
    }

}

package ua.example.springapp2.music.impl;

import org.springframework.stereotype.Component;
import ua.example.springapp2.music.Music;

@Component("rapMusic")
public class Rap implements Music {
    @Override
    public String getSong() {
        return "Rap music";
    }

    private void doMyInit() {
        System.out.println("Init method in class Rap");
    }

    private void doMyDestroy() {
        System.out.println("Destroy method in class Rap");
    }

}

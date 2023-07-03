package ua.example.springapp2.music.impl;

import lombok.Data;
import org.springframework.stereotype.Component;
import ua.example.springapp2.music.Music;

@Data
@Component("rapMusic")
public class Rap implements Music {
    @Override
    public String getSong() {
        return "Rap music";
    }

    public void doMyInit() {
        System.out.println("Init method in class Rap");
    }

    public void doMyDestroy() {
        System.out.println("Destroy method in class Rap");
    }

}

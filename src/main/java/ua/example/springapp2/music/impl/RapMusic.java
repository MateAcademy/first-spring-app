package ua.example.springapp2.music.impl;

import lombok.Data;
import ua.example.springapp2.music.Music;

@Data
//@Component("rapMusic")
public class RapMusic implements Music {
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

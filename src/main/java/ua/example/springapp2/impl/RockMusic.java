package ua.example.springapp2.impl;

import lombok.Data;
import ua.example.springapp2.Music;

/**
 * @author Serhii Klunniy
 */
@Data
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}

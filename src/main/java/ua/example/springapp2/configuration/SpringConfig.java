package ua.example.springapp2.configuration;

import org.springframework.context.annotation.*;
import ua.example.springapp2.music.impl.ClassicalMusic;
import ua.example.springapp2.music.impl.RapMusic;
import ua.example.springapp2.music.impl.RockMusic;

@Configuration
@ComponentScan("ua.example.springapp2")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
}

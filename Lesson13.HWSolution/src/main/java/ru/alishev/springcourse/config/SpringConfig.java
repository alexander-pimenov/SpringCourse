package ru.alishev.springcourse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import ru.alishev.springcourse.Computer;
import ru.alishev.springcourse.Music;
import ru.alishev.springcourse.MusicPlayer;
import ru.alishev.springcourse.genres.ClassicalMusic;
import ru.alishev.springcourse.genres.JazzMusic;
import ru.alishev.springcourse.genres.RockMusic;

import java.util.Arrays;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    //это бин, который представляет из себя список из
    //музыкальных жанров
    //для него нет отдельного java-класса, т.к. ему нужно
    //вернуть не объект какого то класса, а список из этих классов
    @Bean
    public List<Music> musicList() {
        // Этот лист неизменяемый (immutable)
    	// возвращает нам список из музыкальных жанров
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

/**
 * @author Neil Alishev
 */
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    //в этом поле храним не отдельные музыкальные жанры,
    //а список из этих жанров
    private List<Music> musicList;
    
    //этот конструктор получает на вход список из музыкальных жанров
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //в этом методе благодаря Классу Random производим
    //песню случайного музыкального жанра.
    public String playMusic() {
        Random random = new Random();

        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong()
                + " with volume " + this.volume;
    }
}

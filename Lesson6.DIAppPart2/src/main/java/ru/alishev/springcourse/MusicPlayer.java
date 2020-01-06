package ru.alishev.springcourse;

/**
 * @author Neil Alishev
 */
public class MusicPlayer {
    private Music music;

    //Название нашего музыкального плеера.
    private String name;
    
    //Значение громкости.
    private int volume;

    public String getName() {
        return name;
    }

    //Сеттер для назначения названия плеера.
    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

  //Сеттер для назначения громкости.
    public void setVolume(int volume) {
        this.volume = volume;
    }

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    //Конструктор без аргументов ДОЛЖЕН быть обязательно,
    //Если используем сеттеры для внедрения зависимостей.
    public MusicPlayer() {}

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}

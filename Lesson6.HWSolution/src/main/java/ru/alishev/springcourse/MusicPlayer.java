package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Класс MusicPlayer зависит от нашей музыки, т.е. от интерфейса Music и от тех
 * классов, которые его реализовывают.
 * 
 * Здесь будет применена Инверсия Управления.
 * 
 * @author Neil Alishev
 */
public class MusicPlayer {
	
	// поле общего интерфейса Music позволяет играть
	// в нашем MusicPlayer играть музыку любого жанра.
	// Имеем список музыкальных жанров.
	private List<Music> musicList = new ArrayList<>();

	private String name;
	private int volume;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	//Сеттер для списка музыкальных жанров.
	public void setMusicList(List<Music> musicList) {
		this.musicList = musicList;
	}

	
	// В методе будет использоваться внедренная зависимость
	// из жанра музыки, который будет внедрен будем получать песню.
	// Метод проигрывает все жанры песен.
	public void playMusicList() {
		for (Music music : musicList) {
			System.out.println("Playing: " + music.getSong());
		}
	}
}

package ru.alishev.springcourse;

/**
 * Класс MusicPlayer зависит от нашей музыки, т.е. от интерфейса Music и от тех
 * классов, которые его реализовывают.
 * 
 * Здесь будет применена Инверсия Управления.
 * 
 * @author Alex
 *
 */

public class MusicPlayer {

	// поле общего интерфейса Music позволяет играть
	// в нашем MusicPlayer играть музыку любого жанра.
	private Music music;

	// Внутрь нашего конструктора передаем зависимость,
	// IoC
	// наш жанр музыки.
	// Здесь используем полиморфизм.
	public MusicPlayer(Music music) {
		this.music = music;
	}

	// в методе будет использоваться внедренная зависимость
	// из жанра музыки, который будет внедрен будем получать песню
	public void playMusic() {
		System.out.println("Playing: " + music.getSong());
	}

}

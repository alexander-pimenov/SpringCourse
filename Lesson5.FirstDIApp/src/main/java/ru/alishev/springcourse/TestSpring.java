package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Эти две строчки уже не нужны, т.к. зависимости прописаны в файле
		// applicationContext.xml
		// Music music = context.getBean("musicBean", Music.class);
		// MusicPlayer musicPlayer = new MusicPlayer(music);

		//Обращаемся к нашему контексту. И получаем MusicPlayer из контекста.
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

		musicPlayer.playMusic();

		context.close();
	}
}

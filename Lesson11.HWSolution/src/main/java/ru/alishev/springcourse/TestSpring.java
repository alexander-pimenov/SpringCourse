package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

		for (int i = 0; i < 10; i++) {

			musicPlayer.playMusic(MusicGenre.CLASSICAL);
			musicPlayer.playMusic(MusicGenre.ROCK);
			System.out.println("===============================");

		}

		context.close();
	}
}

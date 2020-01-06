package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Т.к. в aplicationContext.xml указан scope="prototype", то Спринг создает разные бины.
		//Вытащим из контекста объект MusicPlayer, сохраним его в переменную.
		MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

		//Вытащим из контекста еще один объект MusicPlayer, сохраним его так же в переменную.
		MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

		// Сравним два объекта MusicPlayer firstMusicPlayer и secondMusicPlayer
		// убедимся, что это два разных объекта.
		// на выходе получим false.
		// Сравнение "==" происходит по указателям на объект: т.е. проверяем указывают
		// ли два этих
		// указателя на один и тот же участок памяти.
		//
		// Если сравнивать по equals(), то произойдет сравнение по содержанию!!!

		boolean comparison = firstMusicPlayer == secondMusicPlayer;

		System.out.println(comparison);// выводим результат сравнения на экран.

		//напечатаем наш первый объект (выведется хеш объекта)
		System.out.println(firstMusicPlayer);
		
		//напечатаем наш второй объект (выведется хеш объекта)
		System.out.println(secondMusicPlayer);

		//Изменим громкость первого плеера. При этом у второго плеера она не изменится.
		firstMusicPlayer.setVolume(10);

		//напечатаем 
		System.out.println(firstMusicPlayer.getVolume());
		
		//напечатаем 
		System.out.println(secondMusicPlayer.getVolume());

		// System.out.println(musicPlayer.getName());
		// System.out.println(musicPlayer.getVolume());

		context.close();
	}
}

package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Получаем доступ к бину из контекста, для класса ClassicalMusic
		ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
		
		////Создали дополнительные classicalMusic, чтобы показать что при scope=singleton, который
		//стоит по-умолчанию, создается только один объект класса ClassicalMusic.
		//classicalMusic и classicalMusic2 и classicalMusic3 будут ссылаться на один и тот же объект.
		//ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);
		//ClassicalMusic classicalMusic3 = context.getBean("musicBean", ClassicalMusic.class);

		//// это пример при указании scope=prototype
		// чтобы показать сколько бинов создастся
		//ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);

		// Вызовем у этого бина метод getSong()
		System.out.println(classicalMusic.getSong());
		
		////Сделали вызовы метода getSong() для переменных classicalMusic2 и 
		//classicalMusic3, чтоб было видно что этот метод можно вызывать без ограничений.
		//System.out.println(classicalMusic2.getSong());
		//System.out.println(classicalMusic3.getSong());

		//// это пример при указании scope=prototype
		// чтобы показать, что у всех созданных бинов вызовется метод getSong() 
		//System.out.println(classicalMusic2.getSong());

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayerf.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparison);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

		// System.out.println(musicPlayer.getName());
		// System.out.println(musicPlayer.getVolume());

		context.close();
	}
}

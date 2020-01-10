package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * В этом классе мы зависимость полученную
 * из application context вручную передаем 
 * в конструктор нашего musicPlayer
 * @author Alex
 *
 */

public class TestSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// получаем от Спринга, достаем из контекста бин,
		// который реализует интерфейс Music
		// А что именно, так это прописано в конфигурационном файле.
		// Изменять будем только class="ru.alishev.springcourse.ClassicalMusic"
		// т.е. в java-код мы совсем не залазим!!!
		// и так будем получать или RockMusic или ClassicalMusic
		Music music = context.getBean("musicBean", Music.class);

		// совершим внедрение зависимостей (вручную)
		// получили выше зависимость из Спринг Контекста
		// и ее передали (внедрили) в конструктор нашего плеера MusicPlayer
		// Т.обр. мы применили архитектуру Инверсию Управления.
		MusicPlayer musicPlayer = new MusicPlayer(music);

		// используем наш MusicPlayer
		musicPlayer.playMusic();

		// Имеем на выходе:
		// Playing: Wind cries Mary
		// или
		// Playing: Hungarian Rapsody

		context.close();

	}

}

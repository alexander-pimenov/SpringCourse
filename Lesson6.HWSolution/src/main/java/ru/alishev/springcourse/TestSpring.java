package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {
    	
		/* Создаем класс ClassPathXmlApplicationContext.
		 * Его мы получаем от Spring Framework: org.springframework.
		 * Этот класс обращается к файлу applicationContext.xml, считывает его и
		 * помещает все бины, которые там прописаны в Application Context.
		 * 
		 * В конструкторе обязательно указываем название нашего файла,
		 * в котором создается наш бин: "applicationContext.xml"
		 * 
		 * Этот файл должен лежать в папке resources.
		 */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        
		/* Теперь из ClassPathXmlApplicationContext получим наш MusicPlayer,
		 * с помощью метода getBean()
		 * в параметр передаем id нашего бина, т.е. получаем бин по его айдишнику: "musicPlayer"
		 * Также указываем класс, бин которого мы хотим получить: MusicPlayer 
		 */
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        //Вызываем метод проигрывающий все жанры музыки.
        musicPlayer.playMusicList();
        
        //Вызовем название плеера и его громкость.
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


        //Не забудем закрыть наш контекст. После того как с ним поработали.
        context.close();
    }
}

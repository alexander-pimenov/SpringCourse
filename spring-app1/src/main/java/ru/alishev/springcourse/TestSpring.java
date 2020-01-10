package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Это приложение создано с помощью spring-core,
 * это простейшее веб-приложение.
 * 
 * В этом классе мы тестируем работу Spring Framework.
 *  
 * Здесь Spring Framework создает один объект нашего класса TestBean.
 * 
 * Смотрим, как работает Spring Application Context. 
 * Мы обратимся к Spring Application Context и извлечем 
 * из него созданный объект.
 * 
 * В этом классе мы из нашего applicationContext.xml,
 * т.е. из контекста будем доставать бины. 
 * Наши заранее прописанные объекты.
 * Это делаем с помощью ClassPathXmlApplicationContext, который лежит в 
 * org.springframework.context.
 * @author Alex
 *
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
		 * 
		 */
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		/* Теперь из ClassPathXmlApplicationContext получим наш TestBean,
		 * с помощью метода getBean()
		 * в параметр передаем id нашего бина, т.е. получаем бин по его айдишнику: "testBean"
		 * Также указываем класс, бин которого мы хотим получить: TestBean 
		 * 
		 */
		
		
		TestBean testBean2 = context.getBean("testBean2", TestBean.class);
		TestBean testBean3 = context.getBean("testBean3", TestBean.class);
		TestBean testBean = context.getBean("testBean", TestBean.class);
		
		//выведем поле name этого бина.
		System.out.println(testBean2.getName());
		System.out.println(testBean3.getName());
		System.out.println(testBean.getName());
		
		//Не забудем закрыть наш контекст. После того как с ним поработали.
		context.close();
	}
}

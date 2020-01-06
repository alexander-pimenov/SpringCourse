package ru.alishev.springcourse;

/**
 * @author Neil Alishev
 */
public class ClassicalMusic implements Music {

	// Чтоб продемонстрировать работу метода factory-method
	// Изменим класс ClassicalMusic так, чтоб пользователь не смог создать
	// класс с помощью ключевого слова new.
	// Для этого сделаем приватный конструктор.
	// И для создания объектов этого класса будем использовать
	// фабричный метод, в этом и заключается паттерн фабричного метода.
	private ClassicalMusic() {
	}

	// Создаем фабричный метод для создания объектов ClassicalMusic.
	// Он статический, т.е. вызывается на классе, а не на объекте.
	// Если он НЕ будет статическим, то будет замкнутый круг:
	// не будет объекта на котором мы можем вызвать фабричный метод,
	// а единственный способ вызвать объект - это вызвать фабричный метод!!!
	// Вызвав этот метод, пользователь получит объект того класса, который
	// ему нужен.
	public static ClassicalMusic getClassicalMusic() {
		return new ClassicalMusic();
	}

	//// Добавим инит-метод (init-method)
	// doMyInit - это любое название.
	// Это название потом прописываем в файле applicationContext.xml
	// Здесь хотим, чтобы при создании бина, в консоль выводилось сообщение.
	public void doMyInit() {
		System.out.println("Doing my initialization");
	}

	//// Добавим дестрой-метод (destroy-method)
	public void doMyDestroy() {
		System.out.println("Doing my destruction");
	}

	@Override
	public String getSong() {
		return "Hungarian Rhapsody";
	}

}

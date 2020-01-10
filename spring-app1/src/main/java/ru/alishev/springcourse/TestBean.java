package ru.alishev.springcourse;

/**
 * Это тот объект, который мы хотим создать
 * с помощью Spring Framework.
 * 
 * @author Alex
 *
 */

public class TestBean {
	private String name;

	public TestBean(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

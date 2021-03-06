package ru.alishev.springcourse;

/**
 * Интерфейс для общего жанра музыки.
 * Этот интерфейс будут реализовывать другие 
 * жанры музыки.
 *  
 * @author Alex
 *
 */

public interface Music {
	
	//все жанры музыки должны иметь метод getSong()
	//который возвращает название песни.
	String getSong();
	

}

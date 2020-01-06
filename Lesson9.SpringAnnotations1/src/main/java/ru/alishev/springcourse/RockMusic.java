package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */

//Аннотация Component обязательно пишется в классе, а не в интерфейсе.
//в () указан id нашего бина
@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}

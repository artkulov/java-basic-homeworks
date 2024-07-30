package ru.artkulov.java.basic.homeworks;
import ru.artkulov.java.basic.homeworks.homework4.User;
import ru.artkulov.java.basic.homeworks.homework4.Box;

import java.time.LocalDateTime;

public class GreetengsApplication {
    public static void main(String[] args) {


        User[] users = {
                new User("Петров", "Иван","Олегович", 1998, "petrow@mail.ru"),
                new User("Иванов", "Иван","Иванович", 1980, "ivanov@mail.ru"),
                new User("Осько", "Николай","Валерьевич", 1984, "osko@mail.ru"),
                new User("Полтавский", "Егор","Алексеевич", 1970, "poltavski@mail.ru"),
                new User("Коршунов", "Олег","Олегович", 1965, "korshun@mail.ru"),
                new User("Охотский", "Кирилл","Викторович", 2001, "okhotski@mail.ru"),
                new User("Логинов", "Генадий","Васильевич", 1969, "loginow@mail.ru"),
                new User("Иванова", "Елена","Александровна", 1966, "ivanova@mail.ru"),
                new User("Осипов", "Андрей","Сергеевич", 1990, "osipov@mail.ru"),
                new User("Колотько", "Ольга","Константиновна", 1991, "kolotko@mail.ru")
        };
        LocalDateTime now = LocalDateTime.now();
        for (int i = 0; i < users.length; i++) {
            if(now.getYear()-users[i].getDateOfBirth()>40){
               users[i].info();
                System.out.println();
            }

        }

    }
}

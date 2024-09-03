package ru.artkulov.java.basic.homeworks.homework10;

public class MainApplication {
    public static void main(String[] args) {
        PhoneBook pB = new PhoneBook();
        // заполняем справочник данными
        pB.add("Корсунов", "+7 (911) 322-22-23");
        pB.add("Иванов", "+7 (911) 444-44-44");
        pB.add("Корсунов", "+7 (911) 322-22-23");
        pB.add("Сидоров", "+7 (911) 555-55-55");
        pB.add("Андреев", "+7 (911) 666-69-69");
        pB.add("Корсунок", "+7 (911) 772-27-72");
        pB.add("Иванов", "+7 (911) 802-08-02");
        pB.add("Корсунов", "+7 (911) 999-09-90");
        // запрашиваем результаты
        pB.get("Корсунов");
        pB.get("Иванов");
        pB.get("Сидоров");
    }
}

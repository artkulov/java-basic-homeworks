package ru.artkulov.java.basic.homeworks.homework4;

public class Box {
    private int length;
    private int width;
    private int height;
    private String color;
    private boolean isOpen;
    private String item;

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getItem() {
        return item;
    }

    public Box(int length, int width, int height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isOpen = false;
        this.item = null;
    }

    public void open() {
        if(this.isOpen==true) {
            System.out.println("Коробка уже открыта");
        }
        else {
            this.isOpen = true;
            System.out.println("Вы открыли коробку");
        }
    }

    public void close() {
        if(this.isOpen==false) {
            System.out.println("Коробка уже закрыта");
        }
        else {
        this.isOpen = false;
        System.out.println("Вы закрыли коробку");
        }
    }

    public void putItem(String item) {
        if (isOpen) {
            if (this.item == null) {
                this.item = item;
                System.out.println("Вы положили "+this.item);
            }
            else {
                System.out.println("В коробке что-то лежит");
            }
        }
        else {
            System.out.println("Сначала откройте коробку");
        }

    }

    public void takeItem() {
        if (isOpen) {
            if (this.item != null) {
                System.out.println("Вы достали " + this.item);
                this.item = null;
            }
            else {
                System.out.println("В коробке пусто");
            }
        }
        else {
            System.out.println("Сначала откройте коробку");
        }

    }


    public void info() {
        System.out.println("Длина: " + length);
        System.out.println("Ширина: " + width);
        System.out.println("Высота: " + height);
        System.out.println("Цвет: " + color);
        System.out.println();
    }
}




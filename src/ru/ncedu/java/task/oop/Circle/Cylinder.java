package ru.ncedu.java.task.oop.Circle;

public class Cylinder extends Circle {
     private double height = 1.0;

     public  Cylinder(){
     }
     public Cylinder(double radius, double height){
         super(radius);
         this.height = height;
     }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public double getArea() {
         double baseSquare = 2*super.getArea();
         double rectangleSquare = 2*Math.PI*getRadius()*height;

        return baseSquare + rectangleSquare;
    }
    public double calculateVolume(){
         return super.getArea()*height;
    }

}
// при создании в левой части у нас ссылка и ее тип а в правой части там обьект в памяти
// ru.ncedu.java.task.oop.Circle.ru.ncedu.java.task.oop.Circle cylinder = new ru.ncedu.java.task.oop.Circle.Cylinder; т.е полиморфизм можем пользоваться ссылками которые родильсткого класса
// обьем не будет находится по ссылке ru.ncedu.java.task.oop.Circle.ru.ncedu.java.task.oop.Circle потому что будет использоваться только API который
// есть в ru.ncedu.java.task.oop.Circle.ru.ncedu.java.task.oop.Circle нужно приводить типы

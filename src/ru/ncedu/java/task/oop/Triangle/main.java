package ru.ncedu.java.task.oop.Triangle;

public class main {
    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle(4.8, 0, 0, 0, 0, 4.8);
        System.out.println(triangle.toString());
        System.out.println(triangle.getPerimetr());
        System.out.println(triangle.getType());
    }
}

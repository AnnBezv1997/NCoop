package ru.ncedu.java.task.oop2.Ball;

public class Main {
    public static void main(String[] args){
         Ball ball = new Ball(0,2,1,5,-60);
         Container container = new Container(0,0,15,15);
        System.out.println(ball.getX() +" "+ ball.getY());//  (1.0, 2.0)
        ball.move();
        System.out.println(ball.getX() +" "+ ball.getY());//  (3.5, 6.330127)
        System.out.println(container.collides(ball));     // true

    }
}

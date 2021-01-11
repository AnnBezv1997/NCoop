package ru.ncedu.java.task.oop2.Ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // Добавила конструктор по умолчанию он задает левую верхнюю точку контейнера(0.0)
    public Container(){
        this.x1 = 0;
        this.y1 = 0;
    }

    public Container(int x, int y, int width, int height) {
        x1 = x;
        y1 = y;
        x2 = x1 + width;
        y2 = y1 + height;
    }

    public int getX() {
        return x1;
    }
    public int getY() {
        return y1;
    }
    public int getWidth(){
        return (x2 - x1);
    }
    public int getHeight(){
        return (y2 - y1);
    }
    // сеттеров не было добавила сеттеры для правой нижней точки x2 y2 и левой верхней x1 x2
    public void setX2(int x2){
        this.x2 = x2;
    }
    public void setY2(int y2){
        this.y2 = y2;
    }
    public void setX1(int x1){
        this.x1 = x1;
    }
    public void setY1(int y1){
        this.y1 = y1;
    }

    private boolean collidesX(Ball ball){
        if(ball.getX()-ball.getRadius() >= this.x1){
            if(ball.getX() + ball.getRadius() <= this.x2){
                return true;
            }
        }
        return false;
    }

    private boolean collidesY(Ball ball){
        if(ball.getY()-ball.getRadius() >= this.y1){
            if(ball.getY() + ball.getRadius() <= this.y2){
                return true;
            }
        }
        return false;
    }

    public boolean collides(Ball ball){

        if ( collidesX(ball) && collidesY(ball) ){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Container[" + "(" + x1 + ", " + y1 + "),(" + x2 + ", " + y2 + ")]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Container container = (Container) o;
        return  x1 == container.x1 &&
                y1 == container.y1 &&
                x2 == container.x2 &&
                y2 == container.y2;
    }

    @Override
    public int hashCode() {
        int result = x1;
        result = 31 * result + y1;
        result = 31 * result + x2;
        result = 31 * result + y2;
        return result;
    }
}

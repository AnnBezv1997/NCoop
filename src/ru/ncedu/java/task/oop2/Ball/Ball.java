package ru.ncedu.java.task.oop2.Ball;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta =  speed*(float)Math.cos(Math.toRadians(direction));
        this.yDelta = -speed*(float)Math.sin(Math.toRadians(direction));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal(){
        x = -xDelta;
    }
    public void reflectVertical(){
        y = -yDelta;
    }

    @Override
    public String toString() {
        return "ru.ncedu.java.task.oop2.Ball[" + "(" + x + "," + y + ") , speed = (" + xDelta + "," + yDelta +") ]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;
        return  Float.compare(x, ball.x) == 0 &&
                Float.compare(y ,ball.y) == 0 &&
                radius == ball.radius &&
                Float.compare(xDelta, ball.xDelta) == 0 &&
                Float.compare(yDelta, ball.yDelta) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result +  Float.floatToIntBits(x);
        result = 31 * result + Float.floatToIntBits(y);
        result = 31 * result + radius;
        result = 31 * result + Float.floatToIntBits(xDelta);
        result = 31 * result + Float.floatToIntBits(yDelta);
        return result;
    }
}

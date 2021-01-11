package ru.ncedu.java.task.oop.Triangle;
// Заменила int'ты на double , чтобы можно было обнаружить равносторонний треугольник
public class MyPoint {
    private double x = 0;
    private double y = 0;

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double[] getXY(){
        double[] point ={ x, y};
        return point;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow((x - this.x),2) + Math.pow((y - this.y),2));
    }
    public double distance(MyPoint point){
        return Math.sqrt(Math.pow((point.x - this.x),2) + Math.pow((point.y - this.y),2));
    }
    public double distance(){
        return Math.sqrt(Math.pow((0 - this.x),2) + Math.pow((0 - this.y),2));
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPoint myPoint = (MyPoint) o;
        return(x == myPoint.x) && (y == myPoint.y);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

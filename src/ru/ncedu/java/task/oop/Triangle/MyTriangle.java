package ru.ncedu.java.task.oop.Triangle;

public class MyTriangle {
     private MyPoint v1 ;
     private MyPoint v2;
     private MyPoint v3;
    public MyTriangle(double x1, double y1,double x2, double y2,double x3, double y3) {
       this.v1 = new MyPoint(x1,y1);
       this.v2= new MyPoint(x2,y2);
       this.v3= new MyPoint(x3,y3);
    }
    public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
    }
    public double getPerimetr(){
        return v1.distance(v2)+ v2.distance(v3)+v3.distance(v1);
    }
    public String getType(){
       Double side1 = v1.distance(v2);
       Double side2 = v2.distance(v3);
       Double side3 = v3.distance(v1);
       if(side1.compareTo(side2) == 0 && side2.compareTo(side3) == 0 && side3.compareTo(side1) ==0){
           return Type.EQUILATERAL.toString();
       } else if (side1.compareTo(side2) == 0|| side2.compareTo(side3) == 0  || side3.compareTo(side1) ==0) {
           return Type.ISOSCELES.toString();
       } else{
           return Type.SCALENE.toString();
       }
    }
    public enum Type{
        EQUILATERAL,//РАВНОСТОРОННИЙ
        ISOSCELES, //РАВНОБЕДРЕННЫЙ
        SCALENE; //НЕРАВНОСТОРОННИЙ
        @Override
        public String toString() {
            if(this == EQUILATERAL) {
                return  "EQUILATERAL";
            }else if(this == ISOSCELES) {
                return  "ISOSCELES";
            }else {
                return  "SCALENE";
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyTriangle that = (MyTriangle) o;
        return v1.equals(that.v1) &&
                v2.equals(that.v2) &&
                v3.equals(that.v3);
    }

    @Override
    public int hashCode() {
        int result = v1 != null ? v1.hashCode() : 0;
        result = 31 * result + (v2 != null ? v2.hashCode() : 0);
        result = 31 * result + (v3 != null ? v3.hashCode() : 0);
        return result;
    }
}

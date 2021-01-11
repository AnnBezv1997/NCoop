package ru.ncedu.java.task.oop2.MyComplex;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real,double imag ) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real,double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if(imag < 0){
            stringBuilder.append("( " +real+ imag+"i)");
        }else if(imag >= 0) {
            stringBuilder.append("( " +real+ " + " + imag+"i)");
        }
        String complex = stringBuilder.substring(0);
        return complex;
    }
    public boolean isReal(){
        return real != 0;

    }
    public boolean isImaginary(){
        return imag != 0;
    }
    public boolean equals(double real, double imag){
        Double treal = this.real;
        Double timag = this.imag;
        if(treal.compareTo(real) == 0 && timag.compareTo(imag) == 0){
            return true;
        }else {
            return false;
        }
    }
    public boolean equals(MyComplex another){
        Double treal = this.real;
        Double timag = this.imag;
        if(treal.compareTo(another.real)==0 && timag.compareTo(another.imag)==0){
            return true;
        }else {
             return false;
        }
    }
    public double magnitude(){
        return Math.sqrt(Math.pow(this.real,2)+ Math.pow(this.imag,2));
    }
    public double argument(){
        if (this.real > 0){
            return Math.atan(imag/real);
        }else {
            if(this.real < 0 && this.imag > 0){
                return Math.PI + Math.atan(imag/real);
            }else {
                return -Math.PI + Math.atan(imag/real);
            }
        }
    }
    public MyComplex add (MyComplex right){
      this.real+=right.real;
      this.imag+=right.imag;
      return this;
    }
    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real+=right.real,this.imag+=right.imag);
    }
    public MyComplex subtract (MyComplex right){
        this.real-=right.real;
        this.imag-=right.imag;
        return this;
    }
    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(this.real-=right.real,this.imag-=right.imag);
    }
    public  MyComplex multiply(MyComplex right){
        this.real = this.real*right.real - this.imag*right.imag;
        this.imag = this.real*right.imag + this.imag*right.real;
        return this;
    }
    public MyComplex divide(MyComplex right){
        this.real = (this.real*right.real + this.imag*right.imag)/(Math.pow(this.real,2)+Math.pow(this.imag,2));
        this.imag = (this.real*right.imag - this.imag*right.real)/(Math.pow(this.real,2)+Math.pow(this.imag,2));
        return this;
    }
    public MyComplex conjugate(){
        return new MyComplex(this.real, - this.imag);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyComplex myComplex = (MyComplex) o;
        return (Double.compare(real, myComplex.real) != 0)
                && Double.compare(imag, myComplex.imag) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(real);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(imag);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

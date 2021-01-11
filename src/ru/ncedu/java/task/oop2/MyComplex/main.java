package ru.ncedu.java.task.oop2.MyComplex;

public class main {
    public static void main(String[] args){
        MyComplex complex = new MyComplex();
        MyComplex complex1= new MyComplex(-2,-3);
        MyComplex complex2 = new MyComplex(5,2);
        System.out.println(complex.toString());
        System.out.println(complex1.toString());
        System.out.println(complex2.toString());
        System.out.println(complex.isReal());
        System.out.println(complex1.isReal());
        System.out.println(complex.isImaginary());
        System.out.println(complex1.conjugate());

    }
}

package ru.ncedu.java.task.oop2.MyPolynomial;

public class main {
    public static void main(String[] args) {
        double[] coef = {-2,0,2,1};
        double[] corf2 = {4,3,1,1};
        MyPolynomial polynomial = new MyPolynomial(coef);
        MyPolynomial polynomial1 = new MyPolynomial(corf2);
        System.out.println(polynomial.toString());
        System.out.println(polynomial.multiply(polynomial1));
        //System.out.println(coef[0]);
    }

}

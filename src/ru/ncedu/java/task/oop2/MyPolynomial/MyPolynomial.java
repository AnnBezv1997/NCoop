package ru.ncedu.java.task.oop2.MyPolynomial;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;


    public MyPolynomial(double[] coeffs) {
        this.coeffs = new double [coeffs.length];
        for (int i=0;i<this.coeffs.length;i++) {
            this.coeffs[i] = coeffs[coeffs.length-1-i];
        }
    }

    public int getDegree(){
        return coeffs.length-1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int degree = getDegree();
        for(int i = degree;i >= 0 ;i--) {
            if(coeffs[i] == 0){
                continue;
            }
            if (coeffs[i] > 0 && i != degree) {
                stringBuilder.append("+");
            }
            stringBuilder.append(coeffs[i]);
            if(i ==  1){
             stringBuilder.append("x");
            }else if (i!= 0){
              stringBuilder.append("x^" +i);
             }
        }
        String polunomial = stringBuilder.substring(0);
        return polunomial;
    }

    public double evaluate(double x){
        int degree = getDegree();
        double eval = 0;
        for (int i = degree; i >= 0; i--){
            eval=coeffs[i]+ (x*eval);
        }
        return eval;
    }

    public MyPolynomial add(MyPolynomial right){
        MyPolynomial polynomial = this;
       if(polynomial.getDegree()<right.getDegree()){
           polynomial = right;
           right = this;
       }
       double[] polynomialCoeffs = polynomial.coeffs;
       double[] rightCoeffs = right.coeffs;
       for(int i = 0; i < polynomialCoeffs.length; i++){
           if(i > rightCoeffs.length-1){
               continue;
           }
           polynomialCoeffs[i] += rightCoeffs[i];
       }
       return new MyPolynomial(polynomialCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right){
        double[] polynomialCoeffs = new double[this.getDegree()+right.getDegree()+1];
        double[] rightCoeffs = right.coeffs;
        for(int i = 0; i< polynomialCoeffs.length; i++){
            double newCoeff = 0.0;
            for(int j=0; j<= i; j++){
                if(j > coeffs.length-1){
                    continue;
                }
                if(i-j > rightCoeffs.length-1){
                    continue;
                }
                newCoeff += coeffs[j]*rightCoeffs[i-j];
            }
            polynomialCoeffs[i] = newCoeff;
        }
        return new MyPolynomial(polynomialCoeffs);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyPolynomial that = (MyPolynomial) o;

        return Arrays.equals(coeffs, that.coeffs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffs);
    }
}

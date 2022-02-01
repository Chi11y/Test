package com.UnitTest.Learning;

public class Calculator{

    public int add(int a, int b){
return a + b;
    }

    public int subtract(int a, int b){
        return a-b;

    }

    public int multiply(int a, int b){
        return a*b;

    }

    public int divide(int a, int b){
        return a/b;

    }

    public int subtractThenMultiply(int a, int b, int c, int d) {
        return a - b + c * d;
    }

    public int addThenSubtract(int a, int b, int c, int d) {
        return a + b + c - d;
    }

  public int multiplyThenSubtract(int a, int b, int c) {
    return (a * b) - c;
        }

    public int multiplyThenDivide(int a, int b, int c) {
        return (a * b) / c;
    }

    public int addThenMultiplyThenDivide(int a, int b, int c, int d) {
        return (a + b) * c / d;
    }
}

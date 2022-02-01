package com.UnitTest.Learning;

public class Main {

  public static void main(String[] args) {

      Calculator calc = new Calculator();
      System.out.println(calc.add(3, 10));
      System.out.println(calc.subtract(10, 3));
      System.out.println(calc.multiply(10,3));
      System.out.println(calc.divide(10, 5));
      System.out.println(calc.multiplyThenSubtract(10, 10, 5));

      Name name = new Name();
      name.firstName("Callum");
      name.middleName("Mitchell");
      name.lastName("Hill");
      System.out.println(name.fullName("Callum", "Mitchell", "Hill"));
      System.out.println(name.firstName("Hibs"));

      System.out.println(calc.multiplyThenDivide(10, 10, 10));

  }
}

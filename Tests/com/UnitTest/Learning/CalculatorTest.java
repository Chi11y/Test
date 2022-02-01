package com.UnitTest.Learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  // Triple A pattern
  // arrange - set up test objects
  // act - do the actual calc
  // assert - check if actual val is equal to expected

  @Test
  void add() {
    // Arrange
    Calculator calc = new Calculator(); // arrange
    // Act
    int actualValue = calc.add(3, 10); // act
    int expectedValue = 3 + 10;
    // Assert
    Assertions.assertEquals(expectedValue, actualValue);
  }

  @Test
  void subtract() {

    Calculator calc = new Calculator();

    int actualValue = calc.subtract(50, 10);
    int expectedValue = 40;

    Assertions.assertEquals(actualValue, expectedValue);
  }

  @Test
  void multiply() {

    Calculator calc = new Calculator();

    int actualValue = calc.multiply(10, 5);
    int expectedValue = 50;

    Assertions.assertEquals(actualValue, expectedValue);
  }

  @Test
  void divide() {

    Calculator calc = new Calculator();

    int actualValue = calc.divide(50, 10);
    int expectedValue = 5;

    Assertions.assertEquals(actualValue, expectedValue);
  }

  @Test
  void subtractThenMultiply() {
    Calculator calc = new Calculator();

    int actualValue = calc.subtractThenMultiply(10, 5, 2, 2);
    int expectedValue = 10 - 5 + 2 * 2;

    Assertions.assertEquals(expectedValue, actualValue);
  }

  @Test
  void addThenSubtract() {
    Calculator calc = new Calculator();

    int actualValue = calc.addThenSubtract(10, 10, 10, 5);
    int expectedValue = 10 + 10 + 10 - 5;

    Assertions.assertEquals(expectedValue, actualValue);
  }

  @Test
  void multiplyThenSubtract(){
    Calculator calc = new Calculator();

    int actualValue  = calc.multiplyThenSubtract(10, 10, 5);
    int expectedValue = (10 * 10 - 5);

    Assertions.assertEquals(expectedValue, actualValue);
  }

  @Test
  void multiplyThenDivide(){
    Calculator calc = new Calculator();

    int actualValue = calc.multiplyThenDivide(10, 10, 10);
    int expectedValue = (10 * 10 / 10);

    Assertions.assertEquals(expectedValue, actualValue);

  }

}

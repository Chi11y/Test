package com.UnitTest.Learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NameTest {

  @Test
  void firstName() {

    Name name = new Name();
    String expectedName = name.firstName("Callum");
    String actualName = "Callum";

    Assertions.assertEquals(expectedName, actualName);
  }
  @Test
  void lastName(){

   Name name = new Name();

    String expectedName = name.lastName("Hill");
    String actualName = "Hill";

    Assertions.assertEquals(expectedName, actualName);

  }

  @Test
  void middleName(){

    Name name = new Name();

    String expectedName = name.middleName("Mitchell");
    String actualName = "Mitchell";

    Assertions.assertEquals(expectedName, actualName);
  }

  @Test
  void fullName(){
    Name name = new Name();

    String expectedName = name.fullName("Callum", "Mitchell", "Hill");
    String actualName = "Callum Mitchell Hill";

    Assertions.assertEquals(expectedName, actualName);
  }
}
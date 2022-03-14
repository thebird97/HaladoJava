import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class MainTestTest {
  @Test
    public void demoTest(){
      assertEquals(4,Main.mvalue());
  }

}
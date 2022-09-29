import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import org.junit.Test;

import LetterRange.Main;


public class MainTest {
  
  private Main m = new Main();

  @Test
  public void testLetterRange() {
    assertThat(m.configString("A S df"), containsString("asdf"));
    assertThat(m.configString("  abC D"), containsString("abcd"));
    assertThat(m.configString("sPa  q"), containsString("spaq"));
    assertThat(m.configString(" lh JQ "), containsString("lhjq"));
    
  }

}

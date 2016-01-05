import org.junit.*;
import static org.junit.Assert.*;

public class LeetSpeakTest {

  @Test
  public void leetSpeak_returnsAStringAsIsWhenNoLeetSpeakIsPresent_wordDoesntChange() {
  leetSpeak userInput = new leetSpeak();
  assertEquals("happy", userInput.leetSpeak("happy"));
    }
    
    @Test
  public void leetspeak_replacesEveryEInAStringWithA3_wordChanges() {
    AppName yourApp = new AppName();
    assertEquals("3l3phant", yourApp.leetspeak("elephant"));
  }

}

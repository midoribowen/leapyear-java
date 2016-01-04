import java.util.ArrayList;
import java.util.Arrays;

import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void pingPong_forAllNumbersFromOneToGivenNumber_outputNumber() {
    PingPong pingPong = new PingPong();
    assertEquals(new ArrayList<>(Arrays.asList("1", "2")), pingPong.pingPong(2));
  }

  @Test
  public void pingPong_forNumbersDivisibleByThree_returnPing() {
    PingPong pingPong = new PingPong();
    assertEquals(new ArrayList<>(Arrays.asList("1", "2","ping", "4")), pingPong.pingPong(4));
  }
}

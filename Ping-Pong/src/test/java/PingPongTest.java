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

  @Test
  public void pingPong_forNumbersDivisibleByFive_returnPong() {
    PingPong pingPong = new PingPong();
    assertEquals(new ArrayList<>(Arrays.asList("1", "2", "ping", "4", "pong", "ping")), pingPong.pingPong(6));
  }

  @Test public void pingPong_forNumbersDivisibleByFifteen_returnPingPong() {
    PingPong pingPong = new PingPong();
    assertEquals(new ArrayList<>(Arrays.asList("1", "2", "ping", "4", "pong", "ping", "7", "8", "ping", "pong", "11", "ping", "13", "14", "ping pong", "16")), pingPong.pingPong(16));
  }
}

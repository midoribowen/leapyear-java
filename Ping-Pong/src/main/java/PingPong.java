import java.util.ArrayList;
import java.util.Arrays;

public class PingPong {
  public static void main(String[] args) {}

    public ArrayList<String> pingPong(Integer number) {
      ArrayList<String> results = new ArrayList<String>();

      for ( Integer i = 1 ; i <= number ; i++ ) {
        if ( i % 3 == 0 ) {
          results.add("ping");
        } else {
          results.add(Integer.toString(i));
        }
      }
      return results;
    }
}

package Draw_With_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class Draw {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(reader.readLine());

    draw(count);
  }

  private static void draw(int count) {
    //bottom
    if (count <= 0) {
      return;
    }
    //pre action
    System.out.println(String.join("", Collections.nCopies(count, "*")));
    //recursion
    draw(count - 1);
    //pos action
    System.out.println(String.join("", Collections.nCopies(count, "+")));
  }
}
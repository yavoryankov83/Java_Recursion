package Calculate_Factoriel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateFactoriel {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(reader.readLine());

    long factoriel = calcFactoriel(num);
    System.out.println(factoriel);
  }

  private static long calcFactoriel(int num) {
    //bottom
    if (num == 0) {
      return 1;
    } else {
      return num * calcFactoriel(num - 1);
    }
  }
}

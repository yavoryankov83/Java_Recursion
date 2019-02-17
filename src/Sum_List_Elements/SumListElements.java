package Sum_List_Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumListElements {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> input = readInput(reader);

    int sum = sum(input, 0);

    System.out.println(sum);
  }

  private static List<Integer> readInput(BufferedReader reader) throws IOException {
    return Arrays.stream(reader.readLine()
            .split("\\s+"))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
  }

  private static int sum(List<Integer> input, int index) {
    //bottom
    if (index == input.size() - 1) {
      return input.get(index);
    } else {
      return input.get(index) + sum(input, index + 1);
    }
  }
}

package Directory_Path;

import java.io.File;

public class DirectoryPath {
  public static void main(String[] args) {
    String path = "//home//yavor//Java";

    dfs(path);
  }

  private static void dfs(String path) {
    File root = new File(path);

    for (File file : root.listFiles()) {
      if (file.isDirectory()){
        System.out.println("Dir: " + file.getAbsolutePath());
        dfs(file.getPath());
      } else {
        System.out.println(" ---> File: " + file.getAbsolutePath());
      }
    }
  }
}

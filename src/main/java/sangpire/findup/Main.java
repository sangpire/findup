package sangpire.findup;

import java.io.File;

public class Main {
  public static void main(String[] args) {
    File rootDir = new File("D:\\");
    Worker worker = new Worker(rootDir);
    worker.cleanUp();
  }
}

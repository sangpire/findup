package sangpire.findup;

import java.io.File;

public class Main {
  public static void main(String[] args) {
    File rootDir = new File("D:\\");
    Travler travler = new Travler();
    travler.visit(rootDir);
  }
}

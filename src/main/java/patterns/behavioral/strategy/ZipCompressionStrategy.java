package patterns.behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

public class ZipCompressionStrategy implements CompressionStrategy {
  public int compressFiles(ArrayList<File> files) {
    return 2;
  }
}

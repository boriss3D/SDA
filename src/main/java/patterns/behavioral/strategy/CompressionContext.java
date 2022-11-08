package patterns.behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

public class CompressionContext {

  private CompressionStrategy strategy;

  public void setCompressionStrategy
          (CompressionStrategy strategy) {
    this.strategy = strategy;
  }
  public int createArchive(ArrayList<File> files) {
      return strategy.compressFiles(files);
  }
}

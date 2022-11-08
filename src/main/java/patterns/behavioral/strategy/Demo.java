package patterns.behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

public class Demo {
  public static void main(String[] args) {
    CompressionContext ctx = new CompressionContext();

    ctx.setCompressionStrategy(new ZipCompressionStrategy());
    ArrayList<File> fileList = new ArrayList<>();
    File file = new File("Test");
    fileList.add(file);
    System.out.println(ctx.createArchive(fileList));

    ctx.setCompressionStrategy(new RarCompressionStrategy());
    System.out.println(ctx.createArchive(fileList));

    ctx.setCompressionStrategy(new SevenCompressionStrategy());
    System.out.println(ctx.createArchive(fileList));
  }
}

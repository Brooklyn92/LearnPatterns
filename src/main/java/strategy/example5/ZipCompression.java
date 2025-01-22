package strategy.example5;

public class ZipCompression implements Compression {
    @Override
    public void compress(String file) {
        System.out.println("ZIP DONE: " + file);
    }
}

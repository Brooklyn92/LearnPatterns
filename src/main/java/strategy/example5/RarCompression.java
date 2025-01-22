package strategy.example5;

public class RarCompression implements Compression {
    @Override
    public void compress(String file) {
        System.out.println("RAR DONE: " + file);
    }
}

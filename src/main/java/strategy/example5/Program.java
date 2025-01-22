package strategy.example5;

public class Program {
    public static void main(String[] args) {
//        Compressor compressor = new Compressor(new RarCompression());
        Compressor compressor = new Compressor(new ZipCompression());
        compressor.compress("Voina i mir.txt");
    }
}

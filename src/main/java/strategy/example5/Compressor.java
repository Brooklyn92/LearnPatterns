package strategy.example5;

public class Compressor {
    private final Compression compression;

    public Compressor(Compression compression) {
        this.compression = compression;
    }

    public void compress(String file) {
        compression.compress(file);
    }
}

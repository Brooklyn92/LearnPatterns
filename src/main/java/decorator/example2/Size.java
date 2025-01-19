package decorator.example2;

public enum Size {
    TALL(0.10),
    GRANDE(0.15),
    VENTI(0.20);

    private final double priceSize;

    Size(double priceSize) {
        this.priceSize = priceSize;
    }

    public double getPriceSize() {
        return priceSize;
    }
}

package decorator.example2;

public abstract class Beverage {
    String description = "Unknown Beverage";
    Size size = Size.TALL;
    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}

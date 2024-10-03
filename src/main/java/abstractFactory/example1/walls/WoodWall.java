package abstractFactory.example1.walls;

public class WoodWall implements Wall {
    @Override
    public void build() {
        System.out.println("Собрали деревянные стены");
    }
}

package abstractFactory.example1.roofs;

public class TileRoof implements  Roof {
    @Override
    public Roof cover() {
        System.out.println("Покрыли крышу из черепицы");
        return this;
    }

    @Override
    public void waterProtect() {
        System.out.println("Сделали гидроизоляцию черепичной крыши");
    }
}

package abstractFactory.example1.roofs;

public class WoodRoof implements  Roof {
    @Override
    public Roof cover() {
        System.out.println("Покрыли деревянную крышу");
        return this;
    }

    @Override
    public void waterProtect() {
        System.out.println("Сделали гидроизоляцию деревянной крыши");
    }
}

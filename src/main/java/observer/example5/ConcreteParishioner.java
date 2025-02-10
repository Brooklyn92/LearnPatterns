package observer.example5;

public class ConcreteParishioner implements Parishioner {
    private final String name;

    public ConcreteParishioner(String name, Church church) {
        this.name = name;
        church.registerParishioner(this);

    }

    @Override
    public void update(String newsChurch) {
        System.out.println(name + " узнал новость: " + newsChurch);
    }
}

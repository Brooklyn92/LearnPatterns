package singleton.example1;

public class SingletonExample1 {

    public SingletonExample1() {
    }

    private static class SingletonHolder {
        public static final SingletonExample1 HOLDER_INSTANCE = new SingletonExample1();
    }

    public static SingletonExample1 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}

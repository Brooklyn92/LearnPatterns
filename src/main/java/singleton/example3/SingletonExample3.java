package singleton.example3;

public class SingletonExample3 {
    private static SingletonExample3 INSTANCE;

    private SingletonExample3() {
    }

    public static synchronized SingletonExample3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonExample3();
        }
        return INSTANCE;
    }
}

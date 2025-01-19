package singleton.example2;

public class SingletonExample2 {
    private static SingletonExample2 INSTANCE;

    private SingletonExample2() {
    }

    public static SingletonExample2 getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonExample2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonExample2();
                }
            }
        }
        return INSTANCE;
    }
}

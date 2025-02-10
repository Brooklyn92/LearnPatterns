package observer.example3;

public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Михаил");
        Observer observer2 = new ConcreteObserver("Пётр");
        Observer observer3 = new ConcreteObserver("Маша");

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        pause();

        subject.notifyObservers();

    }

    private static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

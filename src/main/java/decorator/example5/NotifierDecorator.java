package decorator.example5;

// Базовый декоратор, который оборачивает Notifier
public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappedNotified;

    public NotifierDecorator(Notifier wrappedNotified) {
        this.wrappedNotified = wrappedNotified;
    }

    @Override
    public void send(String message) {
        wrappedNotified.send(message);
    }
}

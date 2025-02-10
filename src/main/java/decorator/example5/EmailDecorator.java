package decorator.example5;

public class EmailDecorator extends NotifierDecorator {

    public EmailDecorator(Notifier wrappedNotified) {
        super(wrappedNotified);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendEmail(message);
    }

    private void sendEmail(String message) {
        System.out.println("Отправка Email: " + message);
    }
}

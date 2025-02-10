package decorator.example5;

// Конкретный декоратор для добавления функциональности
public class SmsDecorator extends NotifierDecorator {

    public SmsDecorator(Notifier wrappedNotified) {
        super(wrappedNotified);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSms(message);
    }

    private void sendSms(String message) {
        System.out.println("Отправка SMS: " + message);
    }
}

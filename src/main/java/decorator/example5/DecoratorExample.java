package decorator.example5;

public class DecoratorExample {
    public static void main(String[] args) {
        // Базовый компонент
        Notifier notifier = new BasicNotifier();

        // Декорируем отправку сообщений Sms и Email
        Notifier smsAndEmailNotifier = new SmsDecorator(new EmailDecorator(notifier));

        smsAndEmailNotifier.send("Это важное сообщение");
    }
}


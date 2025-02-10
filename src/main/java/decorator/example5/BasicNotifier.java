package decorator.example5;

// Конкретный компонент
public class BasicNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Отправка сообщения: " + message);
    }
}

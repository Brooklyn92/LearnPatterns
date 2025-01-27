package observer.example2;

public class Program {
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();

        Subscriber subscriber1 = new Subscriber("Иван");
        Subscriber subscriber2 = new Subscriber("Анна");

        // Подписчики подписываются на обновления
        newsPublisher.addObserver(subscriber1);
        newsPublisher.addObserver(subscriber2);

        // Отправка новостей
        newsPublisher.setNews("Вышел новый выпуск газеты!");
        newsPublisher.setNews("Утром ожидается дождь.");

        // Один из подписчиков отписывается
        newsPublisher.removeObserver(subscriber1);

        // Новое уведомление только для оставшихся подписчиков
        newsPublisher.setNews("Подписка на журнал обновлена.");
    }
}

package observer.example5;

public class Main {
    public static void main(String[] args) {
        CatholicChurch church = new CatholicChurch();

        Parishioner parishioner1 = new ConcreteParishioner("Мартин Лютер", church);
        Parishioner parishioner2 = new ConcreteParishioner("Жан Кальвин", church);

        church.setNewsChurch("Инквизиция была ошибкой... месса Mea Culpa 12 марта 2000 года");
    }

}

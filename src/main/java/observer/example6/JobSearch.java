package observer.example6;

public class JobSearch {
    public static void main(String[] args) {
        JavaDevJobSite javaDevJobSite = new JavaDevJobSite();
        javaDevJobSite.addVacancy("First Java Position");
        javaDevJobSite.addVacancy("Second Java Position");

        Observer firstSubscriber =  new Subscriber("Евгений Семёнов");
        Observer secondSubscriber =  new Subscriber("Петр Романенко");

        javaDevJobSite.addObserver(firstSubscriber);
        javaDevJobSite.addObserver(secondSubscriber);

        javaDevJobSite.addVacancy("Third Java Position");

        javaDevJobSite.removeVacancy("First Java Position");

    }
}

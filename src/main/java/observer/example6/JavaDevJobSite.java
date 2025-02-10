package observer.example6;

import java.util.ArrayList;
import java.util.List;

public class JavaDevJobSite implements Observed {
    List<String> vacancies = new ArrayList<>();
    List<Observer> subscribers  = new ArrayList<>();

    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyObservers();
    }


    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribers) {
            observer.handleEvent(this.vacancies);
        }
    }
}

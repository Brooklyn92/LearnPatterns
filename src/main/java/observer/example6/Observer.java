package observer.example6;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}

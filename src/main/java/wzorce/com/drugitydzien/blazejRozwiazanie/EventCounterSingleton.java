package wzorce.com.drugitydzien.blazejRozwiazanie;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventCounterSingleton {

    private List<String> eventsList = new ArrayList<>();
    private static EventCounterSingleton instance;

    private EventCounterSingleton() {
    }

    public static EventCounterSingleton getInstance() {
        if (instance == null) { //tworzony przy pierwszym włączeniu, tzw lazy
            instance = new EventCounterSingleton();
        }
        return instance;
    }

    public List<String> getEventsList() {
        return eventsList;
    }

    public List<String> addEvent (String event) {
        eventsList.add(LocalDateTime.now() + " : " + event) ;
        return eventsList;
    }

    @Override
    public String toString() {
        return "EventCounterSingleton{" +
                "eventsList=" + eventsList +
                '}';
    }
}

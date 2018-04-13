package Room;

public class ConferenceRoom extends Room {

    String name;
    int dailyRate;

    public ConferenceRoom(int capacity, String name, int dailyRate) {
        super(capacity);
        this.name = name;
        this.dailyRate = dailyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }
}

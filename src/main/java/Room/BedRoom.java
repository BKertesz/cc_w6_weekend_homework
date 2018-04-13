package Room;

public class BedRoom extends Room {

    private int roomNumber;
    private bedRoomType type;

    public BedRoom(int capacity, int roomNumber, bedRoomType type) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.type = type;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public bedRoomType getType() {
        return type;
    }

    public void setType(bedRoomType type) {
        this.type = type;
    }

    public int getRoomPrice(){
        return type.getPrice();
    }
}

package Room;

public enum bedRoomType {

    SINGLE(45),
    TWIN(65),
    DOUBLE(65),
    TRIPLE(85),
    FAMILY(95);


    private int price;

    bedRoomType(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

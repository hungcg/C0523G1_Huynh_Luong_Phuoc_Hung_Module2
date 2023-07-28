package ss25_case_study.model.facility;

public class House extends Facility{
    private String roomStandard;
    private int quantityOfFloor;
    public House(){

    }

    public House(int serviceID, String serviceName, double area, int price, int capacityOfRoom, String rentalType, String roomStandard, int quantityOfFloor) {
        super(serviceID, serviceName, area, price, capacityOfRoom, rentalType);
        this.roomStandard = roomStandard;
        this.quantityOfFloor = quantityOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getQuantityOfFloor() {
        return quantityOfFloor;
    }

    public void setQuantityOfFloor(int quantityOfFloor) {
        this.quantityOfFloor = quantityOfFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", quantityOfFloor=" + quantityOfFloor +
                '}';
    }
}

package ss25_case_study.model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int quantityOfFloor;
    public Villa(){

    }

    public Villa(String serviceID, String serviceName, String area, String price, String capacityOfRoom, String rentalType,String roomStandard, double poolArea, int quantityOfFloor) {
        super(serviceID, serviceName, area, price, capacityOfRoom, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.quantityOfFloor = quantityOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getQuantityOfFloor() {
        return quantityOfFloor;
    }

    public void setQuantityOfFloor(int quantityOfFloor) {
        this.quantityOfFloor = quantityOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", quantityOfFloor=" + quantityOfFloor +
                '}';
    }
}

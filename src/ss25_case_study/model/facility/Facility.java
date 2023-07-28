package ss25_case_study.model.facility;

public abstract class Facility  {
    protected int serviceID;
    protected String serviceName;
    protected double area;
    protected int price;
    protected int capacityOfRoom;
    protected String rentalType;

    public Facility() {

    }

    public Facility(int serviceID, String serviceName, double area, int price, int capacityOfRoom, String rentalType) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.capacityOfRoom = capacityOfRoom;
        this.rentalType = rentalType;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCapacityOfRoom() {
        return capacityOfRoom;
    }

    public void setCapacityOfRoom(int capacityOfRoom) {
        this.capacityOfRoom = capacityOfRoom;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceID=" + serviceID +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", capacityOfRoom=" + capacityOfRoom +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
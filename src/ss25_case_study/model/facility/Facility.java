package ss25_case_study.model.facility;

public abstract class Facility  {
    protected String serviceID;
    protected String serviceName;
    protected String area;
    protected String price;
    protected String capacityOfRoom;
    protected String rentalType;

    public Facility() {

    }

    public Facility(String serviceID, String serviceName, String area, String price, String capacityOfRoom, String rentalType) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.capacityOfRoom = capacityOfRoom;
        this.rentalType = rentalType;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCapacityOfRoom() {
        return capacityOfRoom;
    }

    public void setCapacityOfRoom(String capacityOfRoom) {
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
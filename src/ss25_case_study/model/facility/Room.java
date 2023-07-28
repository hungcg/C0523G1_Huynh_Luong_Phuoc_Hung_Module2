package ss25_case_study.model.facility;

public class Room extends Facility{
    private String focService;
    public Room(){

    }

    public Room(int serviceID, String serviceName, double area, int price, int capacityOfRoom, String rentalType, String focService) {
        super(serviceID, serviceName, area, price, capacityOfRoom, rentalType);
        this.focService = focService;
    }

    public String getFocService() {
        return focService;
    }

    public void setFocService(String focService) {
        this.focService = focService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "focService='" + focService + '\'' +
                '}';
    }
}

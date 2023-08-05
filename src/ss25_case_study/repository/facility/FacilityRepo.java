package ss25_case_study.repository.facility;

import ss25_case_study.model.facility.Facility;
import ss25_case_study.model.facility.House;
import ss25_case_study.model.facility.Room;
import ss25_case_study.model.facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepo implements IFacilityRepo {
    public static final String VILLA_PROFILE = "D:\\C0523G1_Huynh_Luong_Phuoc_Hung_Module2\\src\\ss25_case_study\\data\\villaReadAndWrite.csvxz";
    public static final String HOUSE_PROFILE = "D:\\C0523G1_Huynh_Luong_Phuoc_Hung_Module2\\src\\ss25_case_study\\data\\houseReadAndWrite.csv";
    public static final String ROOM_PROFILE = "D:\\C0523G1_Huynh_Luong_Phuoc_Hung_Module2\\src\\ss25_case_study\\data\\roomReadAndWrite.csv";
    public static Map<Facility, Integer> facilityList = new LinkedHashMap<Facility, Integer>();

    static {
        if (facilityList.size() == 0) {
            Villa villa = new Villa("SVVL-", "oceanvilla", "50.0", "4000", "6", "year", "vip", 35.0, 3);
            House house = new House("SVHO-", "luxuryhouse", "40.0", "4000", "7", "year", "vip", 3);
            Room room = new Room("SVRO-", "viproom", "30.0", "4000", "12", "year", "dancer in the room");
            facilityList.put(villa, 4);
            facilityList.put(house, 5);
            facilityList.put(room, 6);
        }
    }

    public Map<Facility, Integer> villaDisplay() {
        Map<Facility, Integer> facilityVilla = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()) {
            if (facility.getKey() instanceof Villa) {
                facilityVilla.put(facility.getKey(), facility.getValue());
            }
        }
        return facilityVilla;
    }

    public Map<Facility, Integer> houseDisplay() {
        Map<Facility, Integer> facilityHouse = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()) {
            if (facility.getKey() instanceof House) {
                facilityHouse.put(facility.getKey(), facility.getValue());
            }
        }
        return facilityHouse;
    }

    public Map<Facility, Integer> roomDisplay() {
        Map<Facility, Integer> facilityRoom = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()) {
            if (facility.getKey() instanceof Room) {
                facilityRoom.put(facility.getKey(), facility.getValue());
            }
        }
        return facilityRoom;
    }


    public void addVilla(Villa villa, Integer integer) {
        facilityList.put(villa, integer);
    }

    @Override
    public void addHouse(House house, Integer integer) {
        facilityList.put(house, integer);

    }

    @Override
    public void addRoom(Room room, Integer integer) {
        facilityList.put(room, integer);
    }


    public void deleteVilla(Villa id) {
        facilityList.remove(id);
    }

    @Override
    public void deleteHouse(House key) {
        facilityList.remove(key);
    }

    @Override
    public void deleteRoom(Room key) {
        facilityList.remove(key);
    }

    @Override
    public void deleteFacility(Facility key) {
        facilityList.remove(key);
    }

    @Override
    public void displayListMaintainance() {
        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityList.entrySet()) {
            if (facilityIntegerEntry.getValue() < 5) {
                if (facilityIntegerEntry.getKey() instanceof Villa) {
                    System.out.println("The Villa is under maintenance, please come back later!!!!");
                } else if (facilityIntegerEntry.getKey() instanceof House) {
                    System.out.println("The House is under maintenance, please come back later!!!!");
                } else {
                    System.out.println("The Room is under maintenance, please come back later!!!!");
                }
            } else {
                System.out.println("Has been used for 5 times, please maintain!!!");
            }
        }
    }

    @Override
    public Facility searchKey() {
        return null;
    }


    @Override
    public Facility searchKey(String id) {
        for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()) {
            if (entry.getKey().getServiceID().equals(id)) {
                return entry.getKey();
            }
        }
        return null;
    }
}



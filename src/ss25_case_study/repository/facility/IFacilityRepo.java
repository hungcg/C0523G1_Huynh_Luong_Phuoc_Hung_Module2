package ss25_case_study.repository.facility;

import ss25_case_study.model.facility.Facility;
import ss25_case_study.model.facility.House;
import ss25_case_study.model.facility.Room;
import ss25_case_study.model.facility.Villa;

import java.awt.*;
import java.util.Map;

public interface IFacilityRepo {
    Map<Facility, Integer> villaDisplay();

    Map<Facility, Integer> houseDisplay();

    Map<Facility, Integer> roomDisplay();

    void addHouse(House house, Integer integer);

    void addRoom(Room room, Integer integer);

    void addVilaa(Villa villa, Integer integer);

    void deleteHouse(House key);

    void deleteRoom(Room key);

    void deleteFacility(Facility key);

    void displayListMaintainance();

    Facility searchKey();

    Facility searchKey(String id);
}

package ss25_case_study.repository.facility;

import ss25_case_study.model.facility.Facility;

import java.util.Map;

public interface IFacilityRepo {
    Map<Facility, Integer> villaDisplay();

    Map<Facility, Integer> houseDisplay();

    Map<Facility, Integer> roomDisplay();

    void add(Facility facility);

    void delete();

    void displayListMaintainance();
}

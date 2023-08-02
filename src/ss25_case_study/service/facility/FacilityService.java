package ss25_case_study.service.facility;

import ss25_case_study.model.facility.Facility;
import ss25_case_study.repository.facility.FacilityRepo;
import ss25_case_study.repository.facility.IFacilityRepo;

import java.util.Map;

public class FacilityService implements IFacilityService {
    static IFacilityRepo repository = new FacilityRepo();

    @Override
    public void displayAll() {
        Map<Facility,Integer> facilityVilla = repository.villaDisplay();



    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void displayListMaintainance() {

    }
}

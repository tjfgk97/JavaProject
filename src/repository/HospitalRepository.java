package repository;

import dto.HospitalDTO;

import java.util.ArrayList;
import java.util.List;

public class HospitalRepository {
    private static List<HospitalDTO> hospitalDTOList = new ArrayList<>();

    public boolean insertVaccine(HospitalDTO hospitalDTO) {
        return hospitalDTOList.add(hospitalDTO);
    }

    public boolean updateVaccine(String updateVaccine, String updateVaccineCount) {
        for (int i = 0; i < hospitalDTOList.size(); i++) {
            if(updateVaccine.equals(hospitalDTOList.get(i).getVaccineName())){
                hospitalDTOList.get(i).setVaccineCount(updateVaccineCount);
                return true;
            }
        }
        System.out.println("해당 백신이 존재하지 않습니다.");
        return false;
    }
}

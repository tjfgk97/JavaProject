package service;

import dto.HospitalDTO;
import repository.HospitalRepository;

import java.util.Scanner;

public class HospitalService {

    Scanner scn = new Scanner(System.in);
    HospitalRepository hospitalRepository = new HospitalRepository();

    public void insertVaccine() {
        System.out.println("백신 종류를 입력하세요.");
        String vaccineName = scn.next();
        System.out.println("해당 백신의 수량을 입력하세요.");
        int vaccineCount = scn.nextInt();

        HospitalDTO hospitalDTO = new HospitalDTO(vaccineName, vaccineCount);
        boolean result = hospitalRepository.insertVaccine(hospitalDTO);
        if (result) {
            System.out.println(hospitalDTO);
            System.out.println("등록 완료");
        } else {
            System.out.println("등록 실패");
        }
    }

    public void updateVaccine() {
        System.out.println("백신 종류를 입력하세요.");
        String updateVaccine = scn.next();

        HospitalDTO hospitalDTO = hospitalRepository.findByName(updateVaccine);
        if (hospitalDTO != null) {
            System.out.println("수량을 입력하세요.");
            int updateVaccineCount = scn.nextInt();
            boolean result = hospitalRepository.updateVaccine(updateVaccine, updateVaccineCount);
            if (result) {
                System.out.println(hospitalDTO);
                System.out.println("수정 완료");
            } else {
                System.out.println("수정 실패");
            }
        } else {
            System.out.println("해당 백신은 보유하고있지 않습니다.");
        }
    }
}

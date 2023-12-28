package service;

import common.CommonVariables;
import dto.HospitalDTO;
import dto.MemberDTO;
import dto.ResvDTO;
import repository.ResvRepository;

import java.util.List;
import java.util.Scanner;

public class ResvService {
    Scanner scn = new Scanner(System.in);
    ResvRepository resvRepository = new ResvRepository();

    public void findByHospital() {
        System.out.println("검색어를 입력하세요.");
        String hospitalName = scn.next();
        List<MemberDTO> memberDTOList = resvRepository.findByHospital(hospitalName);

        if (memberDTOList.size() > 0) {
            for (MemberDTO memberDTO : memberDTOList) {
                if (memberDTO.getMemberCategory().equals("병원")) {
                    System.out.println("memberDTOList = " + memberDTOList);
                }
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }

}

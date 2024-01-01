package service;

import common.CommonVariables;
import dto.HospitalDTO;
import dto.MemberDTO;
import dto.ResvDTO;
import repository.MemberRepository;
import repository.ResvRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ResvService {
    Scanner scn = new Scanner(System.in);
    ResvRepository resvRepository = new ResvRepository();

    public void findByHospital() {
        System.out.println("검색어를 입력하세요.");
        String hospitalName = scn.next();
        List<MemberDTO> memberDTOList = resvRepository.findByHospital(hospitalName);
        System.out.println("memberDTOList = " + memberDTOList);
        if (!memberDTOList.isEmpty()) {
            for (MemberDTO memberDTO : memberDTOList) {
                System.out.println("memberDTO = " + memberDTO);
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void resvReception() {
        System.out.println("예약할 백신 이름을 입력하세요.");
        String vaccineName = scn.next();
        System.out.println("예약자명을 입력하세요.");
        String resvName = scn.next();
        System.out.println("예약 날짜를 읿력하세요.");
        String resvDate = scn.next();

        ResvDTO resvDTO = new ResvDTO(resvName, CommonVariables.loginMobile, vaccineName, resvDate);
        boolean result = resvRepository.resvReception(resvDTO);
        if (result) {
            System.out.println("예약 성공");
        } else {
            System.out.println("예약 실패");
        }
    }

    public void resvHistoryList() {
        List<ResvDTO> resvDTOList = resvRepository.resvHistoryList();
        for (ResvDTO resvDTO : resvDTOList) {
            System.out.println("resvDTO = " + resvDTO);
        }
    }

    public void resvChange() {
        System.out.println("이름을 입력하세요.");
        String updateName = scn.next();

        ResvDTO resvDTO = resvRepository.findByName(updateName);
        if (resvDTO != null) {
            System.out.println("변경하실 날짜를 입력하세요.");
            String updateDate = scn.next();
            boolean result = resvRepository.resvChange(updateName, updateDate);
            if (result) {
                System.out.println(resvDTO);
                System.out.println("예약 변경 완료");
            } else {
                System.out.println("예약 변경 실패");
            }
        } else {
            System.out.println("예약 내역이 존재하지 않습니다.");
        }

    }

    public void resvCancel() {
        System.out.println("취소할 예약번호를 입력하세요.");
        Long cancelId = scn.nextLong();

        boolean result = resvRepository.resvCancel(cancelId);
        if (result) {
            System.out.println("예약 취소 완료");
        } else {
            System.out.println("예약 취소 실패");
        }
    }
}

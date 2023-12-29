package repository;

import dto.HospitalDTO;
import dto.MemberDTO;
import dto.ResvDTO;

import java.util.ArrayList;
import java.util.List;

public class ResvRepository {
    private static List<ResvDTO> resvDTOList = new ArrayList<>();
    private static List<HospitalDTO> hospitalDTOList = new ArrayList<>();
    private static List<MemberDTO> memberDTOList = new ArrayList<>();

    public List<MemberDTO> findByHospital(String hospitalName) {
        List<MemberDTO> memberDTOS = new ArrayList<>();
//        for (int i = 0; i <memberDTOList.size() ; i++) {
//            if(memberDTOList.get(i).getMemberName().contains(hospitalName)){
//                MemberDTO memberDTO = memberDTOS.get(i);
//                memberDTOS.add(memberDTO);
//            }
//        }
        for (MemberDTO memberDTO : memberDTOList) {
            if (memberDTO.getMemberName().contains(hospitalName)) {
                if(memberDTO.getMemberCategory().equals("병원")) {
                memberDTOS.add(memberDTO);
                }
            }
        }
        return memberDTOS;
    }

    public boolean resvReception(ResvDTO resvDTO) {
        resvDTOList.add(resvDTO);
        return true;
    }

    public List<ResvDTO> resvHistoryList() {
        return resvDTOList;
    }
}

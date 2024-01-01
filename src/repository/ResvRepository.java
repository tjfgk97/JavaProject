package repository;

import dto.HospitalDTO;
import dto.MemberDTO;
import dto.ResvDTO;

import java.util.ArrayList;
import java.util.List;

public class ResvRepository {
    private static List<ResvDTO> resvDTOList = new ArrayList<>();

    public List<MemberDTO> findByHospital(String hospitalName) {
        List<MemberDTO> memberDTOS = new ArrayList<>();
        for (int i = 0; i < memberDTOS.size(); i++) {
            if(memberDTOS.get(i).getMemberName().contains(hospitalName)){
                MemberDTO memberDTO = memberDTOS.get(i);
                memberDTOS.add(memberDTO);
            }
        }
        System.out.println("memberDTOS = " + memberDTOS);
        return memberDTOS;
    }



    public boolean resvReception(ResvDTO resvDTO) {
        resvDTOList.add(resvDTO);
        return true;
    }

    public List<ResvDTO> resvHistoryList() {

        return resvDTOList;
    }

    public ResvDTO findByName(String updateName) {
        for (int i = 0; i < resvDTOList.size(); i++) {
            if (updateName.equals(resvDTOList.get(i).getResvName())) {
                return resvDTOList.get(i);
            }
        }
        return null;
    }

    public boolean resvChange(String updateName, String updateDate) {
        for (int i = 0; i < resvDTOList.size(); i++) {
            if (updateName.equals(resvDTOList.get(i).getResvName())){
                resvDTOList.get(i).setResvDate(updateDate);
                return true;
            }
        }
        return false;
    }

    public boolean resvCancel(Long cancelId) {
        boolean result = false;
        for (int i = 0; i < resvDTOList.size(); i++) {
            if(cancelId.equals(resvDTOList.get(i).getId())){
                resvDTOList.remove(i);
                result = true;
            }else {
                result = false;
                System.out.println("존재하지 않는 예약입니다.");
            }
        }
        return result;
    }
}

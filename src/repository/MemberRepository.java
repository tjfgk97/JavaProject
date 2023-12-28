package repository;

import dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private static List<MemberDTO> memberDTOList = new ArrayList<>();
    public MemberDTO checkedMobile(String loginMobile) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if(loginMobile.equals(memberDTOList.get(i).getMemberMobile())){
                return memberDTOList.get(i);
            }
        }
        return null;
    }

    public boolean save(MemberDTO joinMember) {
        return memberDTOList.add(joinMember);
    }
}

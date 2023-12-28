package repository;

import dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private static List<MemberDTO> memberDTOList = new ArrayList<>();

    public MemberDTO checkedMobile(String loginMobile) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginMobile.equals(memberDTOList.get(i).getMemberMobile())) {
                return memberDTOList.get(i);
            }
        }
        return null;
    }

    public boolean save(MemberDTO joinMember) {
        return memberDTOList.add(joinMember);
    }

    public MemberDTO login(String loginMobile, String loginPw) {
        MemberDTO result = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginMobile.equals(memberDTOList.get(i).getMemberMobile())) {
                if (loginPw.equals(memberDTOList.get(i).getMemberPassword())){
                    result = memberDTOList.get(i);
                }
            }
        }
        return result;
    }
}

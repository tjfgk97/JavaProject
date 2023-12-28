package service;

import dto.MemberDTO;
import repository.MemberRepository;

import java.util.Scanner;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    Scanner scn = new Scanner(System.in);

    public void save() {
        String loginMobile = null;
        MemberDTO memberDTO = null;


        do { //전화번호 중복 체크
            System.out.println("정보 등록");
            System.out.println("전화번호를 입력하세요.");
            loginMobile = scn.next();
            memberDTO = memberRepository.checkedMobile(loginMobile);
            if (memberDTO == null) {
                System.out.println("사용 가능한 전화번호입니다.");
            } else {
                System.out.println("중복된 전화번호입니다.");
            }
        } while (memberDTO != null);
        int joinAge = 0;
        String vaccinate = null;

        System.out.println("이름을 입력하세요.");
        String joinName = scn.next();
        System.out.println("비밀번호를 입력하세요.");
        String joinPw = scn.nextLine();
        System.out.println("회원 유형을 입력하세요. \nex)1.개인 회원, 2.기업(병원) 회원");
        int joinCategory = scn.nextInt();
//        if (joinCategory == 1) {
            System.out.println("나이를 입력하세요.");
            joinAge = scn.nextInt();
            System.out.println("접종 여부를 입력하세요. ex)완료, 미완");
            vaccinate = scn.next();
//        } else if (joinCategory == 2) {

            MemberDTO joinMember = new MemberDTO(loginMobile, joinName, joinPw, joinAge, joinCategory, vaccinate);
            boolean result = memberRepository.save(joinMember);
            if (result) {
                System.out.println("정보 등록 성공");
            } else {
                System.out.println("정보 등록 실패");
            }
        }
    }


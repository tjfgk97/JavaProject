import common.CommonVariables;
import service.HospitalService;
import service.MemberService;
import service.ResvService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        MemberService memberService = new MemberService();
        ResvService resvService = new ResvService();
//        HospitalService hospitalService = new HospitalService();

        boolean run = true;
        int select = 0;

        while (run) {
            System.out.println("====== 회원관리 ======");
            System.out.println("-----------------------------------------");
            System.out.println("1.정보 등록 | 2.로그인 | 3.예약 게시판 | 4.병원 전용 게시판 | 5.로그아웃 | 0.종료 ");
            System.out.println("-----------------------------------------");
            System.out.print("선택>");
            select = scn.nextInt();

            if (select == 1) {
                memberService.save();
            } else if (select == 2) {
                memberService.login();
            } else if (select == 3) {
                boolean resvBoardRun = true;
                while (resvBoardRun) {
                    if (CommonVariables.loginedCategory.equals("개인")) {
                        System.out.println("====== 예약 게시판 ======");
                        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("1.병원별 보유 백신 종류 및 수량 확인 | 2.내가 접종할 수 있는 백신 확인 | 3.예약하기 | 4.예약 내역 | 5.예약 상세조회 | 6.예약 변경 | 7.예약 취소 | 0.이전 메뉴");
                        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.print("선택> ");
                        select = scn.nextInt();

                        if (select == 1) {
                            resvService.findByHospital();
                            // 미완성
                        } else if (select == 2) {

                        } else if (select == 3) {

                        } else if (select == 4) {

                        } else if (select == 5) {

                        } else if (select == 6) {

                        } else if (select == 7) {

                        } else if (select == 0) {
                            System.out.println("이전 메뉴로 돌아갑니다.");
                            resvBoardRun = false;
                        }
                    } else {
                        System.out.println("개인 회원 전용 메뉴입니다.");
                        resvBoardRun = false;
                    }
                }
            } else if (select == 4) {
                boolean hospitalRun = true;
                while (hospitalRun) {
                    if (CommonVariables.loginedCategory.equals("병원")) {
                        System.out.println("====== 예약 게시판 ======");
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("1.보유 백신 등록 | 2.백신 종류별 재고량 등록 | 3.백신 종류 및 재고 수정 | 0.이전 메뉴");
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.print("선택> ");
                        select = scn.nextInt();

                        if (select == 1) {

                        } else if (select == 2) {

                        } else if (select == 3) {

                        } else if (select == 0) {
                            System.out.println("이전 메뉴로 돌아갑니다.");
                            hospitalRun = false;
                        }
                    } else {
                        System.out.println("병원 회원 전용 메뉴입니다.");
                        hospitalRun = false;
                    }
                }
            } else if (select == 5) {
                memberService.logout();
            } else if (select == 0) {
                System.out.println("프로그램을 종료합니다.");
                run = false;
            }

        }
    }
}
import service.MemberService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        MemberService memberService = new MemberService();
        boolean run = true;
        int select = 0;

        while (run) {
            System.out.println("====== 회원관리 ======");
            System.out.println("-----------------------------------------");
            System.out.println("1.정보 등록 | 2.로그인 | 3.로그아웃 | 0.종료 ");
            System.out.println("-----------------------------------------");
            System.out.print("선택>");
            select = scn.nextInt();

            if (select == 1) {
                memberService.save();
            } else if (select == 2) {
                memberService.login();
            } else if (select == 3) {

            } else if (select == 0) {
                System.out.println("프로그램을 종료합니다.");
                run = false;
            }

        }
    }
}
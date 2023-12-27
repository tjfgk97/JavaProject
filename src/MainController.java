import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean run = true;
        int select = 0;
        while (run) {
            System.out.println("====== 회원관리 ======");
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.접종 가능 백신 확인 | 4.로그아웃 | 0.종료 ");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택>");
            select = scn.nextInt();

            if (select == 1) {

            } else if (select == 2) {

            } else if (select == 3) {

            } else if (select == 4) {

            } else if (select == 0) {
                System.out.println("프로그램을 종료합니다.");
                run = false;
            }

        }
    }
}
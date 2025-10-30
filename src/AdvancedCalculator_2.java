import java.util.Scanner;

public class AdvancedCalculator_2 extends Calculator {
    String c;

    public void C() {
        Scanner sc = new Scanner(System.in);
        System.out.println("C 입력 시 즉시 종료");
        c = sc.nextLine();

        if (c.equals("C")) {
            System.out.println("0");
            System.exit(0);
        }
    }

}


import java.util.Scanner;

public class AdvancedCalculator_2 extends Calculator {
    String cmd;

//    public void C(String clear)
//    {
//        if(clear == "C")
//            result = 0;
//    }

    public void setC(String cmd)
    {
        this.cmd = cmd;
    }

    public void C() {
        if ( cmd == "") {
            Scanner sc = new Scanner(System.in);
            System.out.println("C 입력 시 즉시 종료");
            cmd = sc.nextLine();
        }

        if (cmd.equals("clear")) {
            result = 0;
        }
    }

    public int getResult()
    {
        return result;
    }
}


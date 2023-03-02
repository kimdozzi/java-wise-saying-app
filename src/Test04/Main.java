/*
package Test04;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("== 명언 앱 ==");
        int count = 1;
        while (true) {
            명언앱 a명언앱 = new 명언앱();
            System.out.print("명령) ");
            String input = br.readLine();
            if (input.equals("종료")) break;
            System.out.print("명언 : ");
            a명언앱.set명언(br.readLine());
            System.out.print("작가 : ");
            a명언앱.set작가(br.readLine());
            System.out.println(count++ + "번 명언이 등록되었습니다.");
        }
    }
}
class 명언앱 {
    private String 명언;
    private String 작가;

    public String get명언() {
        return 명언;
    }

    public void set명언(String 명언) {
        this.명언 = 명언;
    }

    public String get작가() {
        return 작가;
    }

    public void set작가(String 작가) {
        this.작가 = 작가;
    }
}*/

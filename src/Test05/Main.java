package Test05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        명언앱[] a명언앱 = new 명언앱[5];
        System.out.println("== 명언 앱 ==");
        int count = 0; int index = 1;
        while (true) {
            a명언앱[count] = new 명언앱();

            System.out.print("명령) ");
            String input = br.readLine().trim();
            if (input.equals("종료")) {
                break;
            }
            else if (input.equals("목록")) {
                System.out.println("----------------------");
                for(int i = count-1; i >= 0; i--) {
                    System.out.println(a명언앱[i].get등록번호() + " / " + a명언앱[i].get작가() + " / " + a명언앱[i].get명언());
                }
            }
            else {
                System.out.print("명언 : ");
                a명언앱[count].set명언(br.readLine());
                System.out.print("작가 : ");
                a명언앱[count].set작가(br.readLine());

                a명언앱[count].set등록번호(index);
                System.out.println(index + "번 명언이 등록되었습니다.");
                count++; index++;
            }
        }
    }
}
class 명언앱 {
    private String 명언;
    private String 작가;
    private int 등록번호;

    public int get등록번호() {
        return 등록번호;
    }

    public void set등록번호(int 등록번호) {
        this.등록번호 = 등록번호;
    }

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
}
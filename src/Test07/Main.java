/*
package Test07;

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
            // 명령
            System.out.print("명령) ");
            String input = br.readLine().trim();

            // 종료
            if (input.equals("종료")) {
                break;
            }

            // 등록
            else if(input.equals("등록")) {
                a명언앱[count] = new 명언앱();
                System.out.print("명언 : ");
                a명언앱[count].set명언(br.readLine());
                System.out.print("작가 : ");
                a명언앱[count].set작가(br.readLine());

                a명언앱[count].set등록번호(index);
                System.out.println(index + "번 명언이 등록되었습니다.");
                count++; index++;
            }

            // 목록
            else if (input.equals("목록")) {
                System.out.println("----------------------");
                for(int i = count-1; i >= 0; i--) {
                    System.out.println(a명언앱[i].get등록번호() + " / " + a명언앱[i].get작가() + " / " + a명언앱[i].get명언());
                }
            }

            // 삭제
            else {
                int deleteNumber = Integer.parseInt(input.substring(input.length()-1));
                try {
                    if (a명언앱[deleteNumber].get등록번호() > 0) {
                        a명언앱[deleteNumber] = null;
                        System.out.println(deleteNumber + "번 명언이 삭제되었습니다.");
                    }
                }
                catch (Exception e) {
                    System.out.println(deleteNumber + "번 명언은 존재하지 않습니다.");
                }
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

*/

package Test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String input = br.readLine();
            if (input.equals("종료")) break;
            System.out.print("명언 : ");
            br.readLine();
            System.out.print("작가 : ");
            br.readLine();
        }
    }
}
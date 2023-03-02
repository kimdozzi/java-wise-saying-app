package Test08;
import Test08.system.controller.SystemController;
import Test08.wiseSaying.controller.WiseSayingController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {
    public void run() {
        System.out.println("== 명언 앱 ==");

        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController();

        while (true) {
            System.out.print("명령) ");
            // trim() : 혹시 있을지 모를 좌우공백제거된 버전으로 주세요.
            String command = Container.getScanner().nextLine().trim();

            if (command.equals("종료")) {
                systemController.exit();
                break;

            } else if (command.equals("등록")) {
                wiseSayingController.write();

            } else if (command.equals("목록")) {
                wiseSayingController.list();
            } else if (command.startsWith("삭제")) {

                // 정리 시작
                String[] commandBits = command.split("\\?", 2); // 최대 두개까지 나논다.
                String actionCode = commandBits[0];
                Map<String, String> params = new HashMap<>();
                String[] paramBits = commandBits[1].split("&");

                for(String param : paramBits) {
                    String[] paramStrBits = param.split("=", 2);
                    String key = paramStrBits[0];
                    String value = paramStrBits[1];

                    params.put(key, value);
                }
                System.out.println(Arrays.toString(commandBits));
                System.out.printf("actionCode : %s\n", actionCode);
                System.out.printf("paramsBits : %s\n", params);



                // 정리 끝
                wiseSayingController.remove();
            }
        }
    }
}
package Test08;
import Test08.system.controller.SystemController;
import Test08.wiseSaying.controller.WiseSayingController;

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
                Rq rq = new Rq(command);
                System.out.printf("actionCode : %s\n", rq.getActionCode());
                System.out.printf("params.id : %s\n", rq.getParam("id"));
                System.out.printf("params.authorName : %s\n", rq.getParam("authorName"));
                System.out.printf("params.content : %s\n", rq.getParam("content"));
                // 정리 끝
                wiseSayingController.remove();
            }
        }
    }
}
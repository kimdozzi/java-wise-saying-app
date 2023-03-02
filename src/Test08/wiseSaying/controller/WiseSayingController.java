package Test08.wiseSaying.controller;

import Test08.Container;
import Test08.Rq;
import Test08.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingController {
    private long lastWiseSayingId; // 마지막으로 저장된 명언의 등록번호
    private List<WiseSaying> wiseSayings; // id, content, authorName를 담을 수 있는 WiswSaying 객체를 담을 수 있는 리스트

    public WiseSayingController() { // 생성자
        lastWiseSayingId = 0;
        wiseSayings = new ArrayList<>();
    }
    private WiseSaying findById(int id) {
        for(WiseSaying wiseSaying : wiseSayings) {
            if(wiseSaying.getId() == id) {
                return wiseSaying;
            }
        }
        return null;
    }

    public void write() {
        long id = lastWiseSayingId + 1; // 증가
        System.out.print("명언 : ");
        String content = Container.getScanner().nextLine().trim();
        System.out.print("작가 : ");
        String authorName = Container.getScanner().nextLine().trim();

        WiseSaying wiseSaying = new WiseSaying(id, content, authorName);
        wiseSayings.add(wiseSaying);

        System.out.printf("%d번 명언이 등록되었습니다.\n", id);
        lastWiseSayingId = id;
    }

    public void list() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("-".repeat(30));

        for (int i = wiseSayings.size() - 1; i >= 0; i--) {
            WiseSaying wiseSaying = wiseSayings.get(i);

            System.out.printf("%d / %s / %s\n", wiseSaying.getId(), wiseSaying.getAuthorName(), wiseSaying.getContent());
        }
    }

    public void remove(Rq rq) {
        // getIntParam에 "id"를 불러오겠다. 그리고 defaultValue는 -1이다.
        // 넘겨주게되면, getParam(name) 즉, hashMap에 해당 key 값이 존재하는지 확인해서
        // 존재한다면 Integet.parseInt(getParam(name))을 리턴하고, 존재하지 않는다면 예외처리 후 defaultValue를 넘겨준다.
        int id = rq.getIntParam("id", -1);

        // 받아온 값이 없었다면(defaultValue라면)
        if (id == -1) {
            // 목록에 존재하는 값을 받기 위해 다시 입력하라고 한다.
            System.out.println("id(정수)를 입력해주세요.");
            return;
        }
        /*
        try {
            id = Integer.parseInt(rq.getParam("id"));
        } catch (NumberFormatException e) {
            System.out.println("id(정수)를 입력해주세요.");
            return;
        }
        */

        // 입력된 id와 일치하는 명언객체 찾기
        WiseSaying wiseSaying = findById(id);

        if(wiseSaying == null) {
            System.out.printf("%d번 명언은 존재하지 않습니다.", id);
            return;
        }

        // 찾은 명언객체를 리스트에서 제거
        // HashMap의 내장 기능 (따로 구현한 것이 아님)
        wiseSayings.remove(wiseSaying);

        System.out.printf("%d번 명언이 삭제되었습니다.\n", id);
    }

    public void modify(Rq rq) {
        int id = rq.getIntParam("id", -1);

        if (id == -1) {
            System.out.println("id(정수)를 입력해주세요.");
            return;
        }

        // 입력된 id와 일치하는 명언객체 찾기
        // findById에 해당하는 id가 존재하는 값을 받아와 저장한다.
        WiseSaying wiseSaying = findById(id);

        // 객체가 존재하지 않으면
        if (wiseSaying == null) {
            System.out.printf("%d번 명언은 존재하지 않습니다.\n", id);
            return;
        }

        // 존재한다면
        System.out.printf("명언(기존) : %s\n", wiseSaying.getContent());
        System.out.print("명언 : ");
        String content = Container.getScanner().nextLine().trim();

        System.out.printf("작가(기존) : %s\n", wiseSaying.getAuthorName());
        System.out.print("작가 : ");
        String authorName = Container.getScanner().nextLine().trim();

        wiseSaying.setContent(content);
        wiseSaying.setAuthorName(authorName);

        System.out.printf("%d번 명언이 수정되었습니다.\n", id);
    }
}

package Test08.wiseSaying.service;

import Test08.Container;
import Test08.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingService {
    private long lastWiseSayingId; // 마지막으로 저장된 명언의 등록번호
    private List<WiseSaying> wiseSayings; // id, content, authorName를 담을 수 있는 WiswSaying 객체를 담을 수 있는 리스트

    public WiseSayingService() {
        lastWiseSayingId = 0;
        wiseSayings = new ArrayList<>();
    }

    public WiseSaying findById(long id) {
        for(WiseSaying wiseSaying : wiseSayings) {
            if(wiseSaying.getId() == id) {
                return wiseSaying;
            }
        }
        return null;
    }

    public long write(String content, String authorName) {
        long id = lastWiseSayingId + 1; // 증가

        WiseSaying wiseSaying = new WiseSaying(id, content, authorName);
        wiseSayings.add(wiseSaying);

        lastWiseSayingId = id; // 방문 새 명언이 생성되었으니, lastWIseSayingId 값을 갱신한다.
        return id;
    }

    public List<WiseSaying> findAll() {
        return wiseSayings;
    }

    public void remove(WiseSaying wiseSaying) {
        wiseSayings.remove(wiseSaying);
    }

    public void modify(WiseSaying wiseSaying, String content, String authorName) {
        wiseSaying.setContent(content);
        wiseSaying.setAuthorName(authorName);
    }
}

package Test08.wiseSaying.service;

import Test08.Container;
import Test08.wiseSaying.entity.WiseSaying;
import Test08.wiseSaying.repository.WiseSayingRepository;

import java.util.List;

public class WiseSayingService {
    private final WiseSayingRepository wiseSayingRepository;

    public List<WiseSaying> findAll() {
        return wiseSayingRepository.findAll();
    }

    public WiseSaying findById(long id) {
        return wiseSayingRepository.findById(id);
    }
    public WiseSayingService() {
        wiseSayingRepository = new WiseSayingRepository();
    }
    public long write(String content, String authorName) {
        return wiseSayingRepository.write(content, authorName);
    }

    public void remove(WiseSaying wiseSaying) {
        wiseSayingRepository.remove(wiseSaying);
    }

    public void modify(WiseSaying wiseSaying, String content, String authorName) {
        wiseSayingRepository.modify(wiseSaying, content, authorName);
    }
}

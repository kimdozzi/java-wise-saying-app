package test.wiseSaying.service;

import test.wiseSaying.entity.WiseSaying;
import test.wiseSaying.repository.WiseSayingRepository;

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

package Test08.wiseSaying.entity;

public class WiseSaying {
    private long id;
    private String content;
    private String authorName;

    // 생성자
    public WiseSaying(long id, String content, String authorName) {
        this.id = id;
        this.content = content;
        this.authorName = authorName;
    }

    // Getter
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAuthorName() {
        return authorName;
    }


    // Setter
    public void setContent(String content) {
        this.content = content;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
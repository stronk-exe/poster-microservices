package com.poster.poster.post;

public class Post {

    private Integer id;
    private String content;

    public  Post() {}

    public  Post(Integer id, String content) {
        this.id = id;
        this.content = content;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id: " + id +
                ", conent: " + content +
                "}";
    }

}

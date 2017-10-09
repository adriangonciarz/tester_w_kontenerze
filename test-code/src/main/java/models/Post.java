package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    @JsonProperty
    private int userId;
    @JsonProperty
    private String title;
    @JsonProperty
    private String body;

    public Post(int userId, String title, String body) {
        this.setUserId(userId);
        this.setTitle(title);
        this.setBody(body);
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

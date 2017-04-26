package models;

public class PostModel {
    public int userId;
    public String title;
    public String body;

    public PostModel populateMinimum(){
        this.userId=1;
        this.title="New Title";
        this.body = "This Body";
        return this;
    }
}

package ru.netology.domain;

public class PostType {
    private String post;
    private String copy;
    private String reply;
    private String postpone;
    private String suggest;

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getCopy() {
        return copy;
    }

    public void setCopy(String copy) {
        this.copy = copy;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getPostpone() {
        return postpone;
    }

    public void setPostpone(String postpone) {
        this.postpone = postpone;
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }
}

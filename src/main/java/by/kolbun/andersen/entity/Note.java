package by.kolbun.andersen.entity;

import java.util.Date;
import java.util.List;


public class Note {
    private int id;
    private String title;
    private Date date;
    private int priority;
    private List<String> content;

    public Note() {
    }

    public Note(int id, String title, Date date, int priority, List<String> content) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.priority = priority;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        String result = "\t[" + id + ":" + title + ", " + date + ", priority: " + priority + "]\n";
        for (String s : content)
            result += "[" + s + "]\n";
        return result;
    }
}

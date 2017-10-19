package main.space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.util.Date;

public class Event {
    private Date date;
    private String type;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

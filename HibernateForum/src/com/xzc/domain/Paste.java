package com.xzc.domain;

/**
 * @author xzc
 * @date 2024/10/13 08 53:31
 * @description
 */
public class Paste {
    public String id;
    public String title;
    public String content;
    public int ansnum;
    public int offer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAnsnum() {
        return ansnum;
    }

    public void setAnsnum(int ansnum) {
        this.ansnum = ansnum;
    }

    public int getOffer() {
        return offer;
    }

    public void setOffer(int offer) {
        this.offer = offer;
    }
}

package com.example.udong.util;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMMENT")
public class CommentBean implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer CO_NUM;
    String POST_NUM;
    String ID;
    String CONTENT;
    String TIME;


    public CommentBean() {
    }

    public CommentBean(Integer CO_NUM, String POST_NUM, String ID, String CONTENT, String TIME) {
        this.CO_NUM = CO_NUM;
        this.POST_NUM = POST_NUM;
        this.ID = ID;
        this.CONTENT = CONTENT;
        this.TIME = TIME;
    }

    public Integer getCO_NUM() {
        return this.CO_NUM;
    }

    public void setCO_NUM(Integer CO_NUM) {
        this.CO_NUM = CO_NUM;
    }

    public String getPOST_NUM() {
        return this.POST_NUM;
    }

    public void setPOST_NUM(String POST_NUM) {
        this.POST_NUM = POST_NUM;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCONTENT() {
        return this.CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT;
    }

    public String getTIME() {
        return this.TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME;
    }

    public CommentBean CO_NUM(Integer CO_NUM) {
        this.CO_NUM = CO_NUM;
        return this;
    }

    public CommentBean POST_NUM(String POST_NUM) {
        this.POST_NUM = POST_NUM;
        return this;
    }

    public CommentBean ID(String ID) {
        this.ID = ID;
        return this;
    }

    public CommentBean CONTENT(String CONTENT) {
        this.CONTENT = CONTENT;
        return this;
    }

    public CommentBean TIME(String TIME) {
        this.TIME = TIME;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CommentBean)) {
            return false;
        }
        CommentBean commentBean = (CommentBean) o;
        return Objects.equals(CO_NUM, commentBean.CO_NUM) && Objects.equals(POST_NUM, commentBean.POST_NUM) && Objects.equals(ID, commentBean.ID) && Objects.equals(CONTENT, commentBean.CONTENT) && Objects.equals(TIME, commentBean.TIME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CO_NUM, POST_NUM, ID, CONTENT, TIME);
    }

    @Override
    public String toString() {
        return "{" +
            " CO_NUM='" + getCO_NUM() + "'" +
            ", POST_NUM='" + getPOST_NUM() + "'" +
            ", ID='" + getID() + "'" +
            ", CONTENT='" + getCONTENT() + "'" +
            ", TIME='" + getTIME() + "'" +
            "}";
    }

}
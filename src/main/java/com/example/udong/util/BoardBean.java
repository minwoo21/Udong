package com.example.udong.util;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOARD")
public class BoardBean implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    Integer POSTNUM;
    String CATEGORY;
    String TIME;
    String TITLE;
    String CONTENT;
    String CLUB_NUM;
    String ID;


    public BoardBean() {
    }

    public BoardBean(Integer POSTNUM, String CATEGORY, String TIME, String TITLE, String CONTENT, String CLUB_NUM, String ID) {
        this.POSTNUM = POSTNUM;
        this.CATEGORY = CATEGORY;
        this.TIME = TIME;
        this.TITLE = TITLE;
        this.CONTENT = CONTENT;
        this.CLUB_NUM = CLUB_NUM;
        this.ID = ID;
    }

    public Integer getPOSTNUM() {
        return this.POSTNUM;
    }

    public void setPOSTNUM(Integer POSTNUM) {
        this.POSTNUM = POSTNUM;
    }

    public String getCATEGORY() {
        return this.CATEGORY;
    }

    public void setCATEGORY(String CATEGORY) {
        this.CATEGORY = CATEGORY;
    }

    public String getTIME() {
        return this.TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME;
    }

    public String getTITLE() {
        return this.TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getCONTENT() {
        return this.CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT;
    }

    public String getCLUB_NUM() {
        return this.CLUB_NUM;
    }

    public void setCLUB_NUM(String CLUB_NUM) {
        this.CLUB_NUM = CLUB_NUM;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public BoardBean POSTNUM(Integer POSTNUM) {
        this.POSTNUM = POSTNUM;
        return this;
    }

    public BoardBean CATEGORY(String CATEGORY) {
        this.CATEGORY = CATEGORY;
        return this;
    }

    public BoardBean TIME(String TIME) {
        this.TIME = TIME;
        return this;
    }

    public BoardBean TITLE(String TITLE) {
        this.TITLE = TITLE;
        return this;
    }

    public BoardBean CONTENT(String CONTENT) {
        this.CONTENT = CONTENT;
        return this;
    }

    public BoardBean CLUB_NUM(String CLUB_NUM) {
        this.CLUB_NUM = CLUB_NUM;
        return this;
    }

    public BoardBean ID(String ID) {
        this.ID = ID;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BoardBean)) {
            return false;
        }
        BoardBean boardBean = (BoardBean) o;
        return Objects.equals(POSTNUM, boardBean.POSTNUM) && Objects.equals(CATEGORY, boardBean.CATEGORY) && Objects.equals(TIME, boardBean.TIME) && Objects.equals(TITLE, boardBean.TITLE) && Objects.equals(CONTENT, boardBean.CONTENT) && Objects.equals(CLUB_NUM, boardBean.CLUB_NUM) && Objects.equals(ID, boardBean.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(POSTNUM, CATEGORY, TIME, TITLE, CONTENT, CLUB_NUM, ID);
    }

    @Override
    public String toString() {
        return "{" +
            " POSTNUM='" + getPOSTNUM() + "'" +
            ", CATEGORY='" + getCATEGORY() + "'" +
            ", TIME='" + getTIME() + "'" +
            ", TITLE='" + getTITLE() + "'" +
            ", CONTENT='" + getCONTENT() + "'" +
            ", CLUB_NUM='" + getCLUB_NUM() + "'" +
            ", ID='" + getID() + "'" +
            "}";
    }

}
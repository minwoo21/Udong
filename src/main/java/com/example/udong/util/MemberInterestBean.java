package com.example.udong.util;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MEMBER_INTEREST")
public class MemberInterestBean implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    String ID;
    String NAME;


    public MemberInterestBean() {
    }

    public MemberInterestBean(String ID, String NAME) {
        this.ID = ID;
        this.NAME = NAME;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return this.NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public MemberInterestBean ID(String ID) {
        this.ID = ID;
        return this;
    }

    public MemberInterestBean NAME(String NAME) {
        this.NAME = NAME;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MemberInterestBean)) {
            return false;
        }
        MemberInterestBean memberInterestBean = (MemberInterestBean) o;
        return Objects.equals(ID, memberInterestBean.ID) && Objects.equals(NAME, memberInterestBean.NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, NAME);
    }

    @Override
    public String toString() {
        return "{" +
            " ID='" + getID() + "'" +
            ", NAME='" + getNAME() + "'" +
            "}";
    }

}
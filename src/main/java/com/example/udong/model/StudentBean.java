package com.example.udong.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class StudentBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long ID;
	private String NAME;
	private String PASSPORT_NUMBER;

	public StudentBean() {
	}

	public StudentBean(Long ID, String NAME, String PASSPORT_NUMBER) {
		this.ID = ID;
		this.NAME = NAME;
		this.PASSPORT_NUMBER = PASSPORT_NUMBER;
	}

	public Long getID() {
		return this.ID;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}

	public String getNAME() {
		return this.NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public String getPASSPORT_NUMBER() {
		return this.PASSPORT_NUMBER;
	}

	public void setPASSPORT_NUMBER(String PASSPORT_NUMBER) {
		this.PASSPORT_NUMBER = PASSPORT_NUMBER;
	}

	public StudentBean ID(Long ID) {
		this.ID = ID;
		return this;
	}

	public StudentBean NAME(String NAME) {
		this.NAME = NAME;
		return this;
	}

	public StudentBean PASSPORT_NUMBER(String PASSPORT_NUMBER) {
		this.PASSPORT_NUMBER = PASSPORT_NUMBER;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof StudentBean)) {
			return false;
		}
		StudentBean studentBean = (StudentBean) o;
		return Objects.equals(ID, studentBean.ID) && Objects.equals(NAME, studentBean.NAME)
				&& Objects.equals(PASSPORT_NUMBER, studentBean.PASSPORT_NUMBER);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, NAME, PASSPORT_NUMBER);
	}

	@Override
	public String toString() {
		return "{" + " ID='" + getID() + "'" + ", NAME='" + getNAME() + "'" + ", PASSPORT_NUMBER='"
				+ getPASSPORT_NUMBER() + "'" + "}";
	}

}
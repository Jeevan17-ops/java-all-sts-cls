package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Marks {

	@Id
	 private int rollNo;
	 private String name;
	 private String course;
	 private int sub1;
	 private int sub2;
	 private int sub4;
	 private int sub5;
	 private int sub6;
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marks(int rollNo, String name, String course, int sub1, int sub2, int sub4, int sub5, int sub6) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub4 = sub4;
		this.sub5 = sub5;
		this.sub6 = sub6;
	}
	@Override
	public String toString() {
		return "Marks [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", sub1=" + sub1 + ", sub2=" + sub2
				+ ", sub4=" + sub4 + ", sub5=" + sub5 + ", sub6=" + sub6 + "]";
	}

}

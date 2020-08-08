package com.spring.daydiff.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DateBean")
public class DateBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "colId")
	private int colId;

	@Column(name = "fromDate")
	private String fromDate;

	@Column(name = "toDate")
	private String toDate;

	@Column(name = "daysDiff")
	private String daysDiff;

	public int getColId() {
		return colId;
	}

	public void setColId(int colId) {
		this.colId = colId;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getDaysDiff() {
		return daysDiff;
	}

	public void setDaysDiff(String daysDiff) {
		this.daysDiff = daysDiff;
	}
}
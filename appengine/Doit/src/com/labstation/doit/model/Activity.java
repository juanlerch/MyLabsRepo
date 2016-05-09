package com.labstation.doit.model;


import java.util.Date;
import java.util.List;

import com.google.appengine.api.datastore.Key;

public class Activity {
	
	
	Key key;
	
	String name;
	String description;
	
	Date fromDate;
	Date toDate;
	
	
	List<String> assignedTo;


	public Key getKey() {
		return key;
	}


	public void setKey(Key key) {
		this.key = key;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getFromDate() {
		return fromDate;
	}


	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}


	public Date getToDate() {
		return toDate;
	}


	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}


	public List<String> getAssignedTo() {
		return assignedTo;
	}


	public void setAssignedTo(List<String> assignedTo) {
		this.assignedTo = assignedTo;
	}
	

}

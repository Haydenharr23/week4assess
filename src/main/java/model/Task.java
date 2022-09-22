package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Hayden Harris - CIS175 
 * DMACC FALL 2022
 * Sep 21, 2022
 */
public class Task {

	private int id;
	private String name;
	private String description;
	
	public Task() {
		super();
	}
	public Task(String name) {
		super();
		this.name=name;
		
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String desc) {
		this.description=desc;
	}
	

	
	
}

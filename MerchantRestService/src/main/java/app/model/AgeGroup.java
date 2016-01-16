package app.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import app.repository.commons.Common;


@Document
public class AgeGroup extends Common implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 948237131094171307L;
	@Id
	private String id;
	private int maxAge;
	private int minAge;
	
	public AgeGroup() {
		super();
	}
	
	public AgeGroup(int maxAge, int minAge) {
		super();
		this.maxAge = maxAge;
		this.minAge = minAge;
	}
	
//	@Override
	public String getId() {
		return id;
	}
	
//	@Override
	public void setId(String id) {
		this.id = id;
	}

	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	@Override
	public String toString() {
		return "AgeGroup [id=" + id + ", maxAge=" + maxAge + ", minAge=" + minAge + "]";
	}

	
	
}

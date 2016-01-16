package app.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;

import app.repository.commons.Common;

public class TravelInsurance extends Common implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2158996423429099545L;
	@Id
	private String id;
	private List<User> users;
	private int duration; //in days
	private int regionId; //foreign key
	private int insuredPersonsNum;
	private int ageGroupId; //foreign key
	private int sportId; //foreign key
	private double amount;
	
	
	
	public TravelInsurance() {
		super();
	}

	public TravelInsurance(List<User> users,int duration, int regionId, int insuredPersonsNum, int ageGroupId, int sportId, double amount) {
		super();
		this.users = users;
		this.duration = duration;
		this.regionId = regionId;
		this.insuredPersonsNum = insuredPersonsNum;
		this.ageGroupId = ageGroupId;
		this.sportId = sportId;
		this.amount = amount;
	}

//	@Override
	public String getId() {
		return id;
	}
	
//	@Override
	public void setId(String id) {
		this.id = id;
	}
	

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public int getInsuredPersonsNum() {
		return insuredPersonsNum;
	}

	public void setInsuredPersonsNum(int insuredPersonsNum) {
		this.insuredPersonsNum = insuredPersonsNum;
	}

	public int getAgeOfPersons() {
		return ageGroupId;
	}

	public void setAgeOfPersons(int ageOfPersons) {
		this.ageGroupId = ageOfPersons;
	}

	
	public int getSportId() {
		return sportId;
	}

	public void setSportId(int sportId) {
		this.sportId = sportId;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public int getAgeGroupId() {
		return ageGroupId;
	}

	public void setAgeGroupId(int ageGroupId) {
		this.ageGroupId = ageGroupId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}

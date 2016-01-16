package app.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import app.repository.commons.Common;

@Document
public class VehicleInsPackage extends Common implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4735748462378345195L;
	@Id
	private String id;
	private String name;
	
	
	public VehicleInsPackage() {
		super();
	}
	
	public VehicleInsPackage(String name) {
		super();
		this.name = name;
	}
	//@Override
	public String getId() {
		return id;
	}
	
	//@Override
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "VehicleInsPackage [id=" + id + ", name=" + name + "]";
	}
	
	
}

package app.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import app.repository.commons.Common;

@Document
public class Insurance extends Common implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3498853990547000424L;
	//travel insurance
	@Id
	private String id;
	private VehicleInsurance vehicleIns;
	private RealestateInsurance realstateIns;
	private TravelInsurance travelIns;
	private double totalPrice;

	public Insurance() {
		super();		
	}
	
	

	public Insurance(VehicleInsurance vehicleIns, RealestateInsurance realstateIns, TravelInsurance travelIns,
			double totalPrice) {
		super();
		this.vehicleIns = vehicleIns;
		this.realstateIns = realstateIns;
		this.travelIns = travelIns;
		this.totalPrice = totalPrice;
	}



	public VehicleInsurance getVehicleIns() {
		return vehicleIns;
	}

	public void setVehicleIns(VehicleInsurance vehicleIns) {
		this.vehicleIns = vehicleIns;
	}

	public RealestateInsurance getRealstateIns() {
		return realstateIns;
	}

	public void setRealstateIns(RealestateInsurance realstateIns) {
		this.realstateIns = realstateIns;
	}

	public TravelInsurance getTravelIns() {
		return travelIns;
	}

	public void setTravelIns(TravelInsurance travelIns) {
		this.travelIns = travelIns;
	}

	//@Override
	public String getId() {
		return id;
	}
	
	//@Override
	public void setId(String id) {
		this.id = id;
	}
	

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}



	@Override
	public String toString() {
		return "Insurance [id=" + id + ", vehicleIns=" + vehicleIns + ", realstateIns=" + realstateIns + ", travelIns="
				+ travelIns + ", totalPrice=" + totalPrice + "]";
	}
	
	

}

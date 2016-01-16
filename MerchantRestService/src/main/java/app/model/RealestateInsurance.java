package app.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import app.repository.commons.Common;

public class RealestateInsurance extends Common implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5348136306628433221L;
		//real estate insurance -- "re"
	@Id
		private String id;
		private int reDuration;
		private double reSize;
		private double reAge;
		private double reEstimatedVal;
		private int realEstatePackId; //foreign key
		private double coefficient;
		
		
		public RealestateInsurance() {
			super();
		}

		public RealestateInsurance(int reDuration, double reSize, double reAge, double reEstimatedVal,
				int realEstatePackId, double coefficient) {
			super();
			this.reDuration = reDuration;
			this.reSize = reSize;
			this.reAge = reAge;
			this.reEstimatedVal = reEstimatedVal;
			this.realEstatePackId = realEstatePackId;
			this.coefficient = coefficient;
		}

		public int getReDuration() {
			return reDuration;
		}

		public void setReDuration(int reDuration) {
			this.reDuration = reDuration;
		}

		public double getReSize() {
			return reSize;
		}

		public void setReSize(double reSize) {
			this.reSize = reSize;
		}

		public double getReAge() {
			return reAge;
		}

		public void setReAge(double reAge) {
			this.reAge = reAge;
		}

		public double getReEstimatedVal() {
			return reEstimatedVal;
		}

		public void setReEstimatedVal(double reEstimatedVal) {
			this.reEstimatedVal = reEstimatedVal;
		}

		public int getRealEstatePackId() {
			return realEstatePackId;
		}

		public void setRealEstatePackId(int realEstatePackId) {
			this.realEstatePackId = realEstatePackId;
		}
		
	//	@Override
		public String getId() {
			return id;
		}
		
		//@Override
		public void setId(String id) {
			this.id = id;
		}

		public double getCoefficient() {
			return coefficient;
		}

		public void setCoefficient(double coefficient) {
			this.coefficient = coefficient;
		}
		
		

}

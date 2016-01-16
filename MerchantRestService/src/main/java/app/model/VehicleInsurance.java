package app.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import app.repository.commons.Common;

public class VehicleInsurance extends Common implements Serializable {
	//vehicle insurance --"vi"
	
		/**
	 * 
	 */
	private static final long serialVersionUID = -1027548365143014756L;
	@Id
		private String id;
		private int viDuration;
		private int viPackageId; //foreign key
		
		//about vehicle
		private int viTypeId; //foreign key
		//private String viModel;
		private int viYearOfProduction;
		private String viRegistrationNum;
		private String viVinNum;
		

		public VehicleInsurance() {
			super();
		}

		public VehicleInsurance(int viDuration, int viPackageId, int viTypeId, int viYearOfProduction,
				String viRegistrationNum, String viVinNum) {
			super();
			this.viDuration = viDuration;
			this.viPackageId = viPackageId;
			this.viTypeId = viTypeId;
			this.viYearOfProduction = viYearOfProduction;
			this.viRegistrationNum = viRegistrationNum;
			this.viVinNum = viVinNum;
		}
		//@Override
		public String getId() {
			return id;
		}
		
		//@Override
		public void setId(String id) {
			this.id = id;
		}
		public int getViDuration() {
			return viDuration;
		}

		public void setViDuration(int viDuration) {
			this.viDuration = viDuration;
		}

		public int getViPackageId() {
			return viPackageId;
		}

		public void setViPackageId(int viPackageId) {
			this.viPackageId = viPackageId;
		}

		public int getViTypeId() {
			return viTypeId;
		}

		public void setViTypeId(int viTypeId) {
			this.viTypeId = viTypeId;
		}

		public int getViYearOfProduction() {
			return viYearOfProduction;
		}

		public void setViYearOfProduction(int viYearOfProduction) {
			this.viYearOfProduction = viYearOfProduction;
		}

		public String getViRegistrationNum() {
			return viRegistrationNum;
		}

		public void setViRegistrationNum(String viRegistrationNum) {
			this.viRegistrationNum = viRegistrationNum;
		}

		public String getViVinNum() {
			return viVinNum;
		}

		public void setViVinNum(String viVinNum) {
			this.viVinNum = viVinNum;
		}
		
}

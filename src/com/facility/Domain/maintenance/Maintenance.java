package com.facility.Domain.maintenance;

import com.facility.Domain.facility.Facility;
import com.facility.Domain.facility.FacilityImp;

public interface Maintenance {
	public Integer getFacilityMaintenanceCost();
	public void setFacilityMaintenanceCost(int facilityMaintenanceCost);
	public MaintenanceInspection getFacilityMaintenanceDetails();
	public void setFacilityMaintenanceDetails(MaintenanceInspection inspection);
	public String getFacilityID();
	public void setFacilityID(String facilityID);
	
	public Facility getFacility();
	public void setFacility(FacilityImp facility);
}

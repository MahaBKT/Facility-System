package com.facility.Domain.facility;

import  com.facility.Domain.facility.FacilityDetails;


public interface Facility {
	
	public String getName();
	public void setName(String name);
	public String getFacilityId();
	public void setFacilityId(String facilityId);
	public FacilityDetails getDetails();

	public void setDetails(FacilityDetails details);

	public String toString();


}

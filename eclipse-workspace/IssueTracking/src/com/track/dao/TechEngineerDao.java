package com.track.dao;

import java.util.List;

import com.track.model.TechEngineer;

public interface TechEngineerDao {
	
	TechEngineer viewAssignedTickets();
	TechEngineer updateStatuisOfTickets();
	TechEngineer viewOfResolovedTickets();
	List<TechEngineer> assignToTechEngineer();
	
	
}

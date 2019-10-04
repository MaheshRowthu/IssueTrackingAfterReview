package com.track.service;

import com.track.model.Issue;
import com.track.model.TechEngineer;

public interface TechEngineerService {

	TechEngineer ViewAssignedTickets(Issue i);
	TechEngineer UpdateTicketStatus(Issue i);
	TechEngineer ViewOfResolvedTickets(Issue i);

}

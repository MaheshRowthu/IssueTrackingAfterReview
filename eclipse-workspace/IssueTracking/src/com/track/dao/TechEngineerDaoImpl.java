package com.track.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.track.connect.DbConnection;
import com.track.model.TechEngineer;

public class TechEngineerDaoImpl implements TechEngineerDao {
	private static final Logger log = Logger.getRootLogger();
	DbConnection sc = new DbConnection();
	PreparedStatement ps = null;

	ResultSet rs = null;

	@Override
	public List<TechEngineer> assignToTechEngineer() {
		
		String sql = "select techid,name from techteam";
		List<TechEngineer> techTeamList = new ArrayList<>();
		try {
			ps = DbConnection.getConnection().prepareStatement(sql);

			rs = ps.executeQuery();
			while (rs.next()) {
				log.debug(rs);
				techTeamList.add(getAdminAssignToTechEngineerResultSet(rs));
				log.debug(techTeamList);
			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			log.error(e);
		}
		return techTeamList;
	}

	private TechEngineer getAdminAssignToTechEngineerResultSet(ResultSet rs) {
		try {

			int techEngId = rs.getInt(1);
			String techEngName = rs.getString(2);
			log.debug("tech id is"+techEngId);
			TechEngineer techEngineerListObj = new TechEngineer(techEngId, techEngName);
			log.debug("tech id at inner method is"+techEngineerListObj.getTechId());
			log.trace("tracing obj at inner method"+techEngineerListObj);
			return techEngineerListObj;
		} catch (SQLException e) {
			log.error(e);
		}

		return null;
	}

	@Override
	public TechEngineer viewAssignedTickets() {

		return null;
	}

	@Override
	public TechEngineer updateStatuisOfTickets() {
		return null;
	}

	@Override
	public TechEngineer viewOfResolovedTickets() {
		return null;
	}

}

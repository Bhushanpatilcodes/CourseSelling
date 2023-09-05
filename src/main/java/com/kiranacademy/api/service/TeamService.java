package com.kiranacademy.api.service;

import java.util.List;

import com.kiranacademy.api.dao.TeamDao;
import com.kiranacademy.api.enitity.Team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

	@Autowired
	TeamDao dao;

	public List<Team> getAllPalyer() {
		List<Team> team = dao.getAllPlayer();
		return team;
	}

	public boolean insertPlayer(Team team) {
		return dao.insertPlayer(team);
	}

	public Team getPlayerByID(int age) {
		return dao.getPlayerByID(age);
	}

	public boolean deletePlayerByID(int age) {
		return dao.deletePlayerByID(age);

	}

}

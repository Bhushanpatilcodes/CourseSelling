package com.kiranacademy.api.controller;

import java.util.List;

import com.kiranacademy.api.enitity.Team;
import com.kiranacademy.api.service.TeamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

	@Autowired
	TeamService tm;

	@GetMapping("/all")
	public List<Team> getAllPlayer() {
		List<Team> team = tm.getAllPalyer();
		return team;
	}

	@PostMapping("/add")
	public boolean insertPalyer(@RequestBody Team team) {
		boolean inserted = tm.insertPlayer(team);
		return inserted;
	}

	@GetMapping("player/{age}")
	Team getPlayerByID(@PathVariable int age) {
		Team player = tm.getPlayerByID(age);
		return player;
	}

	@DeleteMapping("/delete/{age}")
	public boolean deletePlayerByID(@PathVariable int age) {
		boolean isDeleted = tm.deletePlayerByID(age);
		return isDeleted;
	}
}

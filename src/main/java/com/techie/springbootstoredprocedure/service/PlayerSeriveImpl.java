package com.techie.springbootstoredprocedure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techie.springbootstoredprocedure.model.Player;
import com.techie.springbootstoredprocedure.repository.PlayerRepository;

@Service
public class PlayerSeriveImpl implements PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public List<Player> getPlayers() {
		return playerRepository.getPlayers();
	}

	@Override
	public List<Player> getPlayersByCategory(String category) {
		return playerRepository.getPlayersByCategory(category);
	}
	
	@Override
	public List<Object[]> getJoinsProcedure() {
		return playerRepository.getJoinsProcedure();
	}

}

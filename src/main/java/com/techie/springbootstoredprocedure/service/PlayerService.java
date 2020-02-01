package com.techie.springbootstoredprocedure.service;

import java.util.List;

import com.techie.springbootstoredprocedure.model.Player;

public interface PlayerService {
	
	public List<Player> getPlayers();
	
	public List<Player> getPlayersByCategory(String category);
	
	public List<Object[]> getJoinsProcedure();

}

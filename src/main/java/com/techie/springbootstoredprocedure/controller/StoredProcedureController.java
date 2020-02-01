package com.techie.springbootstoredprocedure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techie.springbootstoredprocedure.model.Player;
import com.techie.springbootstoredprocedure.service.PlayerService;

@RestController
@RequestMapping("/stored-procedure")
public class StoredProcedureController {
	
	@Autowired
	private PlayerService playerService;
	
	@GetMapping("/palyers")
	public ResponseEntity<List<Player>> getPlayers(){
		
		 List<Player> players = playerService.getPlayers();
		 
		 return ResponseEntity.ok(players);
	}
	
	
	
	@GetMapping("/palyers/{category}")
	public ResponseEntity<List<Player>> getPlayersCategory(@PathVariable("category")String category ){
		 List<Player> players = playerService.getPlayersByCategory(category);
		 return ResponseEntity.ok(players);
	}
	
	@GetMapping("/palyers-details")
	public ResponseEntity<List<Object[]>> getPlayersDetails(){
		
		 List<Object[]> joinsProcedure = playerService.getJoinsProcedure();
		 
		 return ResponseEntity.ok(joinsProcedure);
	}
	

}

# Spring boot Stored Procedure


1)	DELIMITER $$
	
	USE `test`$$
	
	DROP PROCEDURE IF EXISTS `getPlayers`$$
	
	CREATE PROCEDURE `test`.`getPlayers`()
	BEGIN
	SELECT * FROM athlete;
	END$$
	
	DELIMITER ;
	

2) 	DELIMITER $$

	USE `test`$$
	
	DROP PROCEDURE IF EXISTS `getPlayersByCategory`$$
	
	CREATE PROCEDURE `test`.`getPlayersByCategory`(IN category_name VARCHAR(20))
	BEGIN
	SELECT * FROM athlete WHERE category =category_name;
	END$$
	
	DELIMITER ;
	
	
3)
		DELIMITER $$
		
		USE `test`$$
		
		DROP PROCEDURE IF EXISTS `joinProcedure`$$
		
		CREATE PROCEDURE `test`.`joinProcedure`()
		BEGIN
			SELECT ath.name AS palyer_name,te.name AS team_name FROM athlete ath INNER JOIN team te ON( ath.id = te.player);
		END$$
		
		DELIMITER ;
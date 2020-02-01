package com.techie.springbootstoredprocedure.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "athlete")
@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "firstProcedure", procedureName = "getPlayers"),
		@NamedStoredProcedureQuery(name = "secondProcedure", procedureName = "getplayersByCategory",
		parameters = @StoredProcedureParameter(mode = ParameterMode.IN, name = "categeory_name", type = String.class)),
		@NamedStoredProcedureQuery(name ="joinProcedure",procedureName="joinProcedure")
})
public class Player implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3018536027899091798L;

	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "name")
	private String name;
	@Column(name = "category")
	private String category;

}

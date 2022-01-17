package com.devsuperior.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score") 
public class Score implements Serializable{
	private static final long serialVersionUID = 1L;


	@EmbeddedId
	private ScorePK id = new ScorePK();
	private double value;
	
	public Score() {
		}
		
	public void setMovie(Movie movie) {
		id.setMovie (movie);
	}

	public ScorePK getId() {
		return id;
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	

	
}

/**
 * COPYRIGHT (C) 2015 archit.imsec10@gmail.com. All Rights Reserved.
 * ******************************************************************
 * @author archit.kapoor
 *
 */

package com.tournament;

class Team {

	private String teamName;
	private int points;
	private boolean notPlaying;
	
	public Team(String name)
	{
		this.teamName= name;
		this.points=0;
		this.notPlaying = true;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String name) {
		this.teamName = name;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int p) {
		this.points  = this.points + p;
	}

	public boolean isNotPlaying() {
		return notPlaying;
	}

	public void setNotPlaying(boolean notPlaying) {
		this.notPlaying = notPlaying;
	}
}
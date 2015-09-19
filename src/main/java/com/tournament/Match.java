/**
 * COPYRIGHT (C) 2015 archit.imsec10@gmail.com. All Rights Reserved.
 * ******************************************************************
 * @author archit.kapoor
 *
 */


package com.tournament;

import java.util.Date;

public class Match {

	private Team team1;
	private Team team2;
	private Venue venue;
	private Date matchDate;
	private Team winner;
	private boolean played;
	
	
	public Match()
	{
		this.team1 = null;
		this.team2 = null;
		this.venue = null;
		this.matchDate = null;
		this.played = false;
		this.winner = null;
	}
	
	public Match(Team team1, Team team2, Venue venue, Date matchDate) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.venue = venue;
		this.matchDate = matchDate;
		this.played = false;
		this.winner = null;
	}
	
	public Team[] getTeams() {
		Team[] teams = new Team[2];
		teams[0]=team1;
		teams[1]=team2;
		return teams;
	}
	
	public void setTeams(Team team1, Team team2) {
		this.team1 = team1;
		this.team2 = team2;
	}
	
	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	
	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	
	
	public boolean isPlayed() {
		return played;
	}

	public void setPlayed(boolean played) {
		this.played = played;
	}

	public Team getWinner()
	{
		return winner;
	}

	@Override
	public String toString() {
//		return team1.getTeamName() + " and " + team2.getTeamName() + " on " + matchDate + " at " + venue.getVenueName();
		return team1.getTeamName() + " and " + team2.getTeamName() + " on " + MyDateParser.toString(matchDate) + " at " + venue.getVenueName();

	}
}
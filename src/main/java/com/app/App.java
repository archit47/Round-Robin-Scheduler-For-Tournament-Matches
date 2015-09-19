/**
 * COPYRIGHT (C) 2015 archit.imsec10@gmail.com. All Rights Reserved.
 * ******************************************************************
 * @author archit.kapoor
 *
 */


package com.app;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.tournament.MyDateParser;
import com.tournament.Tournament;
import com.tournament.Match;


public class App {

	public static void main(String[] args) {

		
		String tournamentName = "ICC World Cup";
		int totalTeams = 4;
		int totVenues = 3;
		
		Date date=null;
		try {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		/* Following is a deprecated method/way of initializing a Date object */
		// date = new Date("01/01/2016");
		
		
		// date = (Date) sdf.parse("01/01/2016");
		date = sdf.parse("01/01/2016");
		
		} catch (ParseException e) {
			System.out.println("Error in Parsing Date");
			//	e.printStackTrace();
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println("Program aborted !!");
			// return;
		}
		
		Tournament tournament = new Tournament (tournamentName,totalTeams, totVenues, date); 

		tournament.addTeam("India");
		tournament.addTeam("Australia");
		tournament.addTeam("South Africa");
		tournament.addTeam("West Indies");
		tournament.addTeam("Ireland");
		tournament.addTeam("Canada");
		tournament.addTeam("New Zealand");
		tournament.addTeam("Sri Lanka");
		
		
		tournament.addVenue("Sydney");
		tournament.addVenue("Adelaide");
		tournament.addVenue("Hobart");
		tournament.addVenue("Perth");
		
		int totRounds = 2;
		tournament.setNumberOfRounds(totRounds);

		
		ArrayList<Match> matches= tournament.getMatches();
		
		System.out.println("\n****\t" + tournament.getTournamentName() + "\t****\n");
		System.out.print("Tournament beginning date: ");
		if(date!=null)
			System.out.println(MyDateParser.toString(date));
		System.out.println("");
		
		for(Match m : matches){
			System.out.println(m.toString());
		}
		
		//System.out.println(tournament.getWinner());

	}
}

		// Functionality of => Maximum number of matches per day is yet to be implemented.
		// Functionality of => adding points per match yet to be implemented.
		// Functionality of => Semi final and Quarter final yet to be added in the schedule
		// Functionality of => Last played match and minimum 1/2 day gap between matches yet to be implemented.
		// JUnit test cases of every class of this application.
		// DateBase design and Database connection yet to be added to this application.
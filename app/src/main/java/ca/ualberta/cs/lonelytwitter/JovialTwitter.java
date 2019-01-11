/* mood: jovial */

package ca.ualberta.cs.lonelytwitter;

public class JovialTwitter extends currentMood {

	Date date;


	public currentMood (Date currentDate){
	/* takes the date as argument */

		date = currentDate;

	}


	public currentMood (){
	/* sets the date as default */

		date = new Date ();

	}


	public String mood (){
	/* returns mood */

		String mood;
		mood = "jovial";

		return mood;

	}

}


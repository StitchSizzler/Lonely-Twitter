/* current mood and time stuff */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class currentMood {

	Date date;

	public currentMood (Date currentDate){
	/* takes the date as argument */

		date = currentDate;

	}


	public currentMood (){
	/* sets the date as default */

		date = new Date ();

	}

}


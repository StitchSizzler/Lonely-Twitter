/* current mood and time stuff */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class currentMood {

	Date date;


	public void setDate (Date currentDate){
	/* sets date from argument */

		this.date = currentDate;

	}


	public void getDate (){
	/* gets default date */

		this.date = new Date;

	}


	public abstract String mood ();

}


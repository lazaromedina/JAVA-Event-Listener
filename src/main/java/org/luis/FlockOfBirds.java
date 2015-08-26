package org.luis;

/**
 * Created by luislazaro on 26/8/15.
 * lalazaro@keedio.com
 * Keedio
 */
public class FlockOfBirds implements MoodListener {
    public void moodReceived(MoodEvent event) {
        if( event.mood() == Mood.HAPPY )
        {
            System.out.println( "Birds are singing!" );
        }
        else if( event.mood() == Mood.ANNOYED )
        {
            System.out.println( "Birds are silent!" );
        }
        else
        {
            System.out.println( "Birds are flying away!" );
        }
    }

}

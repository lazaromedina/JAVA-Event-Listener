package org.luis;

import java.util.EventObject;
/**
 * Created by luislazaro on 26/8/15.
 * lalazaro@keedio.com
 * Keedio
 */
public class MoodEvent extends EventObject {
    private Mood _mood;

    public MoodEvent( Object source, Mood mood ) {
        super( source );
        _mood = mood;
    }
    public Mood mood() {
        return _mood;
    }

}


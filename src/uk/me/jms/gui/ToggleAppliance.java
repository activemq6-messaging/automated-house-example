package uk.me.jms.gui;

/**
 * Created by Mark.Eastman on 03/11/2014.
 */
public class ToggleAppliance extends AbstractAppliance
{
    private boolean state = true;

    public ToggleAppliance( String text, Logger logger, boolean state )
    {
        super( text, logger );
        this.state = state;
    }

    public void toggle()
    {
        // We need to toggle state and reflect a message
        state = !state;
        log( "State changed to " + state );
    }

    public boolean isState()
    {
        return state;
    }
}

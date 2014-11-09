package uk.me.jms.gui;

/**
 * Created by Mark.Eastman on 03/11/2014.
 */
public abstract class AbstractAppliance
{
    private String name;
    private Logger logger;

    public AbstractAppliance( String name, Logger logger )
    {
        this.name = name;
        this.logger = logger;
    }

    public void log( String text )
    {
        logger.log( name + ": " + text );
    }
}

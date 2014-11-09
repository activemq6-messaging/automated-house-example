package uk.me.jms.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Mark.Eastman on 03/11/2014.
 */
public class MainApp extends JFrame
    implements Logger
{
    private JTextArea console;
    private JButton top, west, east;
    private ToggleAppliance mainLight;
    private ToggleAppliance cooker;
    private ToggleAppliance radiator;

    public MainApp()
    {
        setTitle( "Demonstration for JMS messaging" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        createAppliances();
        buildControls();
    }

    private void createAppliances()
    {
        mainLight = new ToggleAppliance( "Master Light", this, false );
        cooker = new ToggleAppliance( "Cooker", this, false );
        radiator = new ToggleAppliance( "Radiator", this, true );
    }

    private void buildControls()
    {
        console = new JTextArea();
        console.setEditable( false );
        JScrollPane scroller = new JScrollPane(console);
        scroller.setPreferredSize( new Dimension( 400, 100 ) );
        add(scroller, BorderLayout.SOUTH);

        top = new JButton( "Master Light" );
        top.addMouseListener( new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);
                mainLight.toggle();
                top.setBackground( mainLight.isState() ? Color.YELLOW : null );
            }
        });
        add( top, BorderLayout.NORTH );

        west = new JButton( "Cooker" );
        west.addMouseListener( new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);
                cooker.toggle();
                west.setBackground( cooker.isState() ? Color.RED : null );
            }
        });
        add( west, BorderLayout.WEST );

        east = new JButton( "Radiator" );
        east.addMouseListener( new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);
                radiator.toggle();
                east.setBackground( radiator.isState() ? Color.ORANGE : null );
            }
        });
        add( east, BorderLayout.EAST );
    }

    public void log( String text )
    {
        console.append( text );
        console.append("\n");
        console.setCaretPosition( console.getText().length() );
    }
}

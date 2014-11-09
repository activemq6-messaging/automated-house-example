package uk.me.jms.gui;

import javax.swing.*;

/**
 * Created by Mark.Eastman on 03/11/2014.
 */
public class Main
{
    public static void main(String[] args)
    {
        MainApp program = new MainApp();
        program.setBounds( 100, 100, 800, 500 );
        program.setVisible( true );

        program.log( "Console..." );
    }
}

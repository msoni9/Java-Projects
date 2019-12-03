package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JComponent;
import javax.swing.SwingUtilities;


/**
  * This class listens for UISwitches, and updates a given component.
  *
  * @version 1.4 04/23/99
  * @author Steve Wilson
  */
public class UISwitchListener implements PropertyChangeListener {
    JComponent componentToSwitch;

    public UISwitchListener(JComponent c) {
        componentToSwitch = c;
    }

    public void propertyChange(PropertyChangeEvent e) {
        String name = e.getPropertyName();
	if (name.equals("lookAndFeel")) {
	    SwingUtilities.updateComponentTreeUI(componentToSwitch);
	    componentToSwitch.invalidate();
	    componentToSwitch.validate();
	    componentToSwitch.repaint();
	}
    }
}

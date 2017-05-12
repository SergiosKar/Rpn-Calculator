package Guiclasses;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class CloseWindowAndExit extends WindowAdapter{
	public void windowClosing(WindowEvent closeWindowAndExit){
		System.exit(0);
	}
}

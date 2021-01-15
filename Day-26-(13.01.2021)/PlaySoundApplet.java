import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="PlaySoundApplet" width=300 height=100></applet> */

public class PlaySoundApplet extends Applet implements ActionListener {
    //The AudioClip interface is a simple abstraction for playing a sound clip
	AudioClip audioClip;
	
	Button play, stop;
   
	public void init(){
      play = new Button("  Play  ");
      add(play);
      play.addActionListener(this);
      stop = new Button("  Stop  ");
      add(stop);
      stop.addActionListener(this);
      audioClip = getAudioClip(getCodeBase(), "startfly.wav");
	}
	public void actionPerformed(ActionEvent ae){
      Button source = (Button)ae.getSource();
      if (source.getLabel() == "  Play  "){
         audioClip.play();
      }  
      else if(source.getLabel() == "  Stop  "){
         audioClip.stop();
      }
    }
}
/*  
<APPLET CODE="CheckerApplet.class" WIDTH=480 HEIGHT=320>
    <PARAM NAME="squareSize" VALUE="30">
    <PARAM NAME="color" VALUE="white">
</APPLET> 
*/
import java.applet.*;
import java.awt.*;

public class CheckerApplet extends Applet {
  int size = 0;
  String colorParam = "";
 
  public void init() {
 	String squareSizeParam = getParameter("squareSize");
 	size = Integer.parseInt(squareSizeParam);
 	colorParam = getParameter("color"); 
    setBackground (Color.gray);
 	setForeground (Color.white);
  }

  public void paint(Graphics g) {
  	g.drawString("The Size is " + size, 50, 50);
    g.drawString("The Color is " + colorParam, 50, 70);
  }

}


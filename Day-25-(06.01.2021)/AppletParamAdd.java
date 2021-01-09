package Assignment8;
/*
<APPLET CODE=AppletParamAdd.class" WIDTH=400 HEIGHT=300>
<PARAM NAME="n1" VALUE="20">
<PARAM NAME="n2" VALUE="10">
</APPLET>
*/
import java.awt.*;
import java.applet.*;
public class AppletParamAdd extends Applet{
	public void paint(Graphics g)
	{
		int a=Integer.parseInt(getParameter("n1"));
		int b=Integer.parseInt(getParameter("n2"));
		g.drawString("Sum-"+(a+b), 50, 70);
	}
}

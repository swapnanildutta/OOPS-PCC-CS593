import java.applet.*;
import java.awt.*;

/* <applet code="TableOfTwo.class" width=800 height=800></applet> */

public class TableOfTwo extends Applet {
public void paint(Graphics g)
{
Font f=new Font("Tahoma", Font.BOLD, 25);
g.setFont(f);
g.fillRect(50, 70, 600, 600);
g.setColor(Color.white);
int top=100;
int left=120;
for(Integer i=0;i<10;i++)
{
Integer b=(i+1)*2;
Integer c=i+1;
String s="2 * "+c.toString()+" = "+b.toString();
g.drawString(s, top, left+25*i);
}
}
}
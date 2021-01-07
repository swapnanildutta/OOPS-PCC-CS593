import java.awt.*;
import java.applet.*;
import java.net.*;

/* <applet code="AppletBases.class" width=300 height=250></applet> */

//URL means "Uniform Resource Locator"
//URL = Protocol + URI  (e.g. http://www.google.com)
//URI means "Uniform Resource Identifier"

public class AppletBases extends Applet {
  public void paint(Graphics gObj) 
  {
    String msg;
    URL url = getCodeBase(); // get code base
    msg = "Code base: " + url.toString();
    gObj.drawString(msg, 10, 20);
    url = getDocumentBase(); // get document base
    msg = "Document base: " + url.toString();
    gObj.drawString(msg, 10, 40);
  }
}

/* <applet code="AppletImage.class" width=400 height=300></applet> */

import java.applet.*; 
import java.awt.*; 
             
public class AppletImage extends Applet {
   //The MediaTracker class is a utility class to track the status of a number of media objects. 
   //Media objects could include audio clips as well as images, though currently only images are supported.
   MediaTracker tr;
   
   Image img;

   public void paint(Graphics g) {
      tr = new MediaTracker(this);
      img = getImage(getCodeBase(), "aot-logo.jpg");
      tr.addImage(img,0);
      g.drawImage(img, 0, 0, this);
   } 
}
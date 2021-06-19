import java.awt.*;
import java.applet.*;

/* <applet code="sample3" width=400 height=300>
</applet>
*/

public class sample3 extends Applet
{
	public void paint(Graphics g)
	{	
		setForeground(Color.red);
		g.drawRect(100,80,150,130);
		g.drawRect(60,50,230,30);
		g.setColor(Color.green);
		g.fillRect(60,50,230,30);
		g.drawRect(190,100,40,30);
		g.drawRect(120,100,40,30);
		g.drawRect(160,130,40,75);
	}
}


		 
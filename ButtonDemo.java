import java.awt.*;
import java.applet.*;
/* <applet code="ButtonDemo" width=250 height=150>
</applet>
*/

public class ButtonDemo extends Applet
{
	String msg="";
	Button yes,no,maybe;
	public void init()
	{
		yes=new Button("Yes");
		no=new Button("No");
		maybe=new Button("Maybe");
	add(yes);
	add(no);
	add(maybe);
	}
}
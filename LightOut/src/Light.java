import java.awt.Color;

import javax.swing.JButton;

public class Light extends JButton{
	boolean lon;
	int x;
	int y;
	public Light(int x,int y, boolean lon){
		this.lon=lon;
		this.x=x;
		this.y=y;
	}
	
	public void changeCol(){
		if(lon)this.setBackground(Color.YELLOW);
		else this.setBackground(Color.BLACK);
	}
}

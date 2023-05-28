import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Square_Num extends Applet implements ActionListener 
{
	TextField num, out;
	public void init() 
	{
		Label label = new Label("Enter a number :");
		this.add(label);
		num = new TextField(5);
		this.add(num);
		Button calc = new Button("Calculate");
		calc.addActionListener(this);
		this.add(calc);
		out = new TextField();
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		double n = Double.valueOf(num.getText());
		double sq = n * n;
		out.setText("Square of " + n + " is " + sq);
		this.add(out);
		revalidate();
	}
}
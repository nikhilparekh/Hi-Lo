import javax.swing.*;
public class Game {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Welcome to HI-LO v1.0.0 \nPress OK to Play.");
		Object[] options = {"Hi",
                "Lo"
                };
		boolean p=true;
		
		{
			int n = 1 + (int)(Math.random() * 10); 
			int op=JOptionPane.showOptionDialog(null, "The Number is: "+n+"\nThe Next Number Will Be ?", "Enter Hi-Lo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
			double m=1 + (int)(Math.random() * 10);
			while(p==true)
			if(op==JOptionPane.YES_OPTION && m>=n)
			{
				 n=1 + (int)(Math.random() * 10); 
				 op=JOptionPane.showOptionDialog(null, "The Number is: "+n+"\nThe Next Number Will Be ?", "Enter Hi-Lo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
				 m=1 + (int)(Math.random() * 10); 
			}
			else
			{
				int j=(int)m;
				JOptionPane.showMessageDialog(null, "Sorry You Lose. Try Again. The next number was "+j);
				p=false;
			}
		}

	}

}

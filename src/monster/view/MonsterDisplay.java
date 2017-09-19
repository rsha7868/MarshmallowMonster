package monster.view;

import javax.swing.JOptionPane;

public class MonsterDisplay
{
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	public String getResponse(String questonToDisplay)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, questonToDisplay);
		return answer;
	}
}


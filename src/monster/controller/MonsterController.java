package monster.controller;
import java.util.Scanner;

import monster.model.MarshmallowMonster;
import monster.view.MonsterDisplay;
public class MonsterController
import java.util.List;
import java.util.ArrayList;



private List<MarshmallowMonster> monsterList;
public MonsterController()
{
	popup = new MonsterDisplay();
	monsterList = new ArrayList<MarshmallowMonster>();
}

private MonsterDisplay popup;
//helper.methods

//private boolean isValidInteger(String sample)
//{
//	boolean valid = false;
//	try
//	{
//		Integer.parseInt(sample);
//		valid = true;
//	}
//	catch(NumberFormatException error)
//	{
//		popup.displayText("You need to input an int, " + sample + " is not valid.");
//	}

//public MonsterController()
{
	popup = new MonsterDisplay();
	int consumed = 0;
}

	public void start()
	{
		int count = 0;
				while(count < 10)
				{
					popup.displayText("Am I the best??!!");
					count +=2;
				}
		
		for(int loop = 0; loop < 10; loop += 1)
		{
			popup.displayText("This is loop # " + (loop + 1) + " of ten");
		}
		
		
		
		
		
		
		
		MarshmallowMonster basic = new MarshmallowMonster();
		//System.out.println(basic);
		popup.displayText(basic.toString());
		MarshmallowMonster fred = new MarshmallowMonster("Silly Fred Monster" ,7,3,6.7, true);
		//System.out.println(fred);
		popup.displayText(fred.toString());
		//System.out.println("I am feeling hungry, I am going to ea one of Fred's arms");
		popup.displayText("I am feeling hungry, I am going to ea one of Fred's arms");
		//fred.setArmCount(fred.getArmCount() - 1);
		System.out.println(fred);
		interactWithMonster(fred);
		
		monsterList.add(basic);
		monsterList.add(fred);
	}
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
//		Scanner myScanner = new Scanner(System.in);
		//System.out.println(currentMonster.getName() + " want to know how many eyes you want to eat, please type in how many");
		int consuumed;
		
		
		String Response = popup.getResponse(" want to know how many eyes you want to eat, please type in how many");
//		while(!isValidInteger(Response))
		{
			popup.displayText("grr type in a better answer next time");
//			response = popup.getResponse("Type in a integer value!");
		}
		
		
		
//		for(isValidInteger(response))
		{
//			consumed = Integer.parseInt(response);
		}
		
		//int consumed = myScanner.nextInt();
		//currentMonster.setEyeCount(currentMonster.getEyeCount()-consumed);
		System.out.println(currentMonster);
		//String answer = popup.displayText(currentMonster);

		//System.out.printl("how many arms are you interested in eating?, I have" + currentMonster.getArmCount());
		//Consumed = my Scanner.nextInt();
		//int armEat = myScanner.Int();
		
	for(int armEat = 0)
		{
			System.out.println("Not hungry? oh so sad...");
		}
		else if(armEat < 0)
		{
			System.out.println("Reality is hard for you - It is impossible to eat negative amount");
		}
		else if(armEat > currentMonster.getarmCount())
		{
			System.out.println("You aree not allowed to eat more than exist on me :/ :X");
		}
	
		else		{			currentMonster.setArmCount(currentMonster.getArmCount() - armEat());
		System.out.println("OK, now I have this any arms" + currentMonster.getArmCount());
			
		}
		
		//if(EyeEat == 0)
		{
			System.out.println("I cant see. Wait? Who is that...");
		}
		//else if(eyeEat < 0)
		{
			System.out.println("I'm being hunted by Humans but have to little of eyes, Oh no...");
		}
		//else
		{
		//	currentMonster.setEyeCount(currentMonster.getEyeCount() - eyeEat);
			System.out.println("Stop grabing my eyes" + currentMonster.getEyeCount());
		}
		{
			popup.displayText("Hi there ready to play???");
			String answer = popup.getResponse("What is the airspeed of a coconut laden swallow?");
		}
		
		
//		myScanner.close();
	
	double food = 0.0;
	//String tentacleResponse = popup.getrespnse("how many examples do you want to eat? I have" + String Tentacle + "Come on arms");
	private boolean isValidDouble(String sampleDouble)
	{
		boolean valid = false;
				
				return valid;
	//	try
	//	{
		//	Double.parseDouble(sampleDouble);
		//	valid = true;
		}
	//	catch(NumberFormatException error)
{
	//popup.displayText("You need to type in a double - " + sampleDouble + " does not matter");
	
	}
}
	//	return valid;
	//}
//}

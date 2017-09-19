package monster.controller;
import java.util.Scanner;

import monster.model.MarshmallowMonster;
public class MonsterController
{
	public void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
		System.out.println(basic);
		MarshmallowMonster fred = new MarshmallowMonster("Silly Fred Monster" ,7,3,6.7, true);
		System.out.println(fred);
		System.out.println("I am feeling hungry, I am going to ea one of Fred's arms");
		fred.setArmCount(fred.getarmCount() - 1);
		System.out.println(fred);
		interactWithMonster(fred);
	}
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println(currentMonster.getName() + " want to know how many eyes you want to eat, please type in how many");
		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount()-consumed);
		System.out.println(currentMonster);

		System.out.printl("how many arms are you interested in eating?, I have" + currentMonster.getArmCount());
		//Consumed = my Scanner.nextInt();
		int armEat = myScanner.Int();
		
		if(armEat == 0)
		{
			System.out.println("Not hungry? oh so sad...");
		}
		else if(armEat < 0)
		{
			System.out.println("Reality is hard for you - It is impossible to eat negative amount");
		}
		Else if(armEat > currentMonster.getArmCount())
		{
			System.out.println("You aree not allowed to eat more than exist on me :/ :X");
		}
	
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
			System.out.println("OK, now I have this amny arms" + currentMonster.getArmCount);
			
		}
		myScanner.close();
	}
}

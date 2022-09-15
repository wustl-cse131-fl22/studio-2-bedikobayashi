package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("How much money do you start out with?");
		double startAmount = in.nextDouble();
		
		System.out.println("What are the odds of winning? (Enter a decimal 0-1)");
		double winChance = in.nextDouble();
		
		System.out.println("How much do you want to win before quitting?");
		double winLimit = in.nextDouble();
		
		int simRun = 0 ;
		int numberPlays = 0;
		System.out.println("How many days will you simulate?");
		int totalsim = in.nextInt();
		while (simRun < totalsim)
			{simRun++ ; 
		
		while(startAmount > 0 && winLimit>startAmount)
			{boolean win = Math.random() <=winChance; 
			numberPlays++;
			{if (win == true)
					{startAmount ++ ;
					}
			else
					{startAmount --;
					}}
			if (startAmount == 0)
			System.out.println("Run number " + simRun + "Number plays " +numberPlays + "You're ruined!");
			if (startAmount == winLimit)
				System.out.println("Run number " + simRun + "Number plays " +numberPlays + "You've won!");
			}
			System.out.println(simRun);
			}
		
			
		
		
	
	}

}

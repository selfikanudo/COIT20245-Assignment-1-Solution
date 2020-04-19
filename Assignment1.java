import java.util.Scanner;

public class Assignment1 {
      public static void main(String[] args) {
	      	Scanner myObj = new Scanner(System.in);
	    	String userName;
	    	
	    	String t1;int g1;int b1;String t2;int g2;int b2;
         	Game[] g = new Game[5];
	          System.out.println("Enter results for each game in the round on a single line \nFormat is: team1 goals behinds team2 goals behinds \n");
	          for (int i=0;i<5;i++) 
	          {
		          	System.out.println("Game "+(i+1)+" of 5");
		          	userName = myObj.nextLine();
		          	String[] team1 = userName.split(" ");
		          	
			          if (team1.length == 6) 
			          {
				          	t1 = team1[0];
				          	g1 = Integer.parseInt(team1[1]);
				          	b1 = Integer.parseInt(team1[2]);
				          	t2 = team1[3];
				          	g2 = Integer.parseInt(team1[4]);
				          	b2 = Integer.parseInt(team1[5]);
				          	
				          	g[i] = new Game(t1,g1,b1,t2,g2,b2);
								
								// read and process final scores for each game
					          	if (g[i].winner() == "Match drawn: ") {
					          		System.out.println(g[i].winner()+" Match rating = "+g[i].rating());	
					          	}
					          	else
					          	System.out.println(g[i].winner()+g[i].margin()+" points: Match rating = "+g[i].rating());

			          }
			          else
			          {
			          	System.out.println("not work for more than 2 team");
			          }
	          }

		// display summary results
	        int biggest = g[0].margin();
 	    	int smallest = g[0].margin();
	    	int sum = g[0].margin();
	    	int average = 0;

	          System.out.println("\nSummary");

	          for (int i=0;i<5;i++) {
	          	sum += g[i].margin();
	          	if (g[i].margin() > biggest) 
	          	{
	          		biggest = g[i].margin();
	          	}
	          	else if (g[i].margin() < smallest)
	          	{
	          		smallest = g[i].margin();
	          	}
	          	average = sum/5;
	          }

	          System.out.println("Biggest margin was "+biggest);
	          System.out.println("Smallest margin was "+smallest);
	          System.out.println("Average margin was "+average);
      }
}

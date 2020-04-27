import java.util.Scanner;

public class Assignment1 {
      public static void main(String[] args) {
	      	Scanner myObj = new Scanner(System.in);
	    	String userName;
	    	
	    	String t1,t2;
	    	int g1,b1,g2,b2,t1_margin=0,t2_margin=0,t3_margin=0,t4_margin=0,t5_margin=0,biggest = 0,smallest = 0,sum = 0,average = 0;
         	System.out.println("Enter results for each game in the round on a single line \nFormat is: team1 goals behinds team2 goals behinds \n");
         	for (int i=0;i<5;i++) 
	        {
	        	System.out.println("Game "+(i+1)+" of 5");
		        userName = myObj.nextLine();
	     			t1 = userName.split(" ")[0];	
	              	g1 = Integer.parseInt(userName.split(" ")[1]);
			      	b1 = Integer.parseInt(userName.split(" ")[2]);
			      	t2 = userName.split(" ")[3];
			      	g2 = Integer.parseInt(userName.split(" ")[4]);
			     	b2 = Integer.parseInt(userName.split(" ")[5]);

				    Game g = new Game(t1,g1,b1,t2,g2,b2);
				    //if		
				    if (g.winner() == "Match drawn: ") {
					    System.out.println(g.winner()+" Match rating = "+g.rating());	
					}
				  	else
					  	System.out.println(g.winner()+g.margin()+" points: Match rating = "+g.rating());
					if (i==0) {
						t1_margin = g.margin();
					}
		          	else if (i==1){
		    			t2_margin = g.margin();
		    		}
		    		else if (i==2)
		    		{
		    			t3_margin = g.margin();
		    		}
		    		else if (i==3)
		    		{
		    			t4_margin = g.margin();
		    		}
		    		else if (i==4)
		    		{
		    			t5_margin = g.margin();
		    		}
			}
			
			//display summary results
			System.out.println("\nSummary");
			biggest = t1_margin;
			smallest = t1_margin;
			sum = t1_margin+t2_margin+t3_margin+t4_margin+t5_margin;
			average = sum/5;

			//if
			if (t1_margin > biggest) {
				biggest = t1_margin;
			}
			else if (t1_margin < smallest) {
				smallest = t1_margin;
			}
			
			if (t2_margin > biggest) {
				biggest = t2_margin;
			}
			else if (t2_margin < smallest) {
				smallest = t2_margin;
			}

			if (t3_margin > biggest) {
				biggest = t3_margin;
			}
			else if (t3_margin < smallest) {
				smallest = t3_margin;
			}

			if (t4_margin > biggest) {
				biggest = t4_margin;
			}
			else if (t4_margin < smallest) {
				smallest = t4_margin;
			}

			if (t5_margin > biggest) {
				biggest = t5_margin;
			}
			else if (t5_margin < smallest) {
				smallest = t5_margin;
			}
			System.out.println("Biggest margin was "+biggest);
	        System.out.println("Smallest margin was "+smallest);
	        System.out.println("Average margin was "+average);
      }
}

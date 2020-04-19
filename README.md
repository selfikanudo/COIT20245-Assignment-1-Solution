# COIT20245-Assignment-1
The application is to determine the winning teams for a round of Australian Rules football and to generate statistics for the round. In this particular league, there are 10 teams and a round consists of 5 games. For each game, the following data is to be entered from the keyboard:  
Name of team 1 
Goals scored by team 1 
Behinds scored by team 1 
Name of team 2 
Goals scored by team 2 
Behinds scored by team 2 
There are various ways in which this can be done. As shown below, I have chosen to enter all input values on a single line rather than on separate lines – the choice is yours. In Australian Rules football, a goal is worth 6 points and a behind is worth 1 point. The team with the most points is the winner of the game. If both teams have the same number of points, the game is designated a draw.  In addition to determining the outcome of each game, a rating for each game is to be displayed.  Our rating is an integer in the range 1-4 and is an attempt to measure the “excitement” associated with a particular game. Ratings are as follows

Rating	Criteria
4	       Winning margin is between 1 and 6 points inclusive or the game is drawn.
3	       Winning margin is between 7 and 24 points inclusive
2	       The winning margin is greater than 24 points, but both teams scored more than 100 points.
1	       All remaining results

When all games for the round have been processed, the smallest and largest margins are displayed, together with the average margin (as a non-rounded integer) for the round. An example run is shown below:
run:
Enter results for each game in the round on a single line
Format is: team1 goals behinds team2 goals behinds

Game 1 of 5
> t1 10 15 t2 12 3
t1(10 goals,15 behinds)  t2(12 goals,3 behinds)
Match drawn: Match rating = 4
Game 2 of 5
> t3 20 8 t4 20 10
t3(20 goals,8 behinds)  t4(20 goals,10 behinds)
t4 won by 2 points: Match rating = 4
Game 3 of 5
> t5 13 7 t6 12 12
t5(13 goals,7 behinds)  t6(12 goals,12 behinds)
t5 won by 1 points: Match rating = 4
Game 4 of 5
> t7 11 11 t8 11 17
t7(11 goals,11 behinds)  t8(11 goals,17 behinds)
t8 won by 6 points: Match rating = 4
Game 5 of 5
> t9 20 3 t10 15 9
t9(20 goals,3 behinds)  t10(15 goals,9 behinds)
t9 won by 24 points: Match rating = 3

Summary
Biggest margin was 24
Smallest margin was 0
Average margin was 6

You are not required to format the output exactly as in the run above, but the same information must be displayed. Note that the margin is always positive.  No data validation is required.
Only language constructs covered in weeks 1-6 are to be used. In particular, the use of arrays will be penalised. Coding guidelines are provided on the unit website. You are expected to follow the guidelines that are relevant to what you have been taught in weeks 1-6.
The application is to use the following classes and methods:
public class Game {
    // member declarations (private) go here
    
    public Game(String t1,int g1,int b1,String t2,int g2,int b2) {
        // set members here
        setMargin();
        setWinner();
        setRating();
    }
    
    private void setMargin() {
    }
    
    private void setWinner() {
    }
   
    private void setRating(){
    }

    // Getters
    public int margin() {
        return margin;
    }
    
    public String winner() {
        return winner;
    }
    
    public int rating() {
        return rating;
    } 
}
public class Assignment1 {
      public static void main(String[] args) {
           // create scanner object
		// read and process final scores for each game
		// display summary results
      }
}
The classes are to be included in your NetBeans project in two separate source files – Assignment1.java and Game.java.


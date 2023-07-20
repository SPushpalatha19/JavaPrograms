import java.util.Scanner;
class GameScore
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of games played");
      int total_games=sc.nextInt();
      int team[]=new int[total_games];
      int opposite_team[]=new int[total_games];
      for(int i=0;i<total_games;i++)
        {
          System.out.println("for game "+(i+1)+" enter team's score");
          team[i]=sc.nextInt();
          System.out.println("for game "+(i+1)+" enter opposite team's score");
          opposite_team[i]=sc.nextInt();
        }
      int team_score=0;
      int opposite_team_score=0;
      for(int i=0;i<total_games;i++)
        {
          team_score=team_score+team[i];
          opposite_team_score=opposite_team_score+opposite_team[i];
        }
      double team_avg=team_score/total_games;
      double opposite_team_avg=opposite_team_score/total_games;
      double avg_score=(team_avg+opposite_team_avg)/2;
      System.out.println("Average score is "+avg_score);
      int team_max=team[0];
      for(int i=0;i<total_games;i++)
        {
          if(team_max<team[i])
          {
            team_max=team[i];
          }
        }
      int opp_team_max=opposite_team[0];
      for(int i=0;i<total_games;i++)
        {
          if(opp_team_max<opposite_team[i])
          {
            opp_team_max=opposite_team[i];
          }
        }
      //int High_score=0;
      if(team_max<opp_team_max)
      {
        //High_score=opp_team_max;
        System.out.println("Highest Score is "+opp_team_max);
      }
      else
      {
       // High_score=team_max;
        System.out.println("Highest Score is "+team_max);
      }
      int team_min=team[0];
      for(int i=0;i<total_games;i++)
        {
          if(team_min>team[i])
          {
            team_min=team[i];
          }
        }
      int opp_team_min=opposite_team[0];
      for(int i=0;i<total_games;i++)
        {
          if(opp_team_min>opposite_team[i])
          {
            opp_team_min=opposite_team[i];
          }
        }
      //int low_score=0;
      if(team_min>opp_team_min)
      {
        //low_score=opp_team_min;
        System.out.println("lowest Score is "+opp_team_min);
      }
      else
      {
       // low_score=team_min;
        System.out.println("lowest Score is "+team_min);
      }
      int won=0,lost=0,tie=0;
      for(int i=0;i<total_games;i++)
        {
          if(team[i]>opposite_team[i])
          {
            won++;
          }
          else if(team[i]<opposite_team[i])
          {
            lost++;
          }
           else
          {
             tie++;
          }
        }
      System.out.println("Games won "+won);
      System.out.println("Games lost "+lost);
      System.out.println("Games tie "+tie);
      }
  }
import java.util.Scanner;
public class Boss {
  private boolean onedone;
  private boolean twodone;
  private boolean threedone;
  
  Room x = new Room();
  private int tscore = x.GetScore();
Boss () { //This is values that check if you have beat a room
  this.onedone = false;
  this.twodone = false;
  this.threedone = false;
}
  public void b1() {
    int tries = 0;
    boolean correct = false;
    Scanner sc = new Scanner(System.in);
    String answer = "";
    boolean wrong = false;
   if(onedone = false)  // checks if this room has already been completed
   {
     x.TextHelper("hey answer this question and you'll get a point");
     while (tries < 3 && correct == false) // let's you keep answering questions till you have 3 tries or you get the answer right
     {
        x.TextHelper("what's something that belongs to you but others use more often?");

        answer = sc.nextLine();
       if (answer.equalsIgnoreCase("name") || answer.equalsIgnoreCase("your name") || answer.equalsIgnoreCase("my name")) // checks is answer is right
        {
         x.TextHelper("Hey you got the answer right nice job");
        onedone = true;
        correct = true;
        x.SetScore(1);

        x.Room_select();
       }

       else // if you get the answer wrong 
       {
         x.TextHelper("bzzt try again");
         tries++;
       }

     }

    if (tries > 3) // when you break out of the loop but beacuase you ran out of tries
    {
      x.TextHelper("you ran out of tries my man, you gotta try again");
      x.Room_select();
    }
     

   }

   else if(onedone == true) // if you've already done this room, you'll select a new room
   {

     x.TextHelper("You've already done this room pal");
     x.Room_select();
   }



  }
}
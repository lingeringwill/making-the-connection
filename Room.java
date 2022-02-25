import java.util.Scanner;
class Room {
  private int room_num;
  private String player_name;
  private int score;


  public Room () {
        this.room_num = 0;
        this.player_name = "";
        this.score = 0;
    }  

  public void TextHelper(String x) {

    System.out.println(x);
  }
   
  public boolean Main_room() {//main loop where everything will run.
      TextHelper("Hello, you'll travel between 3 rooms and beat their challenges. Good luck");
      TextHelper("what is your name young one");

      Scanner input = new Scanner(System.in);
      player_name = input.nextLine();
      input.close();

      Scanner room = new Scanner(System.in);
      
      TextHelper("type in the room that you would like to go to");
        
      Room_select();
      while (score < 3) {
          
        }


  }
 public void Room_select() {
    Scanner input = new Scanner(System.in); // This will chnage the room number by taking in the users  input

    TextHelper("please enter in the room you'd like to enter");
    int change = input.nextInt();
    input.close();
     if (change == room_num) {
       System.out.println("you're already in that room, bozo");
     }

     else {
       room_num = change;
     }
        

  }

 
  
}
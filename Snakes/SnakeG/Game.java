package Snakes.SnakeG;
import java.util.*;





public class Game{


    private int chance=0;
	private char opt;

	Player p1=new Player("P1");
	Player p2=new Player("P2");
	Scanner sc=new Scanner(System.in);
	Random rand=new Random();
	int [][] board=new int[10][];




	public Game(){
		int c=1;
		for(int i=0;i<9;i++){
			board[i]=new int[10];
			for(int j=0;j<10;j++){
			board[i][j]=c;
			c++;
			}
		}
		board[9]=new int[11];
		for(int i=0;i<11;i++){
			board[9][i]=c;
			c++;
		}
	}




public void board(){  //board design
    int e=0;
    System.out.println("\n\n\t\t\t\tPlayer 1 Position:"+p1.pos+"\t\tPlayer 2 Position:"+p2.pos);





    System.out.println(" _______");
        for(int j=10;j>=0;j--){
            if(board[9][j]==101){

                if(board[9][j]==p1.pos)
                    System.out.println("|  "+"P1 "+"  |");
                else if(board[9][j]==p2.pos)
                    System.out.println("|  "+"P2 "+"  |");
                else
                    System.out.println("|  "+"END"+"  |");
                System.out.println(" ______________________________________________________________________________");
            }
            else if(board[9][j]==100){
                if(board[9][j]==p1.pos)
                    System.out.print("|  "+"P1"+"  |");
                else if(board[9][j]==p2.pos)
                    System.out.print("|  "+"P2"+"  |");
                else
                System.out.print("|  "+board[9][j]+" |");
            }
            else{
                if(board[9][j]==p1.pos)
                    System.out.print("|  "+"P1"+"  |");
                else if(board[9][j]==p2.pos)
                    System.out.print("|  "+"P2"+"  |");
                else{
                    if(board[9][j]==99)
        System.out.print("|  "+"S "+"  |");
    else
                System.out.print("|  "+board[9][j]+"  |");
            }

        }
    }
        System.out.println();
        System.out.println(" ______________________________________________________________________________");





    for(int i=8;i>=0;i--){

        if(e%2==0){
        for(int j=0;j<10;j++){
            if(board[i][j]<10){
                if(board[i][j]==p1.pos)
                    System.out.print("|  "+"P1"+"  |");
                else if(board[i][j]==p2.pos)
                    System.out.print("|  "+"P2"+"  |");
                else{
                    if(board[i][j]==9)
        System.out.print("|  "+"L "+"  |");
    else if(board[i][j]==16)
        System.out.print("|  "+"L "+"  |");
    else  if(board[i][j]==18)
        System.out.print("|  "+"L "+"  |");
    else if(board[i][j]==48)
        System.out.print("|  "+"L "+"  |");
    else  if(board[i][j]==50)
        System.out.print("|  "+"L "+"  |");
    else  if(board[i][j]==63)
        System.out.print("|  "+"L "+"  |");
    else  if(board[i][j]==32)
        System.out.print("|  "+"S "+"  |");
    else if(board[i][j]==74)
        System.out.print("|  "+"S "+"  |");
    else  if(board[i][j]==86)
        System.out.print("|  "+"S "+"  |");
    else
                System.out.print("|  0"+board[i][j]+"  |");
            }
            }
            else{
                if(board[i][j]==p1.pos)
                    System.out.print("|  "+"P1"+"  |");
                else if(board[i][j]==p2.pos)
                    System.out.print("|  "+"P2"+"  |");
                else{
                    if(board[i][j]==9)
        System.out.print("|  "+"L "+"  |");
    else if(board[i][j]==16)
        System.out.print("|  "+"L "+"  |");
    else  if(board[i][j]==18)
        System.out.print("|  "+"L "+"  |");
    else if(board[i][j]==48)
        System.out.print("|  "+"L "+"  |");
    else  if(board[i][j]==50)
        System.out.print("|  "+"L "+"  |");
    else  if(board[i][j]==63)
        System.out.print("|  "+"L "+"  |");
    else  if(board[i][j]==32)
        System.out.print("|  "+"S "+"  |");
    else if(board[i][j]==74)
        System.out.print("|  "+"S "+"  |");
    else  if(board[i][j]==86)
        System.out.print("|  "+"S "+"  |");
    else
            System.out.print("|  "+board[i][j]+"  |");}
        }

        }
    }
        else{
            for(int j=9;j>=0;j--){
                if(board[i][j]==p1.pos)
                    System.out.print("|  "+"P1"+"  |");
                else if(board[i][j]==p2.pos)
                    System.out.print("|  "+"P2"+"  |");
                else
                {
                    if(board[i][j]==9)
        System.out.print("|  "+"L "+"  |");
    else if(board[i][j]==16)
        System.out.print("|  "+"L "+"  |");
    else  if(board[i][j]==18)
        System.out.print("|  "+"L "+"  |");
    else if(board[i][j]==48)
        System.out.print("|  "+"L "+"  |");
    else  if(board[i][j]==50)
        System.out.print("|  "+"L "+"  |");
    else  if(board[i][j]==63)
        System.out.print("|  "+"L "+"  |");
    else  if(board[i][j]==32)
        System.out.print("|  "+"S "+"  |");
    else if(board[i][j]==74)
        System.out.print("|  "+"S "+"  |");
    else  if(board[i][j]==86)
        System.out.print("|  "+"S "+"  |");
    else
            System.out.print("|  "+board[i][j]+"  |");
        }
    }
        }
        System.out.println();
        System.out.println(" ______________________________________________________________________________");
        e++;
    }



}








int dice(){                              //dice random number method
    return (rand.nextInt(6)+1);
}







public void game(){                             //main game method
    while(true){
    if(p1.w==1){
        System.out.println("\n\n\t\t\t\t\t'''  Player 1 won  '''\n\n");

        break;
    }
    else if(p2.w==1){
        System.out.println("\n\n\t\t\t\t\t'''  Player 2 won  '''\n\n");

        break;
    }
    if(chance%2==0){
        System.out.println("..Player 1 enter D for rolling dice..");
        opt=sc.next().charAt(0);
        if(opt=='d'||opt=='D')
            roll(p1,1);
        else {System.out.println("..Enter valid Key!!..");continue;}
    }
    else{
        System.out.println("..Player 2 enter D for rolling dice..");
        opt=sc.next().charAt(0);
        if(opt=='d'||opt=='D')
            roll(p2,2);
        else {System.out.println("..Enter valid Key!!..");continue;}
    }
    chance++;
    }
}





void roll(Player p,int f){                               //Dice roll condition check method
    int count=0,sum=0,d;
    while(true){
        if(count==3){
            sum=0;
            break;
        }
        d=dice();
        System.out.println("\t\t\t\t\t\t_______\n\n"+"\t\t\t\t\t\t|  "+d+"  |"+"\n\t\t\t\t\t\t_______");
        if(d==6){
            if(p.u==0)
                p.u=1;
            else{
            sum=sum+d;
             }
        count++;
        }
        else{
            sum=sum+d;
            break;
        }

    }
    if(p.u==1){
        move(p,sum);
        if(p1.pos==p2.pos){
            if(f==1){
                p2.pos=0;
                p2.u=0;
                System.out.println("\n\n\t\t\t\t\t"+"P1 Smashed!! P2");
            }
            else if(f==2){
                p1.pos=0;
                p1.u=0;
                System.out.println("\n\n\t\t\t\t\t"+"P2 Smashed!! P1");
            }
        }
    }
    System.out.println("\n\n\n\n");
    board();

}



void move(Player p,int m){           //condition check and move position method for snake
    int temp=p.pos+m;
    if(temp>100&&temp!=101);
    else if(temp==9){
        p.pos=31;
        System.out.println("\n\n\t\t\t\t\t"+p.n+" "+"Ladder Ahead!! (Deployed to 31)");
    }
    else if(temp==16){
        p.pos=45;
        System.out.println("\n\n\t\t\t\t\t"+p.n+" "+"Ladder Ahead!! (Deployed to 45)");
    }
    else  if(temp==18){
        p.pos=64;
        System.out.println("\n\n\t\t\t\t\t"+p.n+" "+"Ladder Ahead!! (Deployed to 64)");
    }
    else if(temp==48){
        p.pos=66;
        System.out.println("\n\n\t\t\t\t\t"+p.n+" "+"Ladder Ahead!! (Deployed to 66)");
    }
    else  if(temp==50){
        p.pos=93;
        System.out.println("\n\n\t\t\t\t\t"+p.n+" "+"Ladder Ahead!! (Deployed to 93)");
    }
    else  if(temp==63){
        p.pos=81;
        System.out.println("\n\n\t\t\t\t\t"+p.n+" "+"Ladder Ahead!! (Deployed to 81)");
    }
    else  if(temp==32){
        p.pos=6;
        System.out.println("\n\n\t\t\t\t\t"+p.n+" "+"Biten By Snake!! (Dropped to 6)");
    }
    else if(temp==74){
        p.pos=22;
        System.out.println("\n\n\t\t\t\t\t"+p.n+" "+"Biten By Snake!! (Dropped to 22)");
    }
    else  if(temp==86){
        p.pos=51;
        System.out.println("\n\n\t\t\t\t\t"+p.n+" "+"Biten By Snake!! (Dropped to 51)");
    }
    else  if(temp==99){
        p.pos=39;
        System.out.println("\n\n\t\t\t\t\t"+p.n+" "+"Biten By Snake!! (Dropped to 39)");
    }
    else
        p.pos=p.pos+m;
    if(temp==101){
        p.w=1;
        p.pos=101;
    }


}

public void again(){
    System.out.println("Play Again (Y/N)");
    char opt=sc.next().charAt(0);
    if(opt=='y' ||  opt=='Y'){
        p1.pos=0;               //initial postion set to zero
        p1.u=0;                 //Flag for unlock
        p1.w=0;
        p2.pos=0;               //initial postion set to zero
        p2.u=0;                 //Flag for unlock
        p2.w=0;
        board();
        game();
    }
    else{
    	System.out.println("Good Bye!! ");

    }
}



}
package Snakes.SnakeG;

public class Player{                        //player class storing player data
	int pos, u, w;
	String n;
	Player(){

	}
	public Player(String name){


		pos=0;               //initial postion set to zero
        u=0;                 //Flag for unlock
        w=0;                 //Flag for Win
        n=name;
	}
}
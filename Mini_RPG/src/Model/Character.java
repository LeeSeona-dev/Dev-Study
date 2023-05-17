package Model;

public abstract class Character extends Creature {

	public Character(int hp, int op, int dp) {
		super(hp, op, dp);
		
	}
	public abstract void itemUse(itemVO item);
	
	public abstract void itemUnUse();
}

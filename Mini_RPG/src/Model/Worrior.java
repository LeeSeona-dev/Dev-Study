package Model;

public class Worrior extends Character implements Defensible {

	
	private swordVO equippeditem;
	public Worrior(int hp, int op, int dp) {
		super(hp, op, dp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void defence() {
		System.out.println("전사 방어");
		
	}

	@Override
	public void itemUse(itemVO item) {
		System.out.println("전사 아이템 사용 ");
		if(item instanceof swordVO) {
			this.equippeditem = (swordVO)item;
		}
		
	}

	@Override
	public void itemUnUse() {
		System.out.println("전사 아이템 해제 ");
		
	}

	@Override
	public void attack() {
		System.out.println("전사 공격 ");
		
	}

	@Override
	public void printInfo() {
		System.out.println("전사 정보");
		
	}

}

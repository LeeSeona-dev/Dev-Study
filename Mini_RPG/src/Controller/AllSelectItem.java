package Controller;

import java.util.ArrayList;

import Model.BowVO;
import Model.DAO;
import Model.itemVO;

public class AllSelectItem {
	public void rangeAll(int select) {
		if(select ==1) {
			AllWeapon();
		}else if(select == 2) {
			allSword();
		}else if (select==3) {
			
		}else {
			System.out.println("잘못된 선택입니다.");
		}
	}
	
	public void AllWeapon() {
		DAO dao = new DAO();
		ArrayList<itemVO> bowList = dao.BowchekAll();
		ArrayList<itemVO> swordList = dao.SwordcheckAll();
		ArrayList<itemVO> itemList = new ArrayList<>();
		itemList.addAll(bowList);
		itemList.addAll(swordList);
		
		System.out.println("num\t name\t power \tdurability");
		System.out.println("----------------------");
		for(itemVO item: itemList) {
			
			System.out.print(item.getItemNum()+"\t");
			System.out.print(item.getName()+"\t");
			System.out.print(item.getAttackPower()+"\t");
			//sword 는 durability가 없음.
			try {
				System.out.println(((BowVO)item).getDurability());
			}catch(Exception classCasException) {
				
			}
			System.out.println();
			
		}
	}
	public void allSword() {
		DAO dao = new DAO();
		ArrayList<itemVO> Sword_db = dao.SwordcheckAll();
		System.out.println("num\t name\t power");
		System.out.println("----------------------");
		for(itemVO SwordObject:Sword_db) {
			System.out.print(SwordObject.getItemNum()+"\t");
			System.out.print(SwordObject.getName()+"\t");
			System.out.print(SwordObject.getAttackPower()+"\t");
		}
	}
	
	public void allBow() {
		DAO dao = new DAO();
		ArrayList<itemVO> Bow_db = dao.BowchekAll();
		System.out.println("num\t name\t power \tdurability");
		System.out.println("----------------------");
		for(itemVO BowObject:Bow_db) {
			System.out.print(BowObject.getItemNum()+"\t");
			System.out.print(BowObject.getName()+"\t");
			System.out.print(BowObject.getAttackPower()+"\t");
			System.out.println(((BowVO)BowObject).getDurability());
		}
	}
	
	

}

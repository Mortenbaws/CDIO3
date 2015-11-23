package fields;

import entities.Player;

/**
 * Date: 23/11/2015
 *
 * Project: 25_CDIO3
 *
 * File: Tax.java
 *
 * Created by: Morten J�rvad
 *
 * Github: https://github.com/Mortenbaws
 *
 * Email: morten2094@gmail.com
 */

public class Tax extends Field{

	private int taxAmount;
	private static int taxRate = -1;
	
	public Tax(String name, int taxAmount) {
		super(name);
		this.taxAmount = taxAmount;
	}
	
	public int getTaxAmount(){
		return taxAmount;
	}

	@Override
	public void landOn(Player player) {
	}

	@Override
	public String fieldText() {
		return "You have to pay "+taxAmount+".";
	}
	
	

}
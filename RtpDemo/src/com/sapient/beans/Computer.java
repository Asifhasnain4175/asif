package com.sapient.beans;

public class Computer extends Product {

	private String mboard;

	public Computer(int id, String pname, double price, String mboard) {
		super(id, pname, price);
		this.mboard = mboard;
	}

	public String isExpensive() {
		if (getPrice() >= 45000)
			return "costlier";
		else
			return "average";
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return super.display() + " " + mboard;
	}

}

package com.sapient.beans;

public class Camera extends Product {

	private String lens;

	public Camera(int id, String pname, double price, String lens) {
		super(id, pname, price);
		this.lens = lens;
	}

	@Override
	public String isExpensive() {
		if (getPrice() >= 10000)
			return "costlier";
		else
			return "average";
	}

	@Override
	public String display() {
		return super.display() + " " + lens;
	}

}

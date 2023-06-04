package com.yedam.HomeWork;

import java.util.Scanner;

public class Product {
	String name;
	int price;

	

	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}

	void showInfo() {
		System.out.printf("상품명 : %d   가격 : %d \n", name, price);
	}
	


}
			



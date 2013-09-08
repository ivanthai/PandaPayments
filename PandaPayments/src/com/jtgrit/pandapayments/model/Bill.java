package com.jtgrit.pandapayments.model;

import java.util.List;

import org.json.JSONObject;

public class Bill {
	private double amount;
	private int numItems;
	private double tax;
	private double tip;
	private int numPersons;
	private int taxPercent;
	private List<Item> items;
	
	public Bill(JSONObject obj) {
		
	}
	
	public Bill(double amount, int numItems, double tax, double tip) {
		this.amount = amount;
		this.numItems = numItems;
		this.tax = tax;
		this.tip = tip;
	}
	
	public double[] getEvenSplit() {
		for (Item item: items ) {
			item.setCost(amount/numItems);
		}
	}
	
	public double[] addTax() {
		for (Item item: items ) {
			double curCost = item.getCost()
			double newCost = curCost + curCost * taxPercent 
			item.setCost(newCost);
		}
		
	}
}

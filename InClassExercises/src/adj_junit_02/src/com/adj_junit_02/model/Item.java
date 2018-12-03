package com.adj_junit_02.model;

public class Item {
	private int itemId;
	private String itemDescription;
	private int itemQuantity;
	
	public Item() {
		
	}
	
	public Item(int id, String description, int stock) {
		this.itemId = id;
		this.itemDescription = description;
		this.itemQuantity= stock;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Item) {
			Item other = (Item) obj;
			boolean id = this.itemId == other.getItemId();
			boolean itemDsc = this.itemDescription.equals(other.getItemDescription());
			boolean itemQuan = this.itemQuantity == other.getItemQuantity();
			if (id && itemDsc && itemQuan) return true;
		}
		return false;
	}
	
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
}

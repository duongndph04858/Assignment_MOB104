package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PURCHASE_ITEM")
public class PURCHASE_ITEM {
@Id
@Column(name="id")
@GeneratedValue
private int id;
@ManyToOne
@JoinColumn(name="purchase_id")
private PURCHASE purchase_id;
@ManyToOne
@JoinColumn(name="product_id")
private PRODUCT product;
@Column(name="amount")
private int amount;
@Column(name="price")
private long price;
public PURCHASE_ITEM() {
	super();
	// TODO Auto-generated constructor stub
}



public PURCHASE_ITEM(int id, PURCHASE purchase_id, PRODUCT product, int amount, long price) {
	super();
	this.id = id;
	this.purchase_id = purchase_id;
	this.product = product;
	this.amount = amount;
	this.price = price;
}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public PURCHASE getPurchase_id() {
	return purchase_id;
}
public void setPurchase_id(PURCHASE purchase_id) {
	this.purchase_id = purchase_id;
}
public PRODUCT getProduct() {
	return product;
}
public void setProduct(PRODUCT product) {
	this.product = product;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}


public long getPrice() {
	return price;
}



public void setPrice(long price) {
	this.price = price;
}


}

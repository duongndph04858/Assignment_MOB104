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
public class PurchaseItem {
@Id
@Column(name="id")
@GeneratedValue
private int id;
@ManyToOne
@JoinColumn(name="purchase_id")
private Purchase purchase_id;
@ManyToOne
@JoinColumn(name="product_id")
private Product product;
@Column(name="amount")
private int amount;
@Column(name="price")
private long price;
public PurchaseItem() {
	super();
	// TODO Auto-generated constructor stub
}



public PurchaseItem(int id, Purchase purchase_id, Product product, int amount, long price) {
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
public Purchase getPurchase_id() {
	return purchase_id;
}
public void setPurchase_id(Purchase purchase_id) {
	this.purchase_id = purchase_id;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
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

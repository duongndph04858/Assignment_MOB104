package entity;

import java.io.Serializable;

public class Cart implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String product_id;
	private PRODUCT product;
	private int quantity ;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Cart(String product_id, PRODUCT product) {
		super();
		this.product_id = product_id;
		this.product = product;
		this.quantity = 1;
	}


	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public PRODUCT getProduct() {
		return product;
	}


	public void setProduct(PRODUCT product) {
		this.product = product;
	}
	
	
	
}

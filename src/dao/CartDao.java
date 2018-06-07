package dao;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import entity.Cart;

@Component
public class CartDao extends HashMap<String, Cart> {

	private static final long serialVersionUID = 1L;
	 public CartDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void addToCart(Cart cart) {
		if(this.containsKey(cart.getProduct_id())) {
		int oldQuantity = ((Cart) this.get(cart.getProduct_id())).getQuantity();
		((Cart) this.get(cart.getProduct_id())).setQuantity(oldQuantity+1);
		
		}else {
			this.put(cart.getProduct_id(),cart);
		}
	}
	
}

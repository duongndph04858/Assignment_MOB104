package entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class PRODUCT {
	@Id
	@Column(name="id")
	private String id;
	@OneToMany(mappedBy="product_colors",fetch= FetchType.EAGER)
	private List<PRODUCT_COLORS> product_colors = new ArrayList<>();
	@OneToMany(mappedBy="product_properties",fetch= FetchType.EAGER)
	private List<PROPERTIES> product_properties = new ArrayList<>();
	@Column(name="name")
	private String name;
	@Column(name="price")
	private long price;
	@Column(name="producer")
	private String producer;
	@Column(name="amount")
	private int amount;
	@Column(name="description")
	private String description;
	public PRODUCT() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PRODUCT(String id, String name, long price, String producer, int amount, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.producer = producer;
		this.amount = amount;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public List<PRODUCT_COLORS> getProduct_colors() {
		return product_colors;
	}
	public void setProduct_colors(List<PRODUCT_COLORS> product_colors) {
		this.product_colors = product_colors;
	}
	public List<PROPERTIES> getProduct_properties() {
		return product_properties;
	}
	public void setProduct_properties(List<PROPERTIES> product_properties) {
		this.product_properties = product_properties;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}

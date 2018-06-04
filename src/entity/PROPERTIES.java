package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PROPERTIES")
public class PROPERTIES {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@ManyToOne
	@JoinColumn(name="product_id")
	private PRODUCT product_properties;
	@Column(name="monitor")
	private String monitor;
	@Column(name="os")
	private String os;
	@Column(name="camera")
	private String camera;
	@Column(name="front_camera")
	private String front_camera;
	@Column(name="cpu")
	private String cpu;
	@Column(name="ram")
	private String ram;
	@Column(name="ROM")
	private String rom;
	@Column(name="sim")
	private String sim;
	@Column(name="pin")
	private String pin;
	public PROPERTIES() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PROPERTIES(int id, PRODUCT product_properties, String monitor, String os, String camera, String front_camera,
			String cpu, String ram, String rom, String sim, String pin) {
		super();
		this.id = id;
		this.product_properties = product_properties;
		this.monitor = monitor;
		this.os = os;
		this.camera = camera;
		this.front_camera = front_camera;
		this.cpu = cpu;
		this.ram = ram;
		this.rom = rom;
		this.sim = sim;
		this.pin = pin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PRODUCT getProduct_properties() {
		return product_properties;
	}
	public void setProduct_properties(PRODUCT product_properties) {
		this.product_properties = product_properties;
	}
	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public String getFront_camera() {
		return front_camera;
	}
	public void setFront_camera(String front_camera) {
		this.front_camera = front_camera;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getRom() {
		return rom;
	}
	public void setRom(String rom) {
		this.rom = rom;
	}
	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
}

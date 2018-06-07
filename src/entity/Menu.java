package entity;

public class Menu {
	private String name;
	private String url;
	private boolean active;
	
	public Menu(String name, String url, boolean active) {
		super();
		this.name = name;
		this.url = url;
		this.active = active;
	}

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}

package cc.wanforme.nukkit.springDemo;


public class DashInfo {

	private int id;
	
	private String name;

	public DashInfo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DashInfo [id=" + id + ", name=" + name + "]";
	}
	
}

package nl.tue.tm.is.epc;

public class Node{

	String id = "";
	String name = "";
	String type = "basic";
	
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
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public boolean equals(Object arg0) {
		if (arg0.getClass().getSimpleName().equals(this.getClass().getSimpleName())){
			return id.equals(((Node)arg0).getId());
		}else{
			return false;
		}
	}
	public int hashCode() {
		return id.hashCode();
	}
}

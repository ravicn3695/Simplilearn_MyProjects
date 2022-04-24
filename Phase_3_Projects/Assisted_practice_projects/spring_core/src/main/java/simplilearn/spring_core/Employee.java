package simplilearn.spring_core;

public class Employee { // POJO or Bean or Entity
	
	private int eid;
	private String ename;
	
	public Employee() { //default constructor
		System.out.println("Employee object is created...");
	}
	
	public Employee(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
    }
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	

}

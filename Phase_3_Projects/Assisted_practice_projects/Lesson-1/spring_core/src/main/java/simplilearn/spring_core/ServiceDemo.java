package simplilearn.spring_core;

public class ServiceDemo {
	
	private DAO dao;
	
	public ServiceDemo() {
		
	}

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}

	public ServiceDemo(DAO dao) {
		super();
		this.dao = dao;
	}
	

}

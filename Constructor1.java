public class employee {
	private int eid;
	private String ename;
	private Department eDept;
	
	public employee() {}
	
	public employee(int eid, String ename, Department eDept) {
		this.eid=eid;
		this.ename=ename;
		this.eDept=eDept;
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

	public Department geteDept() {
		return eDept;
	}

	public void seteDept(Department eDept) {
		this.eDept = eDept;
	}
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", ename=" + ename + ", eDept=" + eDept + "]";
	}
	
	
}

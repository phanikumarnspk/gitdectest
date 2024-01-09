public class Department {
	
	private String dname;
	private int dnum;
	private String dloc;
	
	public Department()
	{}
	
	public Department(String dname, int dnum, String dloc) {
		this.dname=dname;
		this.dnum=dnum;
		this.dloc=dloc;
		
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getDnum() {
		return dnum;
	}

	public void setDnum(int dnum) {
		this.dnum = dnum;
	}

	public String getDloc() {
		return dloc;
	}

	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	
	
	
}

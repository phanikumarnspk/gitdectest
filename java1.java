public class Test {
	public static void main(String[] args) {
		Department d = new Department();
		d.setDnum(245);
		d.setDname("DEv");
		d.setDloc("Hyderabad");
		
		employee e = new employee();
		e.setEid(101);
		e.setEname("KL Rahul");
		e.seteDept(d);
		
		Department t = e.geteDept();
		System.out.println(e.getEid()+" = "+e.getEname());
		System.out.println(t.getDnum()+" = "+t.getDname()+" = "+t.getDloc());
		
	}
}

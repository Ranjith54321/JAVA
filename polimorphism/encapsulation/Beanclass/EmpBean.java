/* 
     bean class contains private properties and public setters and getters
 */
class EmpBean{

	private int	eid;
	private String ename;

	// setters (used to get the name from client and set it to the variables)
	public void seteid(int eid){
		this.eid = eid;
	}
	public void setename(String ename){
		this.ename = ename;
	}

	// getters (it is used to send the value to the client)

	public int geteid(){
		return eid;
	}
	public String getename(){
		return ename;
	}
}
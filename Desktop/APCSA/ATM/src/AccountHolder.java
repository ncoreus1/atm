public class AccountHolder {
	private int ssn;
	private String name;
	private long phone;
	private String address;
	
	//getters & setters
	AccountHolder (int ssn, String name, long phone, String address) {
		this.ssn = ssn;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getssn(int ssn) {
		return ssn;
	} 
	
	public long getPhone(long phone) {
		return phone;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public String getAddress(String address) {
		return address;
	}
	
}
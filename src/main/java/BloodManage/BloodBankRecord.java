package BloodManage;

public class BloodBankRecord {
	private int slNo;
	private String name;
	private String email;
	private String phonenumber;
	private String bloodgroup;
	private String status;
	private String available;

	public BloodBankRecord(int slNo, String name, String email, String phonenumber,String bloodgroup, String status,String available) {
		this.slNo=slNo;
		this.name=name;
		this.email=email;
		this.phonenumber=phonenumber;
		this.bloodgroup=bloodgroup;
		this.status=status;
		this.available=available;
	}
	
	public int getSlNo() 
	{
		return slNo;
		}
	
	public String getName() 
	{
		return name;
		}
	
	public String getEmail() 
	{
		return email;
		}
	
	public String getPhonenumber() 
	{
		return phonenumber;
		}
	
	public String getBloodgroup() 
	{
		return bloodgroup;
		}
	
	public String getstatus()
	{
		return status;
		}
	
	public String getAvailable()
	{
		return available;
		}
	
	public void setAvailable(String available) {
		this.available=available;
	}
	
}

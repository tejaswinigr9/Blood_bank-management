package BloodManage;

public class BloodRequest {
	private int sl_no;
	private String name;
	private String email;
	private String phonenumber;
	private String bloodgroup;
	private String status;
	private String available;

	public BloodRequest(int sl_no, String name, String email, String phonenumber,String bloodgroup, String status,String available) {
		this.sl_no=sl_no;
		this.name=name;
		this.email=email;
		this.phonenumber=phonenumber;
		this.bloodgroup=bloodgroup;
		this.status=status;
		this.available=available;
	}
	
	public int getSlNo() 
	{
		return sl_no;
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
	
	public String getStatus()
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

package BloodManage;

public class BankRequest {
		
		    private int slno;
	        private String name;
	        private String phone;
	        private String email;
	        private String bloodgroup;
	        private String status;
	        private String available;

		public BankRequest(int slno, String name, String phone, String email, String bloodgroup,String status, String available) {
			this.slno = slno;
			this.name = name;
	        this.phone = phone;
	        this.email = email;
	        this.bloodgroup = bloodgroup;
	        this.status = status;
	        this.available = available;
	    }
		
		
		public int getslno() {
	        return slno;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getBloodgroup() {
	        return bloodgroup;
	    }
	    
	    public String getStatus() {
	        return status;
	    }

	    public String getAvailable() {
	        return available;
	    }
		
	}





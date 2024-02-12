package com.userView;

public class Users {
	
	private String userId;
	private String userName;
    private String inquiries;
    private String type;
    
    
	public Users(String userId, String userName, String inquiries, String type) {
		
		this.userId = userId;
		this.userName = userName;
		this.inquiries = inquiries;
		this.type = type;
	}


	public String getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName;
	}

	public String getInquiries() {
		return inquiries;
	}

	public String getType() {
		return type;
	}


	
    

}

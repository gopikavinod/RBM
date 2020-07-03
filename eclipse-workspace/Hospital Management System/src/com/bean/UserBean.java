package com.bean;

public class UserBean {
	
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String usertype;
    private String lastlogged;
    private int loggedstatus;
    
    public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getLastlogged() {
		return lastlogged;
	}

	public void setLastlogged(String lastlogged) {
		this.lastlogged = lastlogged;
	}

	public int getLoggedstatus() {
		return loggedstatus;
	}

	public void setLoggedstatus(int loggedstatus) {
		this.loggedstatus = loggedstatus;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean valid;
	
	
    public String getFirstName() {
       return firstName;
	}

    public void setFirstName(String newFirstName) {
       firstName = newFirstName;
	}

	
    public String getLastName() {
       return lastName;
			}

    public void setLastName(String newLastName) {
       lastName = newLastName;
			}
			

    public String getPassword() {
       return password;
	}

    public void setPassword(String newPassword) {
       password = newPassword;
	}
	
			
    public String getUsername() {
       return username;
			}

    public void setUserName(String newUsername) {
       username = newUsername;
			}

				
    public boolean isValid() {
       return valid;
	}

    public void setValid(boolean newValid) {
       valid = newValid;
	}	
}

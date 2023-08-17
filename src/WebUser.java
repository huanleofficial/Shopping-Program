public class WebUser extends Customer {
	private String loginID;
	private String password;
	private UserState state;

	public WebUser() {
		super();
		this.loginID = "";
		this.password = "";
		this.state = UserState.New;
	}

	// Parametrized Constructor
	public WebUser(String webLogID, String webLogPassword) {
		super();
		this.loginID = webLogID;
		this.password = webLogPassword;
		this.state = UserState.New;
	}

	// Password accessor/getter
	public void setPassword(String password) {
		this.password = password;
	}

	// UserState new mutator/setter
	public void setNew() {
		this.state = UserState.New;
	}

	// UserState active mutator/setter
	public void setActive() {
		this.state = UserState.Active;
	}

	// UserState blocked mutator/setter
	public void setBlocked() {
		this.state = UserState.Blocked;
	}

	// UserState banned mutator/setter
	public void setBanned() {
		this.state = UserState.Banned;
	}

	// UserState accessor/getter
	public UserState getState() {
		return this.state;
	}

	// toString printing method for web user information
	public String toString() {
		return "Web User ID: " + loginID + "\nUser State: " + state;
	}
}
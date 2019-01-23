package navigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DynamicNavigationBean {

	private String name;
	private String password;
	private int counter = 0;
	private boolean locked = false;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public String login() {

		if (name.equals("BerkayDemirel") && password.equals("jsf")) {
			counter = 0;
			locked = false;
			return "success";
		}
		counter++;
		if (locked) {
			return "locked";
		}
		return "failure";
	}

	public String checkCounter() {

		if (counter > 3) {
			locked = true;
			return "locked";
		} else {
			return "retry";
		}
	}

}

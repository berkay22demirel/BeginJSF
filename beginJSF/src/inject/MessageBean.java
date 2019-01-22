package inject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "message")
@RequestScoped
public class MessageBean {

	String message = "Welcome to www.berkay22demirel.com.tr   -    ";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

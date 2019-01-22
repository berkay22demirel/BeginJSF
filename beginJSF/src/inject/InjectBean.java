package inject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class InjectBean {

	@ManagedProperty(value = "#{message}")
	private MessageBean messageBean;
	private String name;

	public MessageBean getMessageBean() {
		return messageBean;
	}

	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {

		if (name == null || name.equals("")) {

			return "";

		} else {

			return messageBean.getMessage().concat(name);

		}

	}

}

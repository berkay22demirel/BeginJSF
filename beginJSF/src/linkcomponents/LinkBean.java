package linkcomponents;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LinkBean {

	public String navigateString = "page1";

	public String navigate() {
		return "page1";
	}

	public String getNavigateString() {
		return navigateString;
	}

	public void setNavigateString(String navigateString) {
		this.navigateString = navigateString;
	}

}

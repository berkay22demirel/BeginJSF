package outputcomponents;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OutputComponentsBean {

	public String text = "Bean Text";

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}

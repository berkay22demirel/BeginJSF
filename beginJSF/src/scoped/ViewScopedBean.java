package scoped;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ViewScopedBean {

	String view;

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public int getHashCode() {

		return super.hashCode();
	}
	
	
}

package scoped;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ApplicationScopedBean {

	String application;

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public int getHashCode() {

		return super.hashCode();
	}

}

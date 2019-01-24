package sectioncomponents;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CheckboxBean {

	private boolean check;
	private String[] languages = { "Java" };
	private String[] jpaFrameworks = {"Hibernate"};

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public String[] getJpaFrameworks() {
		return jpaFrameworks;
	}

	public void setJpaFrameworks(String[] jpaFrameworks) {
		this.jpaFrameworks = jpaFrameworks;
	}

	public String[] getPreparedJpaFrameworks() {
		return new String[] { "EclipseLink", "Hibernate", "OpenJPA",
				"DataNucleus" };
	}

}

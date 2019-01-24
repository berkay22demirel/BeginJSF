package facelets;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TemplateBean {

	String headerContent = "Header Content";
	String content = "Content";
	String footerContent = "Footer Content";

	public String getHeaderContent() {
		return headerContent;
	}

	public void setHeaderContent(String headerContent) {
		this.headerContent = headerContent;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFooterContent() {
		return footerContent;
	}

	public void setFooterContent(String footerContent) {
		this.footerContent = footerContent;
	}

}

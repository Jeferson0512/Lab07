package com.tecsup.lab7.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userDataManyCheckbox", eager = true)
@SessionScoped
public class UserDataManyCheckbox {

	private static final long serialVersionUID = 1L;

	public String[] data = { "1", "2", "3" };

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

}

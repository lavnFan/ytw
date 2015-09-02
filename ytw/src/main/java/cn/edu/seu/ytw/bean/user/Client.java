package cn.edu.seu.ytw.bean.user;

import java.awt.Image;

public class Client extends User{

	private Image clientImage;//自定义头像
	private String CitizenIDCardNumber;//公民身份证号

	public Image getClientImage() {
		return clientImage;
	}

	public void setClientImage(Image clientImage) {
		this.clientImage = clientImage;
	}

	public String getCitizenIDCardNumber() {
		return CitizenIDCardNumber;
	}

	public void setCitizenIDCardNumber(String citizenIDCardNumber) {
		CitizenIDCardNumber = citizenIDCardNumber;
	}
	
}

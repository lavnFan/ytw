package cn.edu.seu.ytw.bean.user;

import java.awt.Image;

public class Client extends User{

	private Image clientImage;//�Զ���ͷ��
	private String CitizenIDCardNumber;//�������֤��

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

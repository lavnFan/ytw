package cn.edu.seu.ytw.bean.mail;


import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MTC_T_Mail")
public class Mail {

	private int id;    // ��Ϣ���
	private int sendUserId; // �����˱��
	private Time  sendTime; // ��Ϣ����ʱ��
	private int reciverId; // �ռ��˱��
	private String title; // ��Ϣ����
	private String content; // ��Ϣ����
	private boolean isRead; // �Ƿ��Ѷ�


	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public Time getSendTime() {
//		return sendTime;
//	}
//	public void setSendTime(Time sendTime) {
//		this.sendTime = sendTime;
//	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Column(name="sendUserID")
	public int getSendUserId() {
		return sendUserId;
	}
	public void setSendUserId(int sendUserId) {
		this.sendUserId = sendUserId;
	}
	@Column(name="reciverId")
	public int getReciverId() {
		return reciverId;
	}
	public void setReciverId(int reciverId) {
		this.reciverId = reciverId;
	}
	public boolean getIsRead() {
		return isRead;
	}
	public void setIsRead(boolean isRead) {
		this.isRead = isRead;
	}
}

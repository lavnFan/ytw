package cn.edu.seu.ytw.bean.mail;


import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MTC_T_Mail")
public class Mail {

	private int id;    // 信息编号
	private int sendUserId; // 发送人编号
	private Time  sendTime; // 信息发送时间
	private int reciverId; // 收件人编号
	private String title; // 信息标题
	private String content; // 信息内容
	private boolean isRead; // 是否已读


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

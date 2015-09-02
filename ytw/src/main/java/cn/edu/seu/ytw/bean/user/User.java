package cn.edu.seu.ytw.bean.user;

public class User {
	private int id;
	private String name;
	private String password;
	private int Tel;
	private char sex;
	private String realName;
	
	private int CaseNotCompletedNum;
	private int CaseCompleteNum;
	private int NewMailNum;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCaseCompleteNum() {
		return CaseCompleteNum;
	}
	public void setCaseCompleteNum(int caseCompleteNum) {
		CaseCompleteNum = caseCompleteNum;
	}
	public int getCaseNotCompletedNum() {
		return CaseNotCompletedNum;
	}
	public void setCaseNotCompletedNum(int caseNotCompletedNum) {
		CaseNotCompletedNum = caseNotCompletedNum;
	}
	public int getNewMailNum() {
		return NewMailNum;
	}
	public void setNewMailNum(int newMailNum) {
		NewMailNum = newMailNum;
	}
	public int getTel() {
		return Tel;
	}
	public void setTel(int tel) {
		Tel = tel;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
}

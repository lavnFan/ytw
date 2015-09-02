package cn.edu.seu.ytw.bean.mediation;

import java.util.Date;

public class Case {

	private int id;
	private int applicationId;
	private int hospitalId;
	private int mediatorId;
	private Date applicationTime;
	private Date endingTimeDate;
	
	
	private Application application;
	private CaseProcess caseProcess;
	private CaseStatement caseStatement;
	private MediationSolution mediationSolution;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public int getMediatorId() {
		return mediatorId;
	}
	public void setMediatorId(int mediatorId) {
		this.mediatorId = mediatorId;
	}
	public Date getApplicationTime() {
		return applicationTime;
	}
	public void setApplicationTime(Date applicationTime) {
		this.applicationTime = applicationTime;
	}
	public Date getEndingTimeDate() {
		return endingTimeDate;
	}
	public void setEndingTimeDate(Date endingTimeDate) {
		this.endingTimeDate = endingTimeDate;
	}
	
	
}

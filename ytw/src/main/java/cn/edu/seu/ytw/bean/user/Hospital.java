package cn.edu.seu.ytw.bean.user;

public class Hospital extends User{

	private String medicalInstitutionCode;//医疗机构代码
	private String province;
	private String city;
	private int hospitalGrade;
	

	public String getMedicalInstitutionCode() {
		return medicalInstitutionCode;
	}

	public void setMedicalInstitutionCode(String medicalInstitutionCode) {
		this.medicalInstitutionCode = medicalInstitutionCode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getHospitalGrade() {
		return hospitalGrade;
	}

	public void setHospitalGrade(int hospitalGrade) {
		this.hospitalGrade = hospitalGrade;
	}
}

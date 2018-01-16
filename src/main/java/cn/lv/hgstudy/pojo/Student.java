package cn.lv.hgstudy.pojo;

// Generated 2017-1-3 19:38:48 by Hibernate Tools 3.4.0.CR1

/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable {

	private String stuId;
	private String stuName;
	private Integer stuAge;
	private String stuSchool;
	private String stuPassword;
	private String stuSex;
	private String stuImage;
	private String emailAdress;

	public Student() {
	}

	public Student(String stuId) {
		this.stuId = stuId;
	}

	public Student(String stuId, String stuName, Integer stuAge,
			String stuSchool, String stuPassword, String stuSex, String stuimage) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuSchool = stuSchool;
		this.stuPassword = stuPassword;
		this.stuSex = stuSex;
		this.stuImage = stuimage;
	}

	public String getStuId() {
		return this.stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getStuAge() {
		return this.stuAge;
	}

	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuSchool() {
		return this.stuSchool;
	}

	public void setStuSchool(String stuSchool) {
		this.stuSchool = stuSchool;
	}

	public String getStuPassword() {
		return this.stuPassword;
	}

	public void setStuPassword(String stuPassword) {
		this.stuPassword = stuPassword;
	}

	public String getStuSex() {
		return this.stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getStuImage() {
		return this.stuImage;
	}

	public void setStuImage(String stuImage) {
		this.stuImage = stuImage;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	
}
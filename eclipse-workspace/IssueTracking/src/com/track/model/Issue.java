package com.track.model;

public class Issue {
	private int issId;
	private String issType;
	private String issDesc;
	private String postedOn;
	private int priority;
	private String status;
	private int empId;
	private String mailId;
	private int techId;
	private String solvedOn;

	public Issue(int issId, String issType, String issDesc, String postedOn, int priority, String status, int empId,
			String mailId, int techId, String solvedOn) {
		super();
		this.issId = issId;
		this.issType = issType;
		this.issDesc = issDesc;
		this.postedOn = postedOn;
		this.priority = priority;
		this.status = status;
		this.empId = empId;
		this.mailId = mailId;
		this.techId = techId;
		this.solvedOn = solvedOn;
	}

	public Issue(int empId, int issId, String issType, String issDesc, int priority, String status, String postedOn,
			String solvedOn, int solvedBy) {
		super();
		this.issId = issId;
		this.issType = issType;
		this.issDesc = issDesc;
		this.postedOn = postedOn;
		this.priority = priority;
		this.status = status;
		this.empId = empId;
		this.solvedOn = solvedOn;
		this.techId = solvedBy;
	}

	@Override
	public String toString() {
		return "Issue [issId=" + issId + ", issType=" + issType + ", issDesc=" + issDesc + ", postedOn=" + postedOn
				+ ", priority=" + priority + ", status=" + status + ", empId=" + empId + ", mailId=" + mailId
				+ ", techId=" + techId + ", solvedOn=" + solvedOn + "]";
	}

	public Issue(String issType, String issDesc, int priority, int empId) {
		super();
		this.issType = issType;
		this.issDesc = issDesc;
		this.priority = priority;
		this.empId = empId;
	}

	public Issue() {
		super();
	}

	public Issue(String mail) {
		mailId = mail;
	}

	public Issue(int issueId) {
		this.issId = issueId;
	}

	public Issue(int issueId, int techId, int priority) {
		this.issId = issueId;
		this.techId = techId;
		this.priority = priority;
	}

	public Issue(int issueId, int techId) {
		this.issId = issueId;
		this.techId = techId;
	}

	public Issue(int empId, int issueId, String issueType, String issueDesc, int priority, String status,
			String postedOn, int solvedBy, String solvedOn) {
		this.issId = issueId;
		this.issType = issueType;
		this.issDesc = issueDesc;
		this.postedOn = postedOn;
		this.priority = priority;
		this.status = status;
		this.empId = empId;
		this.techId = solvedBy;
		this.solvedOn = solvedOn;
	}
	public Issue(int empId, int issueId, String issueType, String issueDesc, int priority, String status,
			String postedOn, int solvedBy) {
		this.issId = issueId;
		this.issType = issueType;
		this.issDesc = issueDesc;
		this.postedOn = postedOn;
		this.priority = priority;
		this.status = status;
		this.empId = empId;
		this.techId = solvedBy;
	}

	public int getIssId() {
		return issId;
	}

	public void setIssId(int issId) {
		this.issId = issId;
	}

	public String getIssType() {
		return issType;
	}

	public void setIssType(String issType) {
		this.issType = issType;
	}

	public String getIssDesc() {
		return issDesc;
	}

	public void setIssDesc(String issDesc) {
		this.issDesc = issDesc;
	}

	public String getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(String postedOn) {
		this.postedOn = postedOn;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public String getSolvedOn() {
		return solvedOn;
	}

	public void setSolvedOn(String solvedOn) {
		this.solvedOn = solvedOn;
	}

}

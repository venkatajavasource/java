package com.devjavasource.concurrency.tuples;

import java.io.Serializable;

class Emp implements Serializable {

	private static final long serialVersionUID = 1L;

	private String empNo;
	private String empName;

	public Emp(String empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empName=" + empName + "]";
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
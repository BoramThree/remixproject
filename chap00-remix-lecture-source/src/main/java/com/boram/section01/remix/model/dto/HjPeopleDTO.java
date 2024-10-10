package com.boram.section01.remix.model.dto;

public class HjPeopleDTO {

    private String empID;
    private String empNAME;
    private String empNO;
    private String empEMAIL;
    private String empPHONE;

    public HjPeopleDTO() {}

    public HjPeopleDTO(String EMP_ID, String EMP_NAME, String EMP_NO, String EMAIL, String PHONE) {
        this.empID = EMP_ID;
        this.empNAME = EMP_NAME;
        this.empNO = EMP_NO;
        this.empEMAIL = EMAIL;
        this.empPHONE = PHONE;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpNAME() {
        return empNAME;
    }

    public void setEmpNAME(String empNAME) {
        this.empNAME = empNAME;
    }

    public String getEmpNO() {
        return empNO;
    }

    public void setEmpNO(String empNO) {
        this.empNO = empNO;
    }

    public String getEmpEMAIL() {
        return empEMAIL;
    }

    public void setEmpEMAIL(String empEMAIL) {
        this.empEMAIL = empEMAIL;
    }

    public String getEmpPHONE() {
        return empPHONE;
    }

    public void setEmpPHONE(String empPHONE) {
        this.empPHONE = empPHONE;
    }

    @Override
    public String toString() {
        return "HjPeopleDTO{" +
                "empID='" + empID + '\'' +
                ", empNAME='" + empNAME + '\'' +
                ", empNO='" + empNO + '\'' +
                ", empEMAIL='" + empEMAIL + '\'' +
                ", empPHONE='" + empPHONE + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

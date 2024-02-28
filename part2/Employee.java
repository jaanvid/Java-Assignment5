import java.util.Scanner;

public abstract class Employee {
    private String name, designation, dept, bankName,DOJ ;
    private int employeeId, totalWorkingDays, lop, leavesTaken;
    private long accountNo, UAN, PFNo, ESINo ;
    private double grossWage, basicWage, hra, conveyanceAllowance, medicalAllowance, otherAllowance, EPF, healthInsuranceAmt, PT, loanRecovery, totalDeductions, net_salary,totalEarnings,bonus,bonus_salary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getDOJ() {
        return DOJ;
    }
    public void setDOJ(String dOJ) {
        DOJ = dOJ;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }
    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }
    public int getLop() {
        return lop;
    }
    public void setLop(int lop) {
        this.lop = lop;
    }
    public int getLeavesTaken() {
        return leavesTaken;
    }
    public void setLeavesTaken(int leavesTaken) {
        this.leavesTaken = leavesTaken;
    }
    public long getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }
    public long getUAN() {
        return UAN;
    }
    public void setUAN(long uAN) {
        UAN = uAN;
    }
    public long getPFNo() {
        return PFNo;
    }
    public void setPFNo(long pFNo) {
        PFNo = pFNo;
    }
    public long getESINo() {
        return ESINo;
    }
    public void setESINo(long eSINo) {
        ESINo = eSINo;
    }
    public double getGrossWage() {
        return grossWage;
    }
    public void setGrossWage(double grossWage) {
        this.grossWage = grossWage;
    }
    public double getBasicWage() {
        return basicWage;
    }
    public void setBasicWage(double basicWage) {
        this.basicWage = basicWage;
    }
    public double getHra() {
        return hra;
    }
    public void setHra(double hra) {
        this.hra = hra;
    }
    public double getConveyanceAllowance() {
        return conveyanceAllowance;
    }
    public void setConveyanceAllowance(double conveyanceAllowance) {
        this.conveyanceAllowance = conveyanceAllowance;
    }
    public double getMedicalAllowance() {
        return medicalAllowance;
    }
    public void setMedicalAllowance(double medicalAllowance) {
        this.medicalAllowance = medicalAllowance;
    }
    public double getOtherAllowance() {
        return otherAllowance;
    }
    public void setOtherAllowance(double otherAllowance) {
        this.otherAllowance = otherAllowance;
    }
    public double getEPF() {
        return EPF;
    }
    public void setEPF(double ePF) {
        EPF = ePF;
    }
    public double getHealthInsuranceAmt() {
        return healthInsuranceAmt;
    }
    public void setHealthInsuranceAmt(double healthInsuranceAmt) {
        this.healthInsuranceAmt = healthInsuranceAmt;
    }
    public double getPT() {
        return PT;
    }
    public void setPT(double pT) {
        PT = pT;
    }
    public double getLoanRecovery() {
        return loanRecovery;
    }
    public void setLoanRecovery(double loanRecovery) {
        this.loanRecovery = loanRecovery;
    }
    public double getTotalDeductions() {
        return totalDeductions;
    }
    public void setTotalDeductions(double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }
    public double getNet_salary() {
        return net_salary;
    }
    public void setNet_salary(double net_salary) {
        this.net_salary = net_salary;
    }
    public double getTotalEarnings() {
        return totalEarnings;
    }
    public void setTotalEarnings(double totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    public abstract double theMonthly();
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus_salary() {
        return bonus_salary;
    }
    public void setBonus_salary(double bonus_salary) {
        this.bonus_salary = bonus_salary;
    }


}
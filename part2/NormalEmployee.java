public class NormalEmployee extends Employee {

    @Override
    public double theMonthly() {
        // Calculate basic wage
        setBasicWage(((getGrossWage() / getTotalWorkingDays()) * (getTotalWorkingDays() - getLop())) * 0.45);

        // Calculate HRA
        setHra(getBasicWage() * 0.4);

        // Calculate conveyance allowance
        setConveyanceAllowance((1600 / getTotalWorkingDays()) * (getTotalWorkingDays() - getLop()));

        // Calculate medical allowance
        setMedicalAllowance((1250 / getTotalWorkingDays()) * (getTotalWorkingDays() - getLop()));

        // Calculate other allowance
        setOtherAllowance(getGrossWage() - (getBasicWage() + getHra() + getConveyanceAllowance() + getMedicalAllowance()));

        // Calculate total earnings
        setTotalEarnings(getBasicWage() + getHra() + getConveyanceAllowance() + getMedicalAllowance() + getOtherAllowance());

        // Calculate EPF
        if (getBasicWage() >= 15000) {
            setEPF(15000 * 0.12);
        } else {
            setEPF(getBasicWage() * 0.15);
        }

        // Calculate health insurance
        if (getGrossWage() <= 21000) {
            setHealthInsuranceAmt(getTotalEarnings() * 0.0075);
        } else {
            setHealthInsuranceAmt(0);
        }

        // Calculate PT
        setPT(0);

        // Calculate loan recovery
        setLoanRecovery(0);

        // Calculate total deductions
        setTotalDeductions(getEPF() + getHealthInsuranceAmt() + getPT() + getLoanRecovery());

        // Calculate net salary
        setNet_salary(getTotalEarnings() - getTotalDeductions());

        return getNet_salary();
    }
}
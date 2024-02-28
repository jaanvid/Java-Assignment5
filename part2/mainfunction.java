import java.util.Scanner;

public class mainfunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inputs for NormalEmployee
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        System.out.print("Enter Designation: ");
        scanner.nextLine();
        String designation = scanner.nextLine();
        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();
        System.out.print("Enter Date of Joining (dd/mm/yyyy): ");
        String doj = scanner.nextLine();
        System.out.print("Enter UAN: ");
        long uan = scanner.nextLong();
        System.out.print("Enter PF Number: ");
        int pfNo = scanner.nextInt();
        System.out.print("Enter Bank Name: ");
        scanner.nextLine();
        String bankName = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        long accountNo = scanner.nextLong();

        NormalEmployee normalEmployee = new NormalEmployee();
        normalEmployee.setName(name);
        normalEmployee.setEmployeeId(employeeId);
        normalEmployee.setDesignation(designation);
        normalEmployee.setDept(dept);
        normalEmployee.setDOJ(doj);
        normalEmployee.setUAN(uan);
        normalEmployee.setPFNo(pfNo);
        normalEmployee.setBankName(bankName);
        normalEmployee.setAccountNo(accountNo);


        System.out.print("Enter Gross Wage: ");
        double grossWage = scanner.nextDouble();
        normalEmployee.setGrossWage(grossWage);
        System.out.print("Enter Total Working Days: ");
        int totalWorkingDays = scanner.nextInt();
        normalEmployee.setTotalWorkingDays(totalWorkingDays);
        System.out.print("Enter Loss of Pay Days: ");
        int lop = scanner.nextInt();
        normalEmployee.setLop(lop);


        System.out.print("Enter Bonus (0 for Normal Employee): ");
        double bonus = scanner.nextDouble();
        BonusEmployee bonusEmployee = new BonusEmployee();
        bonusEmployee.setName(name);
        bonusEmployee.setEmployeeId(employeeId);
        bonusEmployee.setDesignation(designation);
        bonusEmployee.setDept(dept);
        bonusEmployee.setDOJ(doj);
        bonusEmployee.setUAN(uan);
        bonusEmployee.setPFNo(pfNo);
        bonusEmployee.setBankName(bankName);
        bonusEmployee.setAccountNo(accountNo);
        bonusEmployee.setGrossWage(grossWage);
        bonusEmployee.setTotalWorkingDays(totalWorkingDays);
        bonusEmployee.setLop(lop);
        bonusEmployee.setBonus(bonus);

        double netSalary = 0;
        if (bonus == 0) {
            normalEmployee.theMonthly();
            netSalary = normalEmployee.getNet_salary();
            System.out.println("\n*************************Normal Employee********************");
            printPaySlip(normalEmployee, netSalary);
        } else {
            bonusEmployee.theMonthly();
            netSalary = bonusEmployee.getNet_salary();
            System.out.println("\n*************************Bonus Employee********************");
            printPaySlip(bonusEmployee, netSalary);
        }

        scanner.nextLine();
        scanner.nextLine();

        scanner.close();
    }

    private static void printPaySlip(Employee employee1, double netSalary) {
        // Print pay slip for employee
        System.out.println("Pay Slip for Employee:	" + employee1.getName());
        System.out.println("Employee ID:		" + employee1.getEmployeeId());
        System.out.println("Designation:		" + employee1.getDesignation());
        System.out.println("Department:		" + employee1.getDept());
        System.out.println("Date of Joining:		" + employee1.getDOJ());
        System.out.println("UAN:			" + employee1.getUAN());
        System.out.println("PF Number:		" + employee1.getPFNo());
        System.out.println("ESI Number:		" + employee1.getESINo());
        System.out.println();
        System.out.println("Bank Name:		" + employee1.getBankName());
        System.out.println("Account Number:		" + employee1.getAccountNo());
        System.out.println("Gross Wage:		" + employee1.getGrossWage());
        System.out.println("Total Working Days:	" + employee1.getTotalWorkingDays());
        System.out.println("Loss of Pay Days:	" + employee1.getLop());
        System.out.println();
        System.out.println("Earnings");
        System.out.println("Basic Wage: 		  " + employee1.getBasicWage());
        System.out.println("HRA: 	    		  " + employee1.getHra());
        System.out.println("Conveyance Allowance:     " + employee1.getConveyanceAllowance());
        System.out.println("Medical Allowance: 	  " + employee1.getMedicalAllowance());
        System.out.println("Other Allowance: 	  " + employee1.getOtherAllowance());
        System.out.println("Total Earnings: 		  " + employee1.getTotalEarnings());
        System.out.println();
        System.out.println("Deductions");
        System.out.println("EPF:			  " + employee1.getEPF());
        System.out.println("Health Insurance: 	  " + employee1.getHealthInsuranceAmt());
        System.out.println("Professional Tax: 	  " + employee1.getPT());
        System.out.println("Loan Recovery:		  " + employee1.getLoanRecovery());
        System.out.println("Total Deductions:	  " + employee1.getTotalDeductions());
        System.out.println();
        System.out.println("Net_Salary");
        System.out.println("Net Salary: 		  " + netSalary);

        if (employee1 instanceof NormalEmployee) {
            System.out.println("This is a Normal Employee.");
        } else if (employee1 instanceof BonusEmployee) {
            System.out.println("This is a Bonus Employee.");
        }

        System.out.println();
    }
}
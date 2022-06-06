public int payAmount() throws Exception {
        switch (employeeType.getEmployeeCode()) {
            case EmployeeType.ENGINEER:
                return MonthlySalary;
            case EmployeeType.SALESMAN:
                return MonthlySalary + Commission;
            case EmployeeType.MANAGER:
                return MonthlySalary + Bonus;
            default:
                throw new Exception();
        }
    }

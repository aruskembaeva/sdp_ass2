public class test{
    public static void main(String[] args) {

        Employee emp = new Employee(02, "Askar Aisyltan", 80000);

        new HumanResourcesObs(emp);
        new HighManagementObs(emp);

        emp.setSalary(80000);
        System.out.println("-------------------------------------------------");
        emp.setSalary(120000);


    }
}

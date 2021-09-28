public class HighManagementObs implements Observer{
    private Employee emp;

    public HighManagementObs (Employee employee){

        this.emp = employee;
        this.emp.addObserver(this);
    }

    @Override
    public void sendMessage() {
        System.out.println( "High Management is informed about the new salary-"+ emp.getSalary()+ " tenge of"+" employee id:"+emp.getId()+" Mr."+emp.getName() );
    }
}

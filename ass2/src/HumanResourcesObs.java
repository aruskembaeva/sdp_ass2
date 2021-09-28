public class HumanResourcesObs implements Observer{
    private Employee emp;

    public HumanResourcesObs(Employee employee){

        this.emp = employee;
        this.emp.addObserver(this);
    }

    @Override
    public void sendMessage() {
        System.out.println( "Human resources are informed about the new salary-"+ emp.getSalary()+ " tenge of"+" employee id:"+emp.getId()+
                " Mr."+emp.getName() );
    }
}

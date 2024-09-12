public class Executive extends Employee{
    private double bonus;
    public Executive(String firstname,String lastname,int SocialSecurityNumber,double payRate){
        super(firstname,lastname,SocialSecurityNumber,payRate);
        this.bonus=0.0;
    }
    public void setbonus(double bonus){
        this.bonus=bonus;
    }
    public double pay(){
        return payRate+bonus;
    }
    @Override
    public String toString(){
        return firstname + " " + lastname +" - Executive employee with a bonus of " + bonus + "$";
    }
}

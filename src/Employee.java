public class Employee extends Staffmember{
    protected int  SocialSecurityNumber;
    protected double payRate;

    public Employee(String firstname, String lastname,int SocialSecurityNumber,double payRate){
        super(firstname, lastname);
        this.SocialSecurityNumber=SocialSecurityNumber;
        //add a validation for the payRate
        if (payRate<0){
            throw new IllegalArgumentException("Pay rate cannot be negative");
        }
        this.payRate=payRate;
    }
    public int getSocialSecurityNumber(){
        return SocialSecurityNumber;
    }
    public double getPayRate(){
        return payRate;
    }
    @Override
    public double pay(){
        return payRate;
    }
    @Override
    public String toString(){
        return firstname + " " + lastname +" -SSN: " + SocialSecurityNumber + " -payRate: " + payRate;
    }
}

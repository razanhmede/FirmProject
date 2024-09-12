public class Hourly extends Employee{
    private int hours;
    public Hourly(String firstname,String Lastname,int SocialSecurityNumber,double payRate) {
        super(firstname, Lastname, SocialSecurityNumber, payRate);
        this.hours = 0;
    }
    public void addhours(int hours){
        this.hours+=hours;
        }
    public double pay(){
        return payRate*hours;
    }
    public String toString(){
        return firstname + " "  +lastname + " has worked a total of "+hours + " hours ";
    }
    }


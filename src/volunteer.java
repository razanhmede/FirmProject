public class volunteer extends Staffmember {

    public volunteer(String firstname,String lastname) {
        super(firstname,lastname);
    }
    @Override
    public double pay(){
        return 0.0;
    }
    @Override
    public String toString(){
        return firstname + " " + lastname +" ,Thank you for volunteering in our firm!!!";
    }
}

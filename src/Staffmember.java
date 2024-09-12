public abstract class Staffmember implements payable {
    protected String firstname;
    protected String lastname;
    public Staffmember(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    @Override
    public abstract double pay();

    }



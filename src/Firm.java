public class Firm {
    public static void main(String[] args) {
        //create an employee
        Employee e1 = new Employee("Gilbert", "Smith", 125879, 1200);
        //Employee e2 = new Employee("Rony", "Saab", 925879, -200);
        System.out.println(e1.toString());
        System.out.println("Employee pay is:" +e1.pay() +"$");
        //System.out.println(e2.toString());
        //System.out.println("Employee pay is:" +e2.pay() +"$");
        //create a volunteer
        volunteer v1 = new volunteer("Razan", "Hmede");
        System.out.println(v1.toString());
        //create an executive
        Executive exec1 = new Executive("Hadi", "Zeitoun", 325779, 2000);
        exec1.setbonus(500);
        System.out.println(exec1.toString());
        System.out.println("Executive employee pay is :" + exec1.pay() +"$");
        //create an Hourly employee
        Hourly h1=new Hourly("Bob","Salame",456789,20.0);
        h1.addhours(40);
        System.out.println(h1.toString());
        System.out.println("Hourly pay is :" +h1.pay() +"$");
    }
}
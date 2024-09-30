public class Employee {


    private String name;
     private int id;
     private double salary;


     Employee() {}

    Employee (int id)
    {
        this.id =id;
    }

    Employee(String name, int id)
    {

        this.name = name;
        this.id = id;
    }
     Employee(String name, int id, double salary)
     {

         this.name = name;
         this.id = id;
         this.salary = salary;
     }

     public String getName ()
     {

         return name;
     }

     public int  getId ()
    {

        return id;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setId (int id)
    {
        this.id = id;
    }

    public void setSalary (double salary)
    {
        this.salary = salary;
    }
}

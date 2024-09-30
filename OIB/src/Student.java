public class Student {

     private String name;
 private    int roll;
   private String program;
   private int batch;

   public Student () {}

    public Student (String name)
    {

        this.name = name;
    }

    public Student (String name, int roll){
       this.name = name;
       this.roll = roll;
    }

    public Student (String name, int roll, String program){
       this.name = name;
       this.roll = roll;
       this.program = program;
    }

public String getName () {

       return name;


    }
    public int getRoll () {
       return roll;
    }
    public String getProgram () {
       return program;
    }
    public int getBatch () {
       return batch;
    }

    public void setName (String name) {
       this.name = name;
    }
    public void setRoll (int roll) {
       this.roll = roll;
    }
    public void setProgram (String program) {
       this.program = program;

    }
    public void setBatch (int batch) {
       this.batch = batch;
    }

}

public class Student {
  private   int id;
     private String name;
   private int batch;
    private String password;
    private String program;
    private double cgpa;

    public Student(int id, String name, int batch, String password, String program, double cgpa) {
        this.id = id;
        this.name = name;
        this.batch = batch;
        this.password = password;
        this.program = program;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public boolean checkPassword(String givenpassword) {
        return password.equals(givenpassword);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

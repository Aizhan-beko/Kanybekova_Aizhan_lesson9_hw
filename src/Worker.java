public class Worker extends Person {
    private String specialty;
    private int workExperience;

    public String getSpecialty() {
        return specialty;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public Worker(String name, int age, Address address, Gender genderEnum, String specialty, int workExperience) {
        super(name, age, address, genderEnum);
        this.specialty = specialty;
        this.workExperience = workExperience;

    }
    public void doAction(){
        System.out.println("Working hard.");
    }
   public void doAction(String when){
        System.out.println("Working hard" + when);

   }
   public final void makeReports(){
        System.out.println("Performs annual reports");

   }
   public String getInfo(){
        return super.getInfo() +
                "\n specialty:" + specialty +
                "\n experience in year:" + workExperience;
   }
}


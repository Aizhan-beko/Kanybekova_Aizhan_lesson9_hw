public final class Doctor extends Worker{
    private String hospitalName;
    private String department;

    public Doctor(String name, int age, Address address, Gender genderEnum, String specialty, int experience, String hospitalName, String department) {
        super(name, age, address, genderEnum, specialty, experience);
        this.hospitalName = hospitalName;
        this.department = department;
    }

    public Doctor(String name, int age, Address address, Gender genderEnum, String specialty, int workExperience, String hospitalName) {
        super(name, age, address, genderEnum, specialty, workExperience);
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getDepartment() {
        return department;
    }
    public void doAction(){
        System.out.println("Doctor looking for patient");
    }


    public String getInfo(){
        return super.getInfo() +
                "\n name of hospital:" + hospitalName +
                "\n department:" + department;

    }

    public String getInfo2(){
        return super.getInfo() +
                "\n name of hospital:" +hospitalName;
    }
}

public class Main {
    public static void main(String[] args) {

        Address address = new Address("Nijniy Djal", 456789);
        Worker worker = new Worker("Bekbolot", 31, address, Gender.MAN, "teacher", 7);
        System.out.println(worker.getInfo());
        worker.doAction();
        worker.doAction(" in the morning");

        Address address1 = new Address("Asanbay 12/4", 541297);
        Doctor doctor = new Doctor("Aichurok", 28, address1, Gender.WOMAN, "neurologist", 3, "Neurology2", "Clinical neurology");
        System.out.println(doctor.getInfo());
        doctor.doAction();
        doctor.doAction(" at night");

        Address address2 = new Address("Kirgiziya2", 437501);
        Doctor doctor2 = new Doctor("Kamila", 35, address2,Gender.WOMAN," pediatrician", 9, "Acibadem");
        System.out.println(doctor2.getInfo2());
        doctor.doAction();
        doctor.doAction(" in the afternoon");
    }

}
package day2;

public class TestPatient {
    public static void main(String[] args) {
        // Create a new day2.Patient object
        Patient patient1 = new Patient("Majed Abdullah", 180.5, 79.0);
        Patient patient2 = new Patient("Anas Faiz", 177.5, 77.0);

        // Access the patient's information
        System.out.println("day2.Patient Name: " + patient1.getName());
        System.out.println("Height: " + patient1.getHeight() + " cm");
        System.out.println("Weight: " + patient1.getWeight() + " kg");
        System.out.println("----------------------------------------------");
        System.out.println("day2.Patient Name: " + patient2.getName());
        System.out.println("Height: " + patient2.getHeight() + " cm");
        System.out.println("Weight: " + patient2.getWeight() + " kg");
    }
}

import java.time.LocalDate;
import java.util.ArrayList;


public class MedicationSystemDemo
{
    public static void main(String[] args)
    {
        MedicationSystem system = new MedicationSystem();

        System.out.println();
        System.out.println("|------ Adding Data ------|");
        System.out.println();

        //create and add medications
        Medication medication1 = new Medication(1, "Vyvanse", 30.0, 100, LocalDate.of(2025, 12, 31));
        Medication medication2 = new Medication(2, "Vicodin", 10.0, 50, LocalDate.of(2024, 6, 30));
        Medication medication3 = new Medication(3, "Xanax", 20.0, 200, LocalDate.of(2023, 11, 30));

        system.addMedication(medication1);
        system.addMedication(medication2);
        system.addMedication(medication3);

        System.out.println();

        //create and add patients
        Patient patient1 = new Patient(1, "Jamie Volk", 30, "555-1234", new ArrayList<>(), new ArrayList<>());
        Patient patient2 = new Patient(2, "Franklin Zappa", 25, "555-5678", new ArrayList<>(), new ArrayList<>());
        Patient patient3 = new Patient(3, "Bobby Brown", 40, "555-9012", new ArrayList<>(), new ArrayList<>());

        system.addPatient(patient1);
        system.addPatient(patient2);
        system.addPatient(patient3);

        System.out.println();

        //create and add doctors
        Doctor doctor1 = new Doctor(1, "Dr. Klein", 45, "555-1111", "Psychiatry", new ArrayList<>());
        Doctor doctor2 = new Doctor(2, "Dr. Lake", 50, "555-2222", "Pain Management", new ArrayList<>());
        Doctor doctor3 = new Doctor(3, "Dr. Lee", 35, "555-3333", "General Practice", new ArrayList<>());

        system.addDoctor(doctor1);
        system.addDoctor(doctor2);
        system.addDoctor(doctor3);

        System.out.println();

        //add patients to doctors
        system.addPatientToDoctor(patient1, doctor1);
        system.addPatientToDoctor(patient2, doctor2);
        system.addPatientToDoctor(patient3, doctor3);


        //create and add prescriptions
        system.addPrescription(1, doctor1, patient1, medication1, LocalDate.of(2025, 1, 21));
        system.addPrescription(2, doctor2, patient2, medication2, LocalDate.of(2024, 2, 19));
        system.addPrescription(3, doctor3, patient3, medication3, LocalDate.of(2026, 3, 11));
        system.addPrescription(4, doctor1, patient1, medication2, LocalDate.of(2024, 4, 13));
        system.addPrescription(5, doctor2, patient2, medication3, LocalDate.of(2026, 5, 15));
        system.addPrescription(6, doctor3, patient3, medication1, LocalDate.of(2025, 6, 27));


        //search for patient, doctor, and medication by name
        System.out.println();
        System.out.println("|------ Search for Patient, Doctor, and Medication by Name ------|");
        System.out.println();

        Patient searchPatient = system.searchPatientByName("Jamie Volk");
        System.out.println(searchPatient);

        Doctor searchDoctor = system.searchDoctorByName("Dr. Klein");
        System.out.println(searchDoctor);

        Medication searchMedication = system.searchMedicationByName("Vyvanse");
        System.out.println(searchMedication);


        //generate report of full system
        System.out.println();
        System.out.println("|------ Generate Reports ------|");
        System.out.println();
        system.generateFullReport();


        //generate report of all prescriptions from the past year
        system.generatePastYearPrescriptions();


        //generate report of all expired medications
        system.checkExpiredMedications();


        //generate report of all prescriptions from a specific doctor
        system.generateDoctorPrescriptions(doctor1);


        //restock medication
        System.out.println();
        System.out.println("|------ Restock Medications ------|");
        System.out.println();

        system.restockMedication(1, 50);
        system.restockMedication(2, 25);
        system.restockMedication(3  , 100);


        //edit details of patient, doctor, and medication
        System.out.println();
        System.out.println("|------ Edit Patient, Doctor, and Medication Details ------|");
        System.out.println();

        system.updatePatient(1, "Jamie Volk", 31, "555-4321");
        system.updateDoctor(1, "Dr. Klein", 46, "555-1111", "Neurology");
        system.updateMedication(1, "Vyvanse", 35.0, 150, LocalDate.of(2025, 12, 31));


        //delete patient, doctor, and medication
        System.out.println();
        System.out.println("|------ Delete Patient, Doctor, and Medication ------|");
        System.out.println();

        system.deletePatient(1);
        system.deleteDoctor(1);
        system.deleteMedication(1);


        //generate report of full system after deletions
        System.out.println();
        System.out.println("|------ Generate Full Report After Edit/Delete ------|");
        System.out.println();
        system.generateFullReport();
    }
    
}

import java.util.ArrayList;
import java.time.LocalDate;

/**
 * Represents the medication system, which manages patients, doctors, medications, and prescriptions.
 * Allows for adding, editing, and deleting, searching for patients, doctors, and medications, and generating reports, as well as checking for expired medications.
 */
public class MedicationSystem
{
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Medication> medications;
    private ArrayList<Prescription> prescriptions;


    /**
     * Default constructor for the MedicationSystem class.
     * Initializes empty lists for patients, doctors, medications, and prescriptions.
     */
    public MedicationSystem()
    {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        medications = new ArrayList<>();
        prescriptions = new ArrayList<>();
    }

    /**
     * Constructs a medication system with the given lists of patients, doctors, medications, and prescriptions.
     * @param patients the list of patients
     * @param doctors the list of doctors
     * @param medications the list of medications
     * @param prescriptions the list of prescriptions
     */
    public MedicationSystem(ArrayList<Patient> patients, ArrayList<Doctor> doctors, ArrayList<Medication> medications, ArrayList<Prescription> prescriptions)
    {
        this.patients = new ArrayList<>(patients);
        this.doctors = new ArrayList<>(doctors);
        this.medications = new ArrayList<>(medications);
        this.prescriptions = new ArrayList<>(prescriptions);
    }


    /**
     * @return a list of patients
     */
    public ArrayList<Patient> getPatients()
    {
        return new ArrayList<>(patients);
    }
    /**
     * @param patients the new list of patients
     */
    public void setPatients(ArrayList<Patient> patients)
    {
        this.patients = new ArrayList<>(patients);
    }

    /**
     * @return a list of doctors
     */
    public ArrayList<Doctor> getDoctors()
    {
        return new ArrayList<>(doctors);
    }
    /**
     * @param doctors the new list of doctors
     */
    public void setDoctors(ArrayList<Doctor> doctors)
    {
        this.doctors = new ArrayList<>(doctors);
    }

    /**
     * @return a list of medications
     */
    public ArrayList<Medication> getMedications()
    {
        return new ArrayList<>(medications);
    }
    /**
     * @param medications the new list of medications
     */
    public void setMedications(ArrayList<Medication> medications)
    {
        this.medications = new ArrayList<>(medications);
    }

    /**
     * @return a list of prescriptions
     */
    public ArrayList<Prescription> getPrescriptions()
    {
        return new ArrayList<>(prescriptions);
    }
    /**
     * @param prescriptions the new list of prescriptions
     */
    public void setPrescriptions(ArrayList<Prescription> prescriptions)
    {
        this.prescriptions = new ArrayList<>(prescriptions);
    }


    /**
     * Searches for a patient by name and returns the patient if found, or null if not found.
     * @param name the name of the patient to search for
     * @return the patient with the given name, or null if not found
     */
    public Patient searchPatientByName(String name)
    {
        for (Patient patient : patients)
        {
            if (patient.getName().equalsIgnoreCase(name))
            {
                return patient;
            }
        }
        return null;
    }
    /**
     * Searches for a doctor by name and returns the doctor if found, or null if not found.
     * @param name the name of the doctor to search for
     * @return the doctor with the given name, or null if not found
     */
    public Doctor searchDoctorByName(String name)
    {
        for (Doctor doctor : doctors)
        {
            if (doctor.getName().equalsIgnoreCase(name))
            {
                return doctor;
            }
        }
        return null;
    }
    /**
     * Searches for a medication by name and returns the medication if found, or null if not found.
     * @param name the name of the medication to search for
     * @return the medication with the given name, or null if not found
     */
    public Medication searchMedicationByName(String name)
    {
        for (Medication medication : medications)
        {
            if (medication.getName().equalsIgnoreCase(name))
            {
                return medication;
            }
        }
        return null;
    }


    /**
     * Adds a patient to a doctor's list of patients.
     * @param patient the patient to add to the doctor
     * @param doctor the doctor to add the patient to
     */
    public void addPatientToDoctor(Patient patient, Doctor doctor)
    {
        if (patient != null && doctor != null)
        {
            doctor.addPatient(patient);
        }
    }


    /**
     * Adds a prescription to the system, including adding it to the patient's list of prescriptions and reducing the medication stock by 1.
     * @param id the ID of the prescription
     * @param doctor the doctor who prescribed the medication
     * @param patient the patient for whom the medication is prescribed
     * @param medication the medication being prescribed
     * @param date the date of the prescription
     */
    public void addPrescription(int id, Doctor doctor, Patient patient, Medication medication, LocalDate date)
    {
        if (doctor == null || patient == null || medication == null)
        {
            System.out.println("Error: Invalid doctor, patient, or medication.");
            return;
        }

        Prescription newPrescription =  new Prescription(id, doctor, patient, medication, date);
        prescriptions.add(newPrescription);

        patient.addPrescription(newPrescription);

        medication.setQuantity(medication.getQuantity() - 1);

        System.out.println("Prescription added: " + newPrescription);
    }


    /**
     * Adds a patient to the system.
     * @param patient the patient to add
     */
    public void addPatient(Patient patient)
    {
        patients.add(patient);
        System.out.println("Patient added: " + patient);
    }

    /**
     * Adds a doctor to the system.
     * @param doctor the doctor to add
     */
    public void addDoctor(Doctor doctor)
    {
        doctors.add(doctor);
        System.out.println("Doctor added: " + doctor);
    }

    /**
     * Adds a medication to the system.
     * @param medication the medication to add
     */
    public void addMedication(Medication medication)
    {
        medications.add(medication);
        System.out.println("Medication added: " + medication);
    }

    /**
     * Edits a patient in the system by searching for the patient by ID and updating their information.
     * @param id the ID of the patient to update
     * @param name the new name of the patient
     * @param age the new age of the patient
     * @param phoneNumber the new phone number of the patient
     */
    public void updatePatient(int id, String name, int age, String phoneNumber)
    {
        for (Patient patient : patients)
        {
            if (patient.getId() == id)
            {
                patient.setName(name);
                patient.setAge(age);
                patient.setPhoneNumber(phoneNumber);
                System.out.println("Patient updated: " + patient);
                return;
            }
        }
    }

    /**
     * Edits a doctor in the system by searching for the doctor by ID and updating their information.
     * @param id the ID of the doctor to update
     * @param name the new name of the doctor
     * @param age the new age of the doctor
     * @param phoneNumber the new phone number of the doctor
     * @param specialization the new specialization of the doctor
     */
    public void updateDoctor(int id, String name, int age, String phoneNumber, String specialization)
    {
        for (Doctor doctor : doctors)
        {
            if (doctor.getId() == id)
            {
                doctor.setName(name);
                doctor.setAge(age);
                doctor.setPhoneNumber(phoneNumber);
                doctor.setSpecialization(specialization);
                System.out.println("Doctor updated: " + doctor);
                return;
            }
        }
    }

    /**
     * Edits a medication in the system by searching for the medication by ID and updating its information.
     * @param id the ID of the medication to update
     * @param name the new name of the medication
     * @param dose the new dose of the medication
     * @param quantity the new quantity of the medication
     * @param expiryDate the new expiry date of the medication
     */
    public void updateMedication(int id, String name, double dose, int quantity, LocalDate expiryDate)
    {
        for (Medication medication : medications)
        {
            if (medication.getId() == id)
            {
                medication.setName(name);
                medication.setDose(dose);
                medication.setQuantity(quantity);
                medication.setExpiryDate(expiryDate);
                System.out.println("Medication updated: " + medication);
                return;
            }
        }
    }

    /**
     * Deletes a patient from the system by searching for the patient by ID and removing them from the system, as well as removing them from any doctor's list of patients.
     * @param id the ID of the patient to delete
     */
    public void deletePatient(int id)
    {
        //remove from doctor list
        for (Doctor doctor : doctors)
        {
            for (Patient patient : doctor.getPatients())
            {
                if (patient.getId() == id)
                {
                    doctor.removePatient(patient);
                    break;
                }
            }
        }
        //remove from system
        patients.removeIf(patient -> patient.getId() == id);
        System.out.println("Patient with ID " + id + " deleted.");
    }

    /**
     * Deletes a doctor from the system by searching for the doctor by ID and removing them from the system, as well as clearing their list of patients.
     * @param id the ID of the doctor to delete
     */
    public void deleteDoctor(int id)
    {
        for (Doctor doctor : doctors)
        {
            if (doctor.getId() == id)
            {
                doctor.clearPatients();
            }
        }
        doctors.removeIf(doctor -> doctor.getId() == id);
        System.out.println("Doctor with ID " + id + " deleted.");
    }

    /**
     * Deletes a medication from the system by searching for the medication by ID and removing it from the system.
     * @param id the ID of the medication to delete
     */
    public void deleteMedication(int id)
    {
        medications.removeIf(medication -> medication.getId() == id);
        System.out.println("Medication with ID " + id + " deleted.");
    }


    /**
     * Generates a full report of all patients, doctors, medications, and prescriptions.
     */
    public void generateFullReport()
    {
        System.out.println("|--- Patients ---|");
        for (Patient patient : patients)
        {
            System.out.println(patient);
        }

        System.out.println();
        System.out.println("|--- Doctors ---|");
        for (Doctor doctor : doctors)
        {
            System.out.println(doctor);
        }

        System.out.println();
        System.out.println("|--- Medications ---|");
        for (Medication medication : medications)
        {
            System.out.println(medication);
        }

        System.out.println();
        System.out.println("|--- Prescriptions ---|");
        for (Prescription prescription : prescriptions)
        {
            System.out.println(prescription);
        }
    }


    /**
     * Checks for expired medications in the system and generates a report of any expired medications.
     */
    public void checkExpiredMedications()
    {
        System.out.println();
        System.out.println("|--- Expired Medications ---|");
        System.out.println();

        for (int i = 0; i < medications.size(); i++)
        {
            if (medications.get(i).getExpiryDate().isBefore(LocalDate.now()))
            {

                System.out.println(medications.get(i));
            }
        }
    }


    /**
     * Generates a report of all prescriptions from a specific doctor.
     * @param doctor the doctor for whom to generate the prescription report
     */
    public void generateDoctorPrescriptions(Doctor doctor)
    {
        System.out.println();
        System.out.println("|--- Prescriptions from Doctor: " + doctor.getName() + " ---|");
        System.out.println();

        for (int i = 0; i < prescriptions.size(); i++)
        {
            if (prescriptions.get(i).getDoctor() == doctor)
            {
                System.out.println(prescriptions.get(i));
            }
        }
    }


    /**
     * Restocks a medication by searching for the medication by ID and increasing its quantity by the specified amount.
     * @param id the ID of the medication to restock
     * @param amount the amount to increase the medication quantity by
     */
    public void restockMedication(int id, int amount)
    {
        for (int i = 0; i < medications.size(); i++)
        {
            if (medications.get(i).getId() == id)
            {
                medications.get(i).setQuantity(medications.get(i).getQuantity() + amount);
                System.out.println( medications.get(i));
                return;
            }
        }
        System.out.println("Medication not found");
    }


    /**
     * Generates a report of all prescriptions from the past year.
     */
    public void generatePastYearPrescriptions()
    {
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        System.out.println();
        System.out.println("|--- Prescriptions from the past year ---|");
        System.out.println();

        for (Prescription prescription : prescriptions)
        {
            if (prescription.getDate().isAfter(oneYearAgo) || prescription.getDate().isEqual(oneYearAgo))
            {
                System.out.println(prescription.getMedication().getName());
            }
        }
    }
}

import java.util.ArrayList;

/**
 * Represents a doctor in the system.
 * Doctor extends Person and has a specialization and a list of patients.
 */
public class Doctor extends Person
{
    private String specialization;
    private ArrayList<Patient> patients;

    /**
     * Default constructor for the Doctor class.
     * Creates an empty doctor.
     */
    public Doctor()
    {
        super();
        this.specialization = "";
        this.patients = new ArrayList<>();
    }

    /**
     * Constructs a doctor with the given values.
     * @param id the doctor's id number
     * @param name the doctor's name
     * @param age the doctor's age
     * @param phoneNumber the doctor's phone number
     * @param specialization the doctor's specialization
     * @param patients the list of patients for the doctor
     */
    public Doctor(int id, String name, int age, String phoneNumber, String specialization, ArrayList<Patient> patients)
    {
        super(id, name, age, phoneNumber);
        this.specialization = specialization;
        this.patients =  new ArrayList<>(patients);
    }

    /**
     * @return the doctor's specialization
     */
    public String getSpecialization()
    {
        return specialization;
    }
    /**
     * @param specialization the specialization to assign to the doctor
     */
    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
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
     * Adds a patient to the doctor's list of patients.
     * @param patient the patient to add
     */
    public void addPatient(Patient patient)
    {
        patients.add(patient);
    }

    /**
     * Removes a patient from the doctor's list of patients.
     * @param patient the patient to remove
     * @return true if removed successfully
     */
    public boolean removePatient(Patient patient)
    {
        return patients.remove(patient);
    }

    /**
     * Clears the list of patients for the doctor.
     */
    public void clearPatients()
    {
        patients.clear();
    }

    /**
     * Returns a string representation of the doctor object.
     * @return a formatted string with the doctor's information, specialization, and list of patients
    */
    public String toString()
    {
        return super.toString() + ", specialization: " + specialization + ", list of patients: " + patients;
    }
}

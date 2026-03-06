import java.util.ArrayList;

/**
 * Represents a patient in the medication system, extending the Person class.
 * Contains information about the patient's medications and prescriptions.
 */
public class Patient extends Person
{
    private ArrayList<Medication> medications;
    private ArrayList<Prescription> prescriptions;

    /**
     * Default constructor for the Patient class.
     * Creates an empty patient.
     */
    public Patient()
    {
        super();
        this.medications = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }

    /**
     * Constructs a patient with the given values.
     * @param id the patient's id number
     * @param name the patient's name
     * @param age the patient's age
     * @param phoneNumber the patient's phone number
     * @param medications the list of medications for the patient
     * @param prescriptions the list of prescriptions for the patient
     */
    public Patient(int id, String name, int age, String phoneNumber, ArrayList<Medication> medications, ArrayList<Prescription> prescriptions)
    {
        super(id, name, age, phoneNumber);
        this.medications = new ArrayList<>(medications);
        this.prescriptions = new ArrayList<>(prescriptions);
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
     * @param prescription the prescription to add
     */
    public void addPrescription(Prescription prescription)
    {
        prescriptions.add(prescription);
    }

    /**
     * Returns a string representation of the patient object.
     * @return a formatted string with the patient's information, medications, and prescriptions
     */
    public String toString()
    {
        return super.toString() + ", medications: " + medications + ", prescriptions: " + prescriptions;
    }
}

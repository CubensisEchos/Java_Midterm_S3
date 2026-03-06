import java.time.LocalDate;

/**
 * Represents a prescription in the system.
 * A prescription has an id, doctor, patient, medication, date, and expiry date.
 * the expiry date is set to one year after the date of the prescription by default.
 */
public class Prescription
{
    private int id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private LocalDate date;
    private LocalDate expiryDate;

    /**
     * Default constructor for the Prescription class.
     * Creates an empty prescription.
     */
    public Prescription()
    {
        this.id = 0;
        this.doctor = null;
        this.patient = null;
        this.medication = null;
        this.date = LocalDate.now();
        this.expiryDate = date.plusYears(1);
    }

    /**
     * Constructs a prescription with the given values.
     * @param id the prescription's id number
     * @param doctor the doctor who prescribed the medication
     * @param patient the patient for whom the medication is prescribed
     * @param medication the medication being prescribed
     * @param date the date of the prescription
     */
    public Prescription(int id, Doctor doctor, Patient patient, Medication medication, LocalDate date)
    {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.medication = medication;
        this.date = date;
        this.expiryDate = date.plusYears(1);
    }

    /**
      * @return the prescription's id
      */
    public int getId()
    {
        return id;
    }
    /**
     * @param id the id to assign to the prescription
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return the doctor for the prescription
     */
    public Doctor getDoctor()
    {
        return doctor;
    }
    /**
     * @param doctor the doctor to set for the prescription
     */
    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;
    }

    /**
     * @return the patient for the prescription
     */
    public Patient getPatient()
    {
        return patient;
    }
    /**
     * @param patient the patient to set for the prescription
     */
    public void setPatient(Patient patient)
    {
        this.patient = patient;
    }

    /**
    * @return the medication for the prescription
    */
    public Medication getMedication()
    {
        return medication;
    }
    /**
     * @param medication the medication to set for the prescription
     */
    public void setMedication(Medication medication)
    {
        this.medication = medication;
    }

    /**
    * @return the date of the prescription
    */
    public LocalDate getDate()
    {
        return date;
    }
    /**
     * @param date the date to set for the prescription
     */
    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    /**
    * @return the expiry date of the prescription
    */
    public LocalDate getExpiryDate()
    {
        return expiryDate;
    }
    /**
     * @param expiryDate the expiry date to set for the prescription
     */
    public void setExpiryDate(LocalDate expiryDate)
    {
        this.expiryDate = expiryDate;
    }

    /**
     * Returns a string representation of the prescription.
     * Includes the id, doctor name, patient name, medication name, date, and expiry date.
     */
    public String toString()
    {
        return "Prescription [id=" + id + ", doctor=" + doctor.getName() + ", patient=" + patient.getName() + ", medication=" + medication.getName() + ", date=" + date + ", expiryDate=" + expiryDate + "]";
    }
}
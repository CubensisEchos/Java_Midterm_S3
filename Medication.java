import java.time.LocalDate;

/**
 * Represents a medication in the system.
 * A medication has an id, name, dose, quantity, and expiry date.
 */
public class Medication
{
    private int id;
    private String name;
    private double dose;
    private int quantity;
    private LocalDate expiryDate;

    /**
     * Default constructor for the Medication class.
     * Creates an empty medication.
     */
    public Medication()
    {
        this.id = 0;
        this.name = "";
        this.dose = 0.0;
        this.quantity = 0;
        this.expiryDate = LocalDate.now();
    }

    /**
     * Constructs a medication with the given values.
     * @param id the medication's id
     * @param name the medication's name
     * @param dose the medication's dose
     * @param quantity the medication's quantity
     * @param expiryDate the medication's expiry date
     */
    public Medication(int id, String name, double dose, int quantity, LocalDate expiryDate)
    {
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    /**
     * @return the medication's id
     */
    public int getId()
    {
        return id;
    }
    /**
     * @param id the id to assign to the medication
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return the medication's name
     */
    public String getName()
    {
        return name;
    }
    /**
     * @param name the name to assign to the medication
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the medication's dose
     */
    public double getDose()
    {
        return dose;
    }
    /**
     * @param dose the dose to assign to the medication
     */
    public void setDose(double dose)
    {
        this.dose = dose;
    }

    /**
     * @return the medication's quantity
     */
    public int getQuantity()
    {
        return quantity;
    }
    /**
     * @param quantity the quantity to assign to the medication
     */
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    /**
     * @return the medication's expiry date
     */
    public LocalDate getExpiryDate()
    {
        return expiryDate;
    }
    /**
     * @param expiryDate the expiry date to assign to the medication
     */
    public void setExpiryDate(LocalDate expiryDate)
    {
        this.expiryDate = expiryDate;
    }

    /**
     * @return a formatted string with the medication's information
     */
    public String toString()
    {
        return "Medication [id=" + id + ", name=" + name + ", dose=" + dose + ", quantity=" + quantity + ", expiryDate=" + expiryDate + "]";
    }
}

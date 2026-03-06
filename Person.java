/**
 * The Person super class represents a person in the system, with an id, name, age, and phone number stored for each.
 */
public class Person
{
    private int id;
    private String name;
    private int age;
    private String phoneNumber;

    /**
     * Default constructor, sets values to default(creates an empty person).
     */
    public Person()
    {
        this.id = 0;
        this.name = "";
        this.age = 0;
        this.phoneNumber = "";
    }

    /**
     * Constructs a person with the given values.
     * @param id persons unique id number
     * @param name the person's name
     * @param age the person's age
     * @param phoneNumber the person's phone number
     */
    public Person(int id, String name, int age, String phoneNumber)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the person's id
     */
    public int getId()
    {
        return id;
    }
    /**
     * @param id the id to assign
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return the person's name
     */
    public String getName()
    {
        return name;
    }
    /**
     * @param name the name to assign
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the person's age
     */
    public int getAge()
    {
        return age;
    }
    /**
     * @param age the age to assign
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * @return the person's phone number
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    /**
     * @param phoneNumber the phone number to assign
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns a string representation of the person object.
     * @return a formatted string with the person's information
     */
    public String toString()
    {
        return "Person [id=" + id + ", name=" +  name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
    }
}
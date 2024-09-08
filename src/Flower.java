/**
 * Question addressed: Write a Java class, Flower, that has three instance variables of type String, int, and float,
 * which respectively represent the name of the flower, its number of petals, and price.
 * Your class must include a constructor method that initializes each variable to an appropriate value,
 * and your class should include methods for setting the value of each type, and getting the value of each type.
 */
public class Flower {

    private String name;
    private int numberOfPetals;
    private float price;

    //Default constructor
    public Flower(){
        this.name = "Rose";
        this.numberOfPetals = 6;
        this.price = 2.50f;
    }

    //Constructor with specified flower
    public Flower(String name, int numberOfPetals, float price){
        this.name = name;
        this.numberOfPetals = numberOfPetals;
        this.price = price;
    }

    //Get methods
    public String getName(){
        return name;
    }
    public int getNumberOfPetals(){
        return numberOfPetals;
    }
    public float getPrice(){
        return price;
    }

    //Set methods
    public void setName(String name){
        this.name = name;
    }
    public void setNumberOfPetals(int numberOfPetals){
        this.numberOfPetals = numberOfPetals;
    }
    public void setPrice(float price){
        this.price = price;
    }

}


package shop;
    public class Motorbike {
    private int ID = 0;
    private String name = "";
    private char rental_type = ' ' ;
    private double price = 0;

    public int getID() { // getters and setter 4 mototrbike 
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getRental_type() {
        return rental_type;
    }

    public void setRental_type(char rental_type) {
        this.rental_type = rental_type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Motorbike{" + "ID=" + ID + ", name=" + name + ", rental_type=" + rental_type + ", price=" + price + '}';
    }    
}




package shop;
public class Customer {
    
    private String firstname = "";
    private String lastname = "";
    private String phonenumber = "";
    private boolean membership = false;
    private double cash_input = 0.00;
    private char command_beta = ' ' ;

    public char getCommand_beta() {
        return command_beta;
    }

    public void setCommand_beta(char command_alpha) {
        this.command_beta = command_alpha;
    }
    
    public double getCash_input() {
        return cash_input;
    }

    public void setCash_input(double cash_input) {
        this.cash_input = cash_input;
    }

    public boolean isMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    public String getFirstname() {  // getters and setters 4 customer 
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;

    }

    

}



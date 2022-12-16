import java.util.HashMap;

public class GetInformation {
    
    private HashMap<String,String> firstName;
    private HashMap<String,String> lastName;
    private HashMap<String,String> street;
    private HashMap<String,Integer> years;


    public GetInformation(HashMap<String, String> firstName, HashMap<String, String> lastName,
            HashMap<String, String> street, HashMap<String, Integer> years) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.years = years;
    }


    public HashMap<String, String> getFirstName() {
        return firstName;
    }


    public HashMap<String, String> getLastName() {
        return lastName;
    }


    public HashMap<String, String> getStreet() {
        return street;
    }


    public HashMap<String, Integer> getYears() {
        return years;
    }

    
    
    

        
}

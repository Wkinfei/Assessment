import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
      // load thankyou.csv, remove the header and assign by columns
        //create a class, with: firstName, lastName, street, years
        public static final String FNAME = "thankyou.csv";
        public static Map<String,ArrayList<String>> headerFN = new HashMap<String,ArrayList<String>>();
        public static Map<String,ArrayList<String>> headerLN = new HashMap<String,ArrayList<String>>();
        public static Map<String,ArrayList<String>> headerAddress = new HashMap<String,ArrayList<String>>();
        public static Map<String,ArrayList<String>> headerYear = new HashMap<String,ArrayList<String>>();
        public static ArrayList<String> firstName = new ArrayList<String>();
        public static ArrayList<String> lastName = new ArrayList<>();
        public static ArrayList<String> Address = new ArrayList<>();
        public static ArrayList<String> Years = new ArrayList<>();
        // public static List<String> bob = new ArrayList<>();
        // public static List<String> fred = new ArrayList<String>();
    public static void main(String[] args) {

        

        String fname = (args.length == 0) ? FNAME : args[0];
      
        try(BufferedReader br = Files.newBufferedReader(Paths.get(fname));) {

            String headers = br.readLine();
            String[] headerArr = headers.split(",");
            

            String info = br.readLine();
            String[] sherlockArr = info.split(",");
            firstName.add(sherlockArr[0]);
            lastName.add(sherlockArr[1]);
            Address.add(sherlockArr[2]);
            Years.add(sherlockArr[3]);
            
            String line2 = br.readLine();
            String[] harryArr = line2.split(",");
            firstName.add(harryArr[0]);
            lastName.add(harryArr[1]);
            Address.add(harryArr[2]);
            Years.add(harryArr[3]);

            String line3 = br.readLine();
            String[] holmerArr = line3.split(",");
            firstName.add(holmerArr[0]);
            lastName.add(holmerArr[1]);
            Address.add(holmerArr[2]);
            Years.add(holmerArr[3]);

            String line4 = br.readLine();
            String[] sheldonArr = line4.split(",");
            firstName.add(sheldonArr[0]);
            lastName.add(sheldonArr[1]);
            Address.add(sheldonArr[2]);
            Years.add(sheldonArr[3]);

            String line5 = br.readLine();
            String[] bobArr = line5.split(",");
            firstName.add(bobArr[0]);
            lastName.add(bobArr[1]);
            Address.add(bobArr[2]);
            Years.add(bobArr[3]);

            String line6 = br.readLine();
            String[] fredArr = line6.split(",");
            firstName.add(fredArr[0]);
            lastName.add(fredArr[1]);
            Address.add(fredArr[2]);
            Years.add(fredArr[3]);

            headerFN.put(headerArr[0], firstName);
            headerLN.put(headerArr[1],lastName);
            headerAddress.put(headerArr[2],Address);
            headerYear.put(headerArr[3],Years);          
            }catch(IOException e) {
            System.out.println(e.getMessage());
        }
        try(BufferedReader br = Files.newBufferedReader(Paths.get("thankyou.txt"));){
            String line = "", oldtext = "";
             while((line = br.readLine()) != null)
                 {
                 oldtext += line + "\r\n";
             }
             br.close();

             
             String replacedheader = oldtext.replace("<<address>>",(headerFN.get("address")).get(0));
             String replacedname = replacedheader.replace("<<first_name>>",bob.get(0));
             String replacedyear = replacedname.replace("<<years>>",bob.get(3));
             System.out.println(replacedyear);

        }catch(IOException e) {
            System.out.println(e.getMessage());
    }
}
}



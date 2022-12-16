import java.util.Scanner;

public class Calculator {
    public static Double $last = 0d;
    public static void main(String[] args) {
        Boolean stop = false;
        String operator;
        Double number1, number2;

      
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome");

                while(!stop){
                    String line;
                    line = sc.nextLine();
            
                    String[] input = line.trim().split(" ");
            
                     operator = input[1].trim();
                  
                     if(!input[0].equals("$last")){
                        number1 = Double.parseDouble(input[0].trim());
                     }else{
                        number1 = $last;
                     }
            
                     if(!input[2].equals("$last")){
                        number2 = Double.parseDouble(input[2].trim());
                     }else{
                        number2 = $last;
                     }

                    if(operator.equalsIgnoreCase("+")){
                        $last = number1 + number2;
                    } 

                    if(operator.equalsIgnoreCase("-")){
                        $last  = number1 - number2;          
                    }
                    
                    if(operator.equalsIgnoreCase("*")){
                        $last  = number1 * number2;                    
                    }

                    if(operator.equalsIgnoreCase("/")){
                        $last = number1 / number2;      
                    }
                    System.out.println($last);
                    
                    if(line.equalsIgnoreCase("exit")){
                        System.out.println("Bye Bye");
                                    stop = true;
                     }

            } // while
            sc.close();
        
        }
        

}
        
        

    


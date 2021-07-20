package Sixkyu;
import java.util.HashMap;

public class Conversion {

    public static void main(String[] args) {

        //Should come back MCMXC
        conversion("1990");



    }

    public static String conversion(String nr){
        String[] nrToBeConverted = nr.split("\\|");
        HashMap<String,String> mapOfConversion = new HashMap<>();
        mapOfConversion.put("1","I");
        mapOfConversion.put("5","V");
        mapOfConversion.put("10","X");
        mapOfConversion.put("50","L");
        mapOfConversion.put("100","C");
        mapOfConversion.put("500","D");
        mapOfConversion.put("1000","M");

        System.out.println(mapOfConversion.get("10"));


        return null;
    }
}

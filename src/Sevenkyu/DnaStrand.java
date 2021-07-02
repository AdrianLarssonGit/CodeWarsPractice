package Sevenkyu;

public class DnaStrand {

    public static String makeComplement(String dna) {
        String newString = "";
        for(int i = 0; i < dna.length(); i++){
            if(dna.substring(i,i+1).equals("A")){
                newString = newString + dna.substring(i,i+1).replace(dna.substring(i,i+1),"T");
            }
            if(dna.substring(i,i+1).equals("T")){
                newString = newString + dna.substring(i,i+1).replace(dna.substring(i,i+1),"A");
            }
            if(dna.substring(i,i+1).equals("C")){
                newString = newString + dna.substring(i,i+1).replace(dna.substring(i,i+1),"G");
            }
            if(dna.substring(i,i+1).equals("G")){
                newString = newString + dna.substring(i,i+1).replace(dna.substring(i,i+1),"C");
            }
        }

        return newString;
    }

    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));

    }


}


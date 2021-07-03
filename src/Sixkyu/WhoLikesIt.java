package Sixkyu;

public class WhoLikesIt {

    public static void main(String[] args) {
        String string = whoLikesIt("Peter");
        System.out.println(string);

    }

    public static String whoLikesIt(String... names) {
        if(names.length == 0){
            return "no one likes this";
        }
        else if(names.length > 3){
            return names[0] + ", " + names[1] + " and " + Integer.toString(names.length - 2) + " others like this";
        }
        else{
            String stringWhoLikesIt = "";
            for(int i = 0; i < names.length; i++){
                if(i+1 == names.length && names.length != 1){
                    stringWhoLikesIt = stringWhoLikesIt + " and " + names[i] + " like this";
                }
                else if(i+1 == names.length && names.length == 1){
                    stringWhoLikesIt = stringWhoLikesIt + "" + names[i] + " likes this";
                }
                else{
                    if(names.length == 2 && i == 0){
                        stringWhoLikesIt = stringWhoLikesIt + names[i];
                    }
                    else if(names.length == 3 && i == 1){
                        stringWhoLikesIt = stringWhoLikesIt + names[i];
                    }
                    else{
                        stringWhoLikesIt = stringWhoLikesIt + names[i] + ", ";
                    }

                }


            }
            return stringWhoLikesIt;
        }

    }
}

import java.util.ArrayList;

public class Kata{
        public static float tArea(String tStr) {
            //We are counting \n not dots
            //Sum of \n - 2 == total height
            // Longest string of dots - 1 == base


            int countDots = 0;


            String linesOfString[] = tStr.split("\\r?\\n");
            int countLevles = -2 + linesOfString.length;


            for(int i = 0; i < linesOfString.length; i++){
                if(linesOfString[i].length() > countDots){
                    countDots = 0;
                    countDots = linesOfString[i].replaceAll("\\s+","").length() - 1;

                }
            }

            return(((float)countDots/2) * (float)countLevles);
        }

    public static void main(String[] args) {
        System.out.println(tArea("\n.\n. .\n. . .\n"));

    }
    }


/*  .
    .      .
    .      .       .      ---> should return 2.0

    .
    .      .
    .      .       .
    .      .       .      .      ---> should return 4.5


    2,Kata.tArea("\n.\n. .\n. . .\n"),0.0);
    assertEquals(8,Kata.tArea("\n.\n. .\n. . .\n. . . .\n. . . . .\n"),0.0);

    9

    Area = (0,5*b)*h
    */


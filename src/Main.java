
public class Main {
    // String handling

    public static void main(String[] args) {
        //Define a string called string1 that has assigned the value "Hello"
        String string1 ="Hello";
        //  Define a string called string2 that has assigned the value "How are you?"
        String string2 ="How are you?" ;

        //   Take the first 2 characters string1 (He) ( l'intervallo 0-1-2 dove 0 non è nulla)
        String string1FirstTwoChar = (string1.substring(0,2));
        //  Take the last 2 characters of string2  (u?)
        String string2LastTwoChar = (string2.substring(string2.length()-2));
        //faccio la somma delle prime due e degli ultimi due char
        String FirstAndTwoLastChar = (string1FirstTwoChar+ string2LastTwoChar);
        // dedicated array called charArray
        char[] charArray = FirstAndTwoLastChar.toCharArray();
        // Print charArray
        System.out.println(charArray);

        // and combine the 4 chars (Heu?)  into a



    }
}


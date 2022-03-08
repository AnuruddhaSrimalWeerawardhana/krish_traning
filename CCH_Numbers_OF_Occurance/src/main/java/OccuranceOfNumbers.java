
import java.util.HashMap; // maping value and the key
import java.util.Locale;
import java.util.Scanner; // getting the user inputs
public class OccuranceOfNumbers { //class name
    private Scanner takeinput;
    private String upper_case_word;
    private HashMap<Character , Integer> hashMap = new HashMap<Character, Integer>(); //creating object of hashmap

    public OccuranceOfNumbers(){
        takeinput = new Scanner(System.in); // constructor intailizing the scanner class

    }
     public void takingInputs() throws  InterruptedException { // taking inputs
        String inputWord;
        System.out.println("Well come to the number occurance of letters calculator");
        System.out.println("Enter Your word please"); // promte to the user
        inputWord = takeinput.nextLine();


        System.out.println("The word you have entered is " + inputWord);// printing the user entered word
         String upper_case_word = convertToUpperCase(inputWord); // convert user entered word in to upperCase
         String orderWord; // printing the word in order manager

         int validateCharacter = validateCharacter(upper_case_word); //calling the method to validate the input
         if(validateCharacter == 0){ // if no issue run this block

             orderWord = sortCharactor(upper_case_word); //sort the algorithem
             System.out.println(orderWord);

             hashMap =calculateOccurance(orderWord);//get the occurences

             for(Character itt : hashMap.keySet()){
                 System.out.println(itt+"=" +hashMap.get(itt)); //printing the occurence
             }
         }
         else {
             // when the input is wrong
             System.out.println("Your input is wrong either you have numbers, spaces , or symbols ! Please CHECK AGAIN ");
             System.out.println("Program will exit now!");
             Thread.sleep(2000);
             System.exit(0);
         }

     }

     public String convertToUpperCase(String word){ // methord for convert the word to uppercase
        upper_case_word = word.toUpperCase();
        return upper_case_word;
     }

     public int validateCharacter(String upper_case_word) throws  InterruptedException{
        char checkCharacter;
        for(int i=0; i < upper_case_word.length(); i++){
            checkCharacter = upper_case_word.charAt(i); // validate the word and checking if any symbolic letter if so error
           if (Character.isAlphabetic(checkCharacter)) {
               System.out.println("please hold on we are validating the inputs");
               Thread.sleep(100);
           }
           else {
               return -1;
           }
        }
        return 0;
     }

    public String  sortCharactor(String uppercase_word) {
        //sorting the values in alphabetic order
        char temp;
        char arr[] = uppercase_word.toCharArray(); //sort
        String orderedWord = null;
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0 + i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            orderedWord = String.valueOf(arr);

        }
        return orderedWord;

    }

public  HashMap<Character, Integer> calculateOccurance(String upper_case_word) //algorithmn to count the numbers of occurence
{
    char ch_character;
    int count;
    for(int i=0; i<upper_case_word.length(); i++){
        ch_character = upper_case_word.charAt(i);
        if(hashMap.containsKey(ch_character)){
            count =hashMap.get(ch_character);
            count++;
            hashMap.replace(ch_character, count);
        }
        else {
            hashMap.put(ch_character,1);
        }
    }

    return hashMap;

}




}


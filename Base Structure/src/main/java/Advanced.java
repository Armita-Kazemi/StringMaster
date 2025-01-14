import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
        String result="";
        String[] words=sentence.split("\\s+");
        for (int i=0;i<words.length;i++){
            result+= (words[i].equals(word)) ? newWord : words[i];
            if(i!= words.length-1){
                result+=" ";//add space between words except for the last one
            }
        }
        return result;
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){
        firstName=firstName.toLowerCase();
        lastName=lastName.toLowerCase();
        String normalizedFirstName =firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        String normalizedLastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        return normalizedFirstName + " " + normalizedLastName;
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        String result="";
        char prevChar=input.charAt(0);
        for(int i=1;i<input.length();i++){
            char currentChar=input.charAt(i);
            if(currentChar!=prevChar){
                result += prevChar;
                prevChar=currentChar;
            }
        }
        result+=prevChar;
        return  result;
    }
}

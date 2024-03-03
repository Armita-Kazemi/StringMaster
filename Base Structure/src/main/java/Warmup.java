public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] words = sentence.split("\\s+");
        if(n<=0){
            return "n must be positive!";
        }
        if(n>words.length){
            return "Number = "+n+" is out Of Bound";
        }else{
            return words[n-1];
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
            int count=0;
            for (int i=0;i<number.length();i++){
                char digit = number.charAt(i);
                if((searchForEven && digit % 2 == 0) || (!searchForEven && digit % 2 != 0)){
                    count++;
                }
            }
            return count;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
            int minlength=Math.min(wordA.length(),wordB.length());
            String result=" ";
            boolean differenceFound=false;
            for(int i=0;i<minlength;i++){
                if (wordA.charAt(i)>wordB.charAt(i)) {
                    result = wordA;
                    differenceFound=true;
                    break;
                } else if (wordA.charAt(i)<wordB.charAt(i)) {
                    result=wordB;
                    differenceFound=true;
                    break;
                }
            }
            if(!differenceFound){
                return (wordA.length()>wordB.length()) ? wordB :wordA;
            }
            return result;
    }
}

public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String []str1 = sentence.split("\\s+");
        int part = str1.length;

        if(number > part)
        {
            return " Number = "+number+" is out Of Bound";
        }
        else {
            return str1[number - 1];
        }
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        char[] charArray = number.toCharArray() ;
        int part = number.length() ;
        int result = 0 ;
        if (searchForEven) {
            for(int i = 0 ; i < part ; i++){
                if (charArray[i]%2 == 0) {
                    result = result + 1;
                }
            }
            return result ;
        }else{
            for(int i = 0 ; i < part ; i++){
                if (charArray[i]%2 != 0) {
                    result = result + 1 ;
                }
            }
            return result ;
        }
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        char[] charArray1 = wordA.toCharArray();
        char[] charArray2 = wordB.toCharArray();
        int A = wordA.length();
        int B = wordB.length();
        if (A >= B) {
            for (int i = 0; i < B; i++) {
                if (charArray1[i] < charArray2[i]) {
                    return wordA;
                } else if (charArray1[i] > charArray2[i]) {
                    return wordB;
                }
            }
        } else {
            for (int i = 0; i < A; i++) {
                if (charArray1[i] < charArray2[i]) {
                    return wordA;
                } else if (charArray1[i] > charArray2[i]) {
                    return wordB;
                }
            }
        }
        return null;
    }
}

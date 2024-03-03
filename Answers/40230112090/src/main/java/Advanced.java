import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
        return sentence.replace(word, newWord);
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){
        int size1 = firstName.length() ;
        int size2 = lastName.length() ;
        String str3 ;
        String str4 ;
        String str5 ;
        if (size1 > 1 && size2 > 1) {
            String str1 =firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() ;
            String str2 = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase() ;
            str3 = str1 + " " + str2 ;
            return str3 ;
        } else if (size1 > 1 && size2 <= 1) {
            String str1 =firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() ;
            str4 = str1 ;
            return str4 ;
        } else if (size1 <= 1 && size2 > 1) {
            String str2 = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase() ;
            str5 = str2 ;
            return str5 ;
        }
        return null ;
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        char[] charArray1 = word.toCharArray();
        int n = word.length();
        char[] charArray2 = new char[n];
        int size1 = 0 , size2 = 0 ;
        for (int j = 0; j < n-1; j++) {
            if (charArray1[j] != charArray1[j + 1]) {
                charArray2[size1++] = charArray1[j] ;

            } else if (charArray1[j] == charArray2[j+1]) {
                size2++ ;
            }
        }
        charArray2[size1++] = charArray1[n-1] ;
        String result = new String(charArray2 , 0 , size1) ;
        return result ;
    }
}


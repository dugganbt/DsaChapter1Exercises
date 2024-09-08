public class RemovePunctuationOfString {

    public static String removePunctuationOfString(String s){
        String punctuation = ".,;:!?'";
        StringBuilder s_new = new StringBuilder();

        for (char c : s.toCharArray()){
            if (punctuation.indexOf(c) == -1){ // Append only if the character isn't punctuation
                s_new.append(c);
            }
        }

        return s_new.toString();    // convert the stringbuilder to a string instance when returning
    }

}

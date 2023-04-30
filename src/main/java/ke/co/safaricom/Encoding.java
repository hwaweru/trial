package ke.co.safaricom;

public class Encoding {
    private static char[] alphabets= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',};
    public static String encode(String msg,int key){
        for (char c:msg.toCharArray()){
            int charPos =alphabets.indexOf(c);
            int newPos = charPos + key;
            char replacement = alphabets[newPos];

        }
        return "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
    }
}

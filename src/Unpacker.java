
public class Unpacker {

    private  StringBuilder cipher;
    private CheckValid checkValid;

    public Unpacker(String cipher) {
        this.cipher = new StringBuilder(cipher);
        this.checkValid = new CheckValid(cipher);
    }


    public void unpackingWord() {
        for(int i = 0; i < cipher.length(); i++) {
            int openBracket = -1;
            int startDigit =-1;
            if(cipher.charAt(i) == ']'){
                for(int j = i; j>=0; j--) {
                    if(cipher.charAt(j) == '[') {
                        openBracket = j--;
                        while (j >= 0 && Character.isDigit(cipher.charAt(j))){
                            j--;
                        }
                        startDigit = j + 1;
                        break;
                    }
                }
                String iteratorCount = cipher.substring(startDigit , openBracket);
                String block = cipher.substring(openBracket+1, i );
                cipher.replace(startDigit, i+1, block.repeat(Integer.parseInt(iteratorCount)));
                i = -1;
            }
        }
        System.out.println(cipher);
    }
}

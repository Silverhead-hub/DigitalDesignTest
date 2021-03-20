public class Main {

    public static void main(String[] args) {
        String cipher = "3[2[x]y]" ;
        Unpacker unpacker = new Unpacker(cipher);
        unpacker.unpackingWord();
    }

}

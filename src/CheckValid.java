public class CheckValid {
    private String cipher;

    public CheckValid(String cipher) {
        isNotEmpty(cipher);
        isValidCharacters(cipher);
    }

    public void isNotEmpty(String cipher) {
        if (cipher == null || cipher.length() == 0){
            throw new IllegalArgumentException();
        }
    }

    public void isValidCharacters(String cipher) {
        if (!cipher.matches("[A-Za-z\\d\\[\\]]+")) {
            throw new IllegalArgumentException();
        }
    }
}

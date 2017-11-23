public class Decipher{    
    public String input = "";
    public String decrypted = "";
    //public String ciphered = cypher;
    public Decipher(String in){
    in = input;
    }
    public String decrypt(){
    int len = input.length();
    for(int i = 0; i < len; i++){
    int ascii = (int) input.charAt(i) - 1;
    if (ascii == -1){
    ascii = 126;
    }
    char ch = (char) ascii; 
    decrypted = decrypted + ch;
    /*int ascii = (int) ch;
    int newascii = ascii - 1;
    char c = (char) newascii;
    decrypted = decrypted + c; */
    //not sure if 
    }
    System.out.println(decrypted);
    return decrypted;
    }
    

}
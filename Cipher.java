public class Cipher{
    public String input = "";
    public String cypher = "";
    public Cipher(String in){
    in = input;
    }
    public String encrypt(){
    int len = input.length();
    for(int i = 0; i < len; i++){
    int ascii = (int) input.charAt(i) + 1;
    if (ascii == 127){
    ascii = 0;
    }
    char ch = (char) ascii;
    cypher = cypher + ch;
    /* 
     * int ascii = (int) ch;
    int newascii = ascii + 1;
    char c = (char) newascii;
    cypher = cypher + c; */
    }
    System.out.println(cypher);
    return cypher;
    }
}
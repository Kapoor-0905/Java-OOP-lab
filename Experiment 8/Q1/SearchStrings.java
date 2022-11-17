/*Write a program for searching strings for the first occurrence of a character or substring and for the last occurrence of a character orsubstring. */
public class SearchStrings {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("First occurrence of 'l' = " + str.indexOf('l'));
        System.out.println("Last occurrence of 'l' = " + str.lastIndexOf('l'));
        System.out.println("First occurrence of 'He' = " + str.indexOf("He"));
        System.out.println("Last occurrence of 'lo' = " + str.lastIndexOf("lo"));
    }    
}

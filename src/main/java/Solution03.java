import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args){
        /*
        Print "What is the quote?"
            Input = quote
        Print "Who said it?"
            Input = author
        Display author saying their quote
         */
        Scanner input = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = input.nextLine();

        System.out.print("Who said it? ");
        String author = input.nextLine();

        System.out.println(author + " says, \"" + quote + "\"");
    }
}

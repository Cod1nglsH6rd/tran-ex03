import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args){
        /*
        Ask for a quote
            Input = quote
        Ask for the Author
            Input = author
        Display both author and their quote
         */
        Scanner input = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = input.nextLine();

        System.out.print("Who said it? ");
        String author = input.nextLine();

        System.out.println(author + " says, \"" + quote + "\"");
    }
}

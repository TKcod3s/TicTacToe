import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        String[] boardSpaces = new String[9];
        for (int i = 0; i < 9; i++) {
            boardSpaces[i] = " ";
        }

        boolean turnOrder = true;

        System.out.println(String.format("%s|%s|%s", boardSpaces[0], boardSpaces[1], boardSpaces[2]));
        System.out.println("-----");
        System.out.println(String.format("%s|%s|%s", boardSpaces[3], boardSpaces[4], boardSpaces[5]));
        System.out.println("-----");
        System.out.println(String.format("%s|%s|%s", boardSpaces[6], boardSpaces[7], boardSpaces[8]));

        System.out.println("Player one, please select a space");

        Scanner input = new Scanner(System.in);
        int index = input.nextInt();

    }
}

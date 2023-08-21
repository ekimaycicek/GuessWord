import java.util.Scanner;

public class GuessWord {

    public static void main(String[] args) {
        String word = "Ekoloji";
        int i, guess = 0, key = 0, correctNumber = 0;
        String letters[] = new String[word.length()];

        System.out.println("You have 5 wrongs to find the word.");
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < word.length(); i++) {
            letters[i] = "_ ";
        }

        finish:
        while (guess < 6) {
            System.out.println("enter a letter (Your remaining right " + (5 - guess) + ") : ");
            String letter = scanner.nextLine();
            guess++;
            for (i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter.charAt(0)) {
                    letters[i] = letter + " ";
                    key = 1;
                    correctNumber++;
                    if (correctNumber == word.length()) {
                        System.out.println("word " + word + "...Congratulations...");
                        break finish;
                    }
                }
            }
            if (key == 1) {
                key = 0;
                guess--;
            }
            for (i = 0; i < word.length(); i++) {
                System.out.print(letters[i]);
            }
            System.out.println();
        }
        if (correctNumber != word.length()) {
            System.out.println("I am sad... Correct answer " + word);
        }
}
}
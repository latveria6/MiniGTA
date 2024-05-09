//MiniGTA 
//Jose Cruz
//Jay Bambhroliya (gave pointers)
//Nandini Patel (gave pointers)

import java.util.Scanner;

public class MiniGTA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You just stole $1,000,000 from the bank.");
        System.out.println("Answer the following decisions correctly,");
        System.out.println("And you might succeed in escaping.\n");

        String[][] questionsAndAnswers = {
                {"You hear sirens approaching. What's your next move?\nA) Hide in an alley\nB) Steal a car\nC) Call for backup", "B"},
                {"You see a police roadblock ahead. How do you proceed?\nA) Ram through it\nB) Turn around\nC) Hide in a garage", "C"},
                {"You're surrounded by police helicopters. What do you do?\nA) Jump into water\nB) Find cover\nC) Surrender", "A"}
        };

        int wrongAnswersCount = 0;

        for (String[] questionAndAnswer : questionsAndAnswers) {
            System.out.println(questionAndAnswer[0]);
            String answer = scanner.nextLine().toUpperCase();
            if (!answer.equals(questionAndAnswer[1])) {
                wrongAnswersCount++;
                System.out.println("Wrong answer! You've been captured.");
                break;
            }
        }

        if (wrongAnswersCount == 0) {
            System.out.println("Congratulations! You've escaped from the law. Now go spend your money ;)");
        } else if (wrongAnswersCount == 1) {
            System.out.println("Captured by security.");
          }
        scanner.close();
    }
}

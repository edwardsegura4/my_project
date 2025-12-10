import java.util.Scanner;

class Question {
    String question;
    String a, b, c, d;
    String correct;

    Question(String q, String a, String b, String c, String d, String correct) {
        this.question = q;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.correct = correct;
    }

    void show() {
        System.out.println(question);
        System.out.println("A. " + a);
        System.out.println("B. " + b);
        System.out.println("C. " + c);
        System.out.println("D. " + d);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = 1_000_000_000;

      
        Question q1 = new Question(
            "What is the capital of the Philippines?",
            "Cebu", "Manila", "Davao", "Palawan",
            "B"
        );

        Question q2 = new Question(
            "Which language is used for Android Development?",
            "Java", "Python", "Ruby", "C++",
            "A"
        );

        Question q3 = new Question(
            "Who invented Java?",
            "James Gosling", "Bill Gates", "Dennis Ritchie", "Elon Musk",
            "A"
        );

        Question q4 = new Question(
            "Which planet is known as the Red Planet?",
            "Earth", "Saturn", "Mars", "Venus",
            "C"
        );

        Question q5 = new Question(
            "What is 10 * 10?",
            "50", "100", "150", "200",
            "B"
        );


        Question[] questions = { q1, q2, q3, q4, q5 };

        while (true) {
            
            System.out.println("===== WHO WANTS TO BECOME A BILLIONAIRE =====");
            System.out.println("1. Start Game");
            System.out.println("2. Exit");
            System.out.print("Choose: ");
            int choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1) {
                System.out.print("Do you want to become a billionaire? ");
                String agree = scan.nextLine().toUpperCase();
                if (!agree.equalsIgnoreCase("Yes")) {
                    System.out.println("You must agree to continue!");
                    continue;
                }


                for (Question q : questions) {
                    q.show();
                    System.out.print("Your answer: ");
                    String answer = scan.nextLine().toUpperCase();

                    if (answer.equals(q.correct)) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Wrong! -10% deducted!");
                        money -= money * 0.10;
                    }
                    System.out.println();
                }

                System.out.println("Game Over!");
                System.out.println("Your final money: ₱" + money);
                System.out.println();
            } 
            else if (choice == 2) {
                System.out.println("Thank you for playing!");
                break;
            } 
            else {
                System.out.println("Invalid choice!");
            }
        }

        scan.close();
    }
}


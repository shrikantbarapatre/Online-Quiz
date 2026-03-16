import java.util.Scanner;

public class OnlineQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Java is a ____?",
            "2. Which keyword is used to inherit a class?",
            "3. JVM stands for?"
        };

        String[][] options = {
            {"A. Language", "B. OS", "C. Hardware", "D. Browser"},
            {"A. super", "B. this", "C. extends", "D. implements"},
            {"A. Java Virtual Machine", "B. Java Visual Model", "C. Just VM", "D. None"}
        };

        char[] answers = {'A','C','A'};

        int score = 0;

        System.out.println("===== ONLINE QUIZ APPLICATION =====\n");

        for(int i=0;i<questions.length;i++)
        {
            System.out.println(questions[i]);

            for(int j=0;j<options[i].length;j++)
            {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer: ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            if(userAnswer == answers[i])
            {
                System.out.println("Correct!\n");
                score++;
            }
            else
            {
                System.out.println("Wrong Answer!\n");
            }
        }

        System.out.println("===== QUIZ FINISHED =====");
        System.out.println("Your Score: " + score + "/" + questions.length);

        sc.close();
    }
}
package quizApp;

import data.Input;

public class Quiz {
    public static void startQuiz() throws InterruptedException {

        int score = 0;
        String options = "abcd";

        System.out.println("Instructions:");
        System.out.println("You will be asked 5 questions, each with 4 options.");
        System.out.println("Please choose the correct option by entering a, b, c, or d.");

        Thread.sleep(2000);

        QuestionService questionService = new QuestionService();
        for (int i = 0; i < 5; i++) {
            questionService.questions.get(i).displayQuestionWithOptions();
            System.out.print("Your Choice: ");
            char userChoice = Input.nextChar();
            System.out.println();
            if (questionService.questions.get(i).getAnswer().equals(questionService.questions.get(i).getOptions()[options.indexOf(userChoice)]))
                score++;
        }

        System.out.println("Your score is: " + score + "/5");
        if (score >= 3)
            System.out.println("Congratulations! You passed the quiz.");
        else
            System.out.println("Sorry, you failed the quiz. Better luck next time!");
    }
}

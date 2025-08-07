package quizApp;

import data.Input;

public class Console {
    public static void main(String[] args) throws InterruptedException {

        QuestionService questionService = new QuestionService();

        System.out.println("Welcome to the Quiz App!");
        System.out.println("---------------------------------");

        System.out.println("Please select your profile:\n 1. Student\n 2. Teacher\n 3. Admin");
        System.out.print("Your choice: ");
        int profile = Input.nextInt();

        if (profile == 1)
            Quiz.startQuiz();
        else {
            while (true){
                System.out.println("Please select what you want to do:\n 1. Add Question\n 2. View Questions\n 3. Delete Question \n 4. Exit");
                System.out.print("Your choice: ");
                int choice = Input.nextInt();
                switch (choice) {
                    case 1:
                        questionService.addQuestion();
                        break;
                    case 2:
                        questionService.displayAllQuestions();
                        break;
                    case 3:
                        questionService.deleteQuestion();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        System.out.println("Thank you for using the Quiz App!");
    }
}
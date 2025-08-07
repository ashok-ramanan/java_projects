package quizApp;

import data.Input;

import java.util.ArrayList;
import java.util.List;

public class QuestionService {
    List<Question> questions = new ArrayList<Question>();


//    Question question1 = new Question(1, "What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, "Paris");
//    Question question2 = new Question(2, "What is 2 + 2?", new String[]{"3", "4", "5", "6"}, "4");
//    Question question3 = new Question(3, "What is the largest planet in our solar system?", new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, "Jupiter");
//    Question question4 = new Question(4, "What is the boiling point of water?", new String[]{"90°C", "100°C", "110°C", "120°C"}, "100°C");
//    Question question5 = new Question(5, "Which planet has the most moons?", new String[]{"Mars", "Jupiter", "Saturn", "Uranus"}, "Saturn");
//    Question[] questions = new Question[]{question1, question2, question3, question4, question5};

    public QuestionService(){
        questions.add(new Question(1, "Which planet has the most moons?", new String[]{"Mars", "Jupiter", "Saturn", "Uranus"}, "Saturn"));
        questions.add(new Question(2, "What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, "Paris"));
        questions.add(new Question(3, "What is 2 + 2?", new String[]{"3", "4", "5", "6"}, "4"));
        questions.add(new Question(4, "What is the largest planet in our solar system?", new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, "Jupiter"));
        questions.add(new Question(5, "What is the boiling point of water?", new String[]{"90°C", "100°C", "110°C", "120°C"}, "100°C"));
    }

    public void addQuestion() {
        System.out.print("Enter question ID: ");
        int id = Input.nextInt();
        Input.nextLine(); // Consume newline
        System.out.print("Enter question text: ");
        String questionText = Input.nextLine();
        String[] options = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter option " + (char) ('a' + i) + ": ");
            options[i] = Input.nextLine();
        }
        System.out.print("Enter the correct answer: ");
        String answer = Input.nextLine();
        questions.add(new Question(id, questionText, options, answer));
        System.out.println("Question added successfully!");

    }

    public void displayAllQuestions() {
        for (Question q : questions) {
            q.displayQuestionWithAnswer();
            System.out.println("-----------------------------");
        }
    }

    public void deleteQuestion() {
        System.out.print("Enter question ID to delete: ");
        int id = Input.nextInt();
        questions.removeIf(q -> q.getId() == id);
        System.out.println("Question deleted successfully!");
    }

}

package java_quiz;

import java.util.ArrayList;

public class Java_Quiz {

    public static void main(String[] args) {

        System.out.println("1: " + QuizAggregate.allQuizAggregate().get(0).getQuizTopic());
        System.out.println("2: " + QuizAggregate.allQuizAggregate().get(0).getQuizzesImported().get(0));

//        QuizAggregate findQuiz = QuizAggregate.allQuizAggregate().get(0);
        Quizzes mainQuiz;
        mainQuiz = (Quizzes) QuizAggregate.allQuizAggregate().get(1).getQuizzesImported().get(4);
        System.out.println(mainQuiz.getQuestion());
        System.out.println(mainQuiz.getAnswer());
        System.out.println(mainQuiz.getMcq1());
        System.out.println(mainQuiz.getMcq2());
        System.out.println(mainQuiz.getMcq3());
        System.out.println(mainQuiz.getMcq4());
        System.out.println("3: " + mainQuiz);
        int sizeOfCurrQuiz;
        sizeOfCurrQuiz = (int) QuizAggregate.allQuizAggregate().get(1).getQuizzesImported().size();
        System.out.println("here's the size of the selected array: " + sizeOfCurrQuiz);
    }

}

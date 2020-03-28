package java_quiz;

import java.util.ArrayList;

public class Java_Quiz {

    public static void main(String[] args) {
        
        System.out.println("1: "+ QuizAggregate.allQuizAggregate().get(0).getQuizTopic());
        System.out.println("2: "+ QuizAggregate.allQuizAggregate().get(0).getQuizzesImported().get(0));
        
        final QuizAggregate findQuiz = QuizAggregate.allQuizAggregate().get(0);
        ArrayList<Quizzes> mainQuiz = (ArrayList<Quizzes>) findQuiz.getQuizzesImported().get(0);
        System.out.println("3: "+ findQuiz);
        System.out.println("4: "+ mainQuiz);
    }

}

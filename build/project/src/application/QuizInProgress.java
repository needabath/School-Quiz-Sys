package application;

import java.util.LinkedList;
import java.util.Queue;

public class QuizInProgress {
	Queue<Question> questions = new LinkedList<Question>();//NOTE:- Using an abstract data type here
	//I used this due to the first in first out policy of queues and would be easier to use than a list since i don't have to initialize an additional counter
	double score = 0;
	
	Question currentQuestion = new Question();
	
}

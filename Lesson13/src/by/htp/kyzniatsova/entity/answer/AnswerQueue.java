package by.htp.kyzniatsova.entity.answer;

import java.util.Queue;

import by.htp.kyzniatsova.entity.prediction.Target;

public class AnswerQueue {
	public static final String targetLove = "Love";
	public static final String targetFamily = "Family";
	public static final String targetFuture = "Future";
	public static final String targetCareer = "Career";
	
	Answer answ = null;

	public Queue<Answer> queueAnsw = null;
	Target target = null;
	
	public AnswerQueue() {
	}

	public AnswerQueue(Target t) {
		queueAnsw.offer(new Answer(targetLove));
		queueAnsw.offer(new Answer(targetFamily));
		queueAnsw.offer(new Answer(targetFuture));
		queueAnsw.offer(new Answer(targetCareer));
	}

	@Override
	public String toString() {
		return "AnswerQueue [queueAnsw=" + queueAnsw + ", target=" + target + "]";
	}
	
}

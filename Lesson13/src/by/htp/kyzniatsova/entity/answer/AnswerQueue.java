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
	
	
	
//	public Answer showAnswer(int id) {
//		if(id == 1) {
//			answ = new LinkedList<Answer>();
////			showLoveAnswer();
//			answ.add("Happy love all life ");
//			answ.add("Love to 3 persons ");
//			answ.add("One love for all life ");
//			answ.add("You'll meet tomorrow ");
//			return answ;
//		}
//		if(id == 2) {
//			
//			answ = new LinkedList<String>();
////			showDieAnswer(List<String> answ);
//			answ.add("You will have been living 100 years ");
//			answ.add("You will get rescue ");
//			answ.add("You will transform your body ");
//			answ.add("You won't die ");
//			return answ;
//		}
//		
//		if(id == 3) {
//			
//			answ = new LinkedList<String>();
////			showFamilyAnswer(List<String> answ);
//			answ.add("You will have been always get together ");
//			answ.add("Happy family all life ");
//			answ.add("You will have 5 children ");
//			return answ;
//		}
//		if(id == 4) {
//			
//			answ = new LinkedList<String>();
////			showCareerAnswer(List<String> answ);
//			answ.add("You will be a famous programmer ");
//			answ.add("You will work for Google ");
//			answ.add("You will deserve a promotion ");
//			return answ;
//		}
//		if(id == 5) {
//			
//			answ = new LinkedList<String>();
////			showFutureAnswer(List<String> answ);
//			answ.add("You will have been living 100 years ");
//			answ.add("You will get rescue ");
//			answ.add("You will transform your body ");
//			answ.add("You won't die ");
//			return answ;
//		}
//		if(id == 6) {
//	
//			answ = new LinkedList<String>();
////			showPetsAnswer(List<String> answ);
//			answ.add("You will get a cat ");
//			answ.add("You will have a dog; ");
//			answ.add("You will have 3 cats for you life ");
//			answ.add("Your cat will have been livig with you all life ");
//			return answ;
//		}
//		return answ;
//		
//	}
	
//	public List<String> showLoveAnswer(){
//		List<String> answ = new LinkedList<String>();
//		answ.add("Happy love all life ");
//		answ.add("Love to 3 persons ");
//		answ.add("One love for all life ");
//		answ.add("You'll meet tomorrow ");
//		return answ;
//	}
//	
//	public List<String> showDieAnswer(List<String> answ){
//		answ = new LinkedList<String>();
//		answ.add("You will have been living 100 years ");
//		answ.add("You will get rescue ");
//		answ.add("You will transform your body ");
//		answ.add("You won't die ");
//		return answ;
//	}
//	
//	public  List<String> showFamilyAnswer(List<String> answ){
//		answ = new LinkedList<String>();
//		answ.add("You will have been always get together ");
//		answ.add("Happy family all life ");
//		answ.add("You will have 5 children ");
//		
//		return answ;
//	}
//	
//	public List<String> showCareerAnswer(List<String> answ){
//		answ = new LinkedList<String>();
//		answ.add("You will be a famous programmer ");
//		answ.add("You will work for Google ");
//		answ.add("You will deserve a promotion ");
//		
//		return answ;
//	}
//	
//	public List<String> showFutureAnswer(List<String> answ){
//		answ = new LinkedList<String>();
//		answ.add("You will have been living 100 years ");
//		answ.add("You will get rescue ");
//		answ.add("You will transform your body ");
//		answ.add("You won't die ");
//		
//		return answ;
//	}
//	
//	public List<String> showPetsAnswer(List<String> answ){
//		answ = new LinkedList<String>();
//		answ.add("You will get a cat ");
//		answ.add("You will have a dog; ");
//		answ.add("You will have 3 cats for you life ");
//		answ.add("Your cat will have been livig with you all life ");
//		
//		return answ;
//	}

	
	
	
	
	

}

package prediction;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import by.htp.predictor.been.Answer;
import by.htp.predictor.been.Client;
import by.htp.predictor.been.PredictionEnum;

public class InitializeBaseClassForTest {
	Client client = new Client();
	PredictionEnum prediction = PredictionEnum.LOVE;
	Answer answer = new Answer("Fortunately, You will meet yout love today!");
	GregorianCalendar calendar  = new GregorianCalendar();

	String date = new SimpleDateFormat("yyyy/MM/dd").format(calendar.getTime());
}

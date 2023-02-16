package lab3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProfileTest {
	  
	   @Test
	   public void test() {
		   Profile profile = new Profile("Bull Hockey, Inc.");
		   Question question = new BooleanQuestion(1, "Got bonuses?");
		   Criteria criteria = new Criteria();
		   Answer criteriaAnswer = new Answer(question, Bool.TRUE);
		   Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
		   criteria.add(criterion);
		   }
	   }
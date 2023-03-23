package lab3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProfileTest {
	private Profile profile;
	private BooleanQuestion question;
	private Criteria criteria;

	@Before
	public void create() {
		profile = new Profile("Bull Hockey, Inc.");
		question = new BooleanQuestion(1, "Got bonuses?");
		criteria = new Criteria();
	}

	/**
	 * Sets up a criteria that do not match this profiles' answer.
	 *
	 * @param questionWeight Weight of the mismatched question to add.
	 *                       Determines how the mismatched test will fail.
	 */
	private void setUpMisMatchedProfileAndCriteria(Weight questionWeight) {
		Answer profileAnswer = new Answer(question, Bool.FALSE);
		profile.add(profileAnswer);

		Answer criteriaAnswer = new Answer(question, Bool.TRUE);
		Criterion criterion = new Criterion(criteriaAnswer, questionWeight);
		criteria.add(criterion);
	}

	@Test
	public void matchAnswersFalseWhenMustMatchCriteriaNotMet() {
		// Arrange
		setUpMisMatchedProfileAndCriteria(Weight.MustMatch);
		// Act
		boolean matches = profile.matches(criteria);
		// Assert
		assertFalse(matches);
	}

	@Test
	public void matchAnswersTrueForAnyDontCareCriteria() {
		// Arrange
		setUpMisMatchedProfileAndCriteria(Weight.DontCare);
		// Act
		boolean matches = profile.matches(criteria);
		// Assert
		assertTrue(matches);
	}
}
/***
 * Excerpted from "Pragmatic Unit Testing in Java with JUnit",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/utj2 for more book information.
***/
package iloveyouboss;

import org.junit.*;

import static org.junit.Assert.*;

public class ProfileTest {

   private Profile profile;
   private Question question;
   private  Answer profileAnswer;
   private Criteria criteria;
   private Answer criteriaAnswer;
   @Before
   public void setUp() {
      this.profile = new Profile("Bull Hockey, Inc.");
      this.question = new BooleanQuestion(1, "Got bonuses?");
      this.profileAnswer = new Answer(question, Bool.TRUE);

      this.criteria = new Criteria();
      this.criteriaAnswer = new Answer(question, Bool.TRUE);
   }
   @Test
   public void test() {
      Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);

      this.profile.add(profileAnswer);
      this.criteria.add(criterion);

      boolean matches = this.profile.matches(criteria);
      assertTrue(matches);
   }
}

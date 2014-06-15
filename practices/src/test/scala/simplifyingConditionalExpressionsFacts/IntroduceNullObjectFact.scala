package simplifyingConditionalExpressionsFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import simplifyingConditionalExpressions.introduceNullObject.{Customer, Site, Client}

@RunWith(classOf[JUnitRunner])
class IntroduceNullObjectFact extends FunSpec with Matchers {
  describe("IntroduceNullObjectFact") {
    it("should_get_basic_statment_given_does_not_have_customer") {
      val site = new Site(null);
      val client = new Client(site);
      client.getStatement() should be("Basic Plan occupant 0")
    }

    it("should_get_customer_statment_given_has_customer") {
      val site = new Site(new Customer);
      val client = new Client(site);
      client.getStatement() should be("Real Plan Name 100")
    }
  }
}

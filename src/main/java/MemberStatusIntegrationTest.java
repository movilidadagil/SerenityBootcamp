import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

/*
Initially, our tests are based on
 the typical membership points feature in an e-commerce application.
  A customer can join the member program.
  As the customer purchases goods on the platform,
   the membership points will increase,
   and the customer's membership grade would grow accordingly.
 */
@RunWith(SerenityRunner.class)
public class MemberStatusIntegrationTest {

    @Steps
    private MemberStatusSteps memberSteps;

    @Test
    public void membersShouldStartWithBronzeStatus() {
        memberSteps.aClientJoinsTheMemberProgram();
        memberSteps.theMemberShouldHaveAStatusOf(MemberGrade.Bronze);
    }
}

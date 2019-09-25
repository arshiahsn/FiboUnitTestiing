import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        FiboTestOne.class,
        FiboTestTwo.class
})

public class FiboTestSuite {
    // the class remains empty,
    // used only as a holder for the above annotations
}

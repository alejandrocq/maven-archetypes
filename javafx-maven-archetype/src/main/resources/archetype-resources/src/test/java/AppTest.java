package ${groupId};

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AppTest {
    @Test public void test_that_test_work() throws Exception {
        // Check if this insane math operation works
        assertThat(1 + 1, is(2));
    }
}

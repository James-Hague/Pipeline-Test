import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoryTestTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("before test");
    }
    @Test
    public void main() {
        System.out.println("Shortly after we moved to rural South Carolina, we found out Clemson Ag Extension was selling all sorts of berry and fruit trees at great rates. We needed quite a few things because the property we bought was cleared cow pasture and, besides a huge pecan tree, had no other trees on it.\n" +
                "\n" +
                "So I ordered blueberry and blackberry bushes and apple, peach and pear trees. When it came time to pick up the order, my friend called to ask if I could pick hers up, too. I told her we’d better take two trucks.\n" +
                "When I got to the extension office I was shocked to find the pickup area empty except for some little bundles of twigs tied with string. I asked where my order was and the attendant led me to one of those bundles. They were bare root cuttings, which take up very little space. \u2028I could lift mine in one hand.\n" +
                "I mentioned to the attendant that I felt silly bringing a truck to pick up the order. It was then that I noticed a man behind me. He ruefully stated, “Don’t feel bad; I brought a trailer.”");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after test");
    }
}
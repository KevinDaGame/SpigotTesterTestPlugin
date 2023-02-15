package io.github.jwdeveloper.spigot.SpigotTestTestPlugin;

import io.github.jwdeveloper.spigot.tester.api.SpigotTest;
import io.github.jwdeveloper.spigot.tester.api.TestContext;
import io.github.jwdeveloper.spigot.tester.api.annotations.Test;
public class SimpleTest extends SpigotTest {

    public SimpleTest(TestContext testContext) {
        super(testContext);
    }

    @Test(name = "This is a simple test")
    public void testSimple() {
        assertion(1).shouldBe(1);
        System.out.println("This is a simple test");
    }
}

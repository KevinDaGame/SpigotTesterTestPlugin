package io.github.jwdeveloper.spigot.SpigotTestTestPlugin;

import io.github.jwdeveloper.spigot.tester.api.SpigotTest;
import io.github.jwdeveloper.spigot.tester.api.annotations.Test;
import io.github.jwdeveloper.spigot.tester.api.assertions.SpigotAssertion;

public class SimpleTest implements SpigotTest {

    @Test(name = "This is a simple test")
    public void testSimple() {
        SpigotAssertion.shouldBeEqual(1, 2);
    }
}

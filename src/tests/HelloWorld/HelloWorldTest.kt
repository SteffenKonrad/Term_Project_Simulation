package HelloWorldTest

import main.kotlin.HelloWorld.getHelloWorldString
import org.junit.Assert.assertEquals
import org.junit.Test


class HelloWorldTest {

    @Test
    fun testString() {
        assertEquals("Hello World!!!", getHelloWorldString())
    }
}
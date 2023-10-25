package tests

import MainActivity
import org.testng.annotations.Test
import java.util.concurrent.TimeUnit

class TestsClassOne : MainActivity() {

    @Test
    fun testOne(){
        println("Тест1")
        TimeUnit.SECONDS.sleep(10)
    }
}
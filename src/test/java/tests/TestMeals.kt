package tests

import api_client.enviroment.Environment.enviroment
import api_client.requests.Meals.Meals
import api_client.specifications.Specifications
import org.testng.annotations.Test

class TestMeals {

    @Test
    fun TestMeals1() {
        Specifications.installSpecification(Specifications.requestSpec(enviroment.host))

        Meals.get(mutableMapOf())

    }
}
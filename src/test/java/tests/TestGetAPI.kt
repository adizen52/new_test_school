package tests

import MainActivity
import api_client.enviroment.Environment.enviroment
import api_client.requests.categories.Categories
import api_client.specifications.Specifications.installSpecification
import api_client.specifications.Specifications.requestSpec
import org.testng.annotations.Test

class TestGetAPI: MainActivity() {

    @Test
    fun TestGetAPIOne(){

        installSpecification(requestSpec(enviroment.host))

        Categories.get(mutableMapOf())
    }
}
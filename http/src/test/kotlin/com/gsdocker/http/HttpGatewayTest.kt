package com.gsdocker.http

import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.RunTestOnContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(VertxUnitRunner::class)
class HttpGatewayTest {

    @JvmField @Rule
    val rule = RunTestOnContext()



    @Test
    fun startTest(context: TestContext) {
        rule.vertx().deployVerticle("com.gsdocker.http.HttpGateway")

        rule.vertx().close()
    }
}

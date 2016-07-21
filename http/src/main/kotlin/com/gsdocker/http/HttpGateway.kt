package com.gsdocker.http

import io.vertx.core.AbstractVerticle
import io.vertx.core.Future
import io.vertx.core.http.HttpServer

class HttpGateway : AbstractVerticle() {

    private var server:HttpServer? = null;

    override fun start(startFuture: Future<Void>?) {

        this.server = vertx.createHttpServer()

        this.server!!.requestHandler {
            request ->
        }

        server!!.listen(config().getInteger("port",8080))
    }
}
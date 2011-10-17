#!/usr/bin/env groovy

@Grab('groovy:groovy-xmlrpc:0.3')

import groovy.net.http.HTTPServer

s = new HTTPServer()
s.get = {inn, out, uri, version ->
    new QuizMaster(uri, out)
}

s.startServer(new ServerSocket(1024))
println "Server started"
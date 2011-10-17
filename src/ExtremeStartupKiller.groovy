#!/usr/bin/env groovy

@Grab('groovy:groovy-xmlrpc:0.3')

import groovy.net.http.HTTPServer
import structures.Question
import doers.QuizMaster
import doers.QuizReporter

s = new HTTPServer()
s.get = {inn, out, uri, version ->
    new QuizMaster(new Question(uri), new QuizReporter(out)).answer()
}

s.startServer(new ServerSocket(1024))
println "Server started"
#!/usr/bin/env groovy

class ExtremeStartupKillerTest extends GroovyTestCase {
    void testMathPlus() {
        def url = new URL("http://localhost:1024/?q=7f502b30:%20what%20is%204%20plus%206")
        assert url.text =~ /10/
    }

    void testMittNavnEr() {
        def url = new URL("http://localhost:1024/?q=bfdfb3c0:%20mitt%20navn%20er%20Hans.%20hva%20heter%20jeg")
        assert url.text =~ /Hans/
    }

    void testStorstTall() {
        def url = new URL("http://localhost:1024/?q=fdfc3eb0:%20hvilket%20av%20disse%20tallene%20er%20storst:%2010,%20223")
        assert url.text =~ /Hans/
    }
}
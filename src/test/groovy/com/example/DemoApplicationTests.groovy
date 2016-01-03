package com.example

import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.boot.test.TestRestTemplate
import org.springframework.boot.test.WebIntegrationTest
import org.springframework.web.client.RestTemplate

import spock.lang.Specification

@SpringApplicationConfiguration(classes = DemoApplication)
@WebIntegrationTest
class DemoApplicationTests extends Specification {

	RestTemplate template = new TestRestTemplate();
	
	def "Root access will return HelloGroovyWorld!"() {
		when:
		def body = template.getForEntity("http://localhost:8080", String).body

		then:
		body == "Hello Groovy World!"
	}
}

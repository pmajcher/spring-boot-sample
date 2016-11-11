package pl.flaghunter.harau.sandbox

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@SpringBootTest(classes = Application, webEnvironment = RANDOM_PORT)
class HelloControllerSpec extends Specification {

	@Autowired
	TestRestTemplate restTemplate

	def "should return Foooo for root path"() {
		when:
		ResponseEntity entity = this.restTemplate.getForEntity("/", String.class);

		then:
		entity.statusCode == HttpStatus.OK
		entity.body == "Foooo"
	}
}

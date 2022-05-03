import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.{RequestMapping, RestController}


@RestController
@EnableAutoConfiguration
class Rest

object Rest extends App {

  @RequestMapping(Array("/"))
  def hello = {
    "Hello World"
  }

  SpringApplication.run(classOf[Rest])
}

TODO: what is fiber thread?   
TODO: what is Project Loom?   
TODO: difference between Project Loom And Coroutine   


package test

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http("testSimaulation")
		.get("http://127.0.0.1:8080/test")
        	.header("Client-Version", "1")

	val scn = scenario("Scenario1")
		.exec(httpProtocol)

    setUp( 
        scn.inject(atOnceUsers(1000)) 
    )
}
   

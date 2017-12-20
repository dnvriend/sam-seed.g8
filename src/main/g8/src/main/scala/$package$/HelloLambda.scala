package $package$

import com.amazonaws.services.lambda.runtime.Context
import com.github.dnvriend.lambda.annotation.HttpHandler
import com.github.dnvriend.lambda.{ApiGatewayHandler, HttpRequest, HttpResponse}
import play.api.libs.json._

@HttpHandler(
 path = "/hello",
 method = "get"
 )
 class HelloLambda extends ApiGatewayHandler {
    override def handle(request: HttpRequest, ctx: Context): HttpResponse = {
        HttpResponse(
        200,
        Json.toJson("Hello world"),
        Map.empty
        )
    }
}
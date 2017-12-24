package $package$

import com.github.dnvriend.lambda.annotation.HttpHandler
import com.github.dnvriend.lambda.{ApiGatewayHandler, HttpRequest, HttpResponse, SamContext}
import play.api.libs.json._

@HttpHandler(path = "/hello", method = "get")
 class HelloLambda extends ApiGatewayHandler {
    override def handle(request: HttpRequest, ctx: SamContext): HttpResponse = {
        HttpResponse.ok.withBody(Json.toJson("Hello world"))
    }
}
package controllers

import javax.inject._

import cheep.data._

import models._
import play.api.libs.json.{JsError, Json}
import play.api.mvc._

@Singleton
class ApiController @Inject() (
    val controllerComponents: ControllerComponents,
    val model: PostsModel
) extends BaseController {
  import JsonFormats._

  def posts() = Action { implicit request: Request[AnyContent] =>
    Ok(Json.toJson(model.posts))
  }

  def create() = Action(parse.json) { implicit request =>
    val postResult = request.body.validate[Post]
    postResult.fold(
      errors => BadRequest(JsError.toJson(errors)),
      post => {
        val id = model.create(post)
        Ok(Json.toJson(id))
      }
    )
  }
}

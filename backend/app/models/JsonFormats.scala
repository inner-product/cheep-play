package models

import cheep.data._

import play.api.libs.json._

object JsonFormats {
  implicit val idFormat: Format[Id] = Json.format[Id]

  implicit val postFormat: Format[Post] =
    Json.format[Post]

  implicit val postsFormat: Format[Posts] =
    Json.format[Posts]
}

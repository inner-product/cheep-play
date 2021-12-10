package cheep.api

import cheep.data._

import cats.effect.IO
import org.http4s.Method._
import org.http4s.circe.CirceEntityCodec._
import org.http4s.client.dsl.io._
import org.http4s.dom._
import org.http4s.syntax.all._

object Api {
  val host = uri"http://localhost:9000"

  val client = FetchClientBuilder[IO].create

  def posts: IO[Posts] = client.expect[Posts](host / "api" / "posts")

  def create(post: Post): IO[Id] =
    client.expect[Id](POST(post, host / "api" / "post"))

}

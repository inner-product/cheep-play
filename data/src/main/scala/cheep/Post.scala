package cheep.data

import io.circe.generic.semiauto._
import io.circe.Codec
import monocle.Lens

final case class Post(author: String, text: String)
object Post {
  implicit val postCodec: Codec[Post] = deriveCodec[Post]

  val author = Lens[Post, String](_.author)(a => _.copy(author = a))
  val text = Lens[Post, String](_.text)(t => _.copy(text = t))

  def empty: Post = Post("", "")
}

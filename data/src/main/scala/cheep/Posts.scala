package cheep.data

import io.circe.generic.semiauto._
import io.circe.Codec

final case class Posts(posts: List[(Id, Post)])
object Posts {
  implicit val postCodec: Codec[Posts] = deriveCodec[Posts]

  val empty: Posts = Posts(List.empty)
}

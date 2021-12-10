package cheep.data

import io.circe.generic.semiauto._
import io.circe.Codec

final case class Id(id: Int)
object Id {
  implicit val idCodec: Codec[Id] = deriveCodec[Id]
  implicit val idOrdering: Ordering[Id] = Ordering.by(id => id.id)
}

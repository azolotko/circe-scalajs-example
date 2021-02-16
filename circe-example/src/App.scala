import io.circe.parser.decode

object App extends scala.App {
  val raw =
    """
      |{
      |  "xxx": ["a", "b", "c"],
      |  "yyy": ["aa", "bb"],
      |  "zzz": ["aaa"]
      |}
    """.stripMargin

  decode[Map[String, Vector[String]]](raw) match {
    case Left(error) =>
      println("failed to decode")

    case Right(value) =>
      println(s"decoded: $value")
  }
}
import mill._
import scalalib._
import mill.scalajslib.ScalaJSModule

object `circe-example` extends ScalaJSModule {
  override def scalaVersion = "2.13.4"

  override def scalaJSVersion = "1.5.0"

  override def ivyDeps = Agg(
    ivy"io.circe::circe-parser::0.13.0"
  )
}

trait Task {
  val configParser : JSONConfigParser
  type Config = configParser.Config

  def run(jsonString: String): Unit = {
    val cfg = configParser.parse(jsonString)
    execute(cfg)
  }

  def execute(cfg: Config): Unit
}

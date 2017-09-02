
trait Task {
  type Config
  val configParser : JSONConfigParser[Config]
  def run(jsonString: String): Unit = {
    val cfg = configParser.parse(jsonString)
    execute(cfg)
  }

  def execute(cfg: Config): Unit
}

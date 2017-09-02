
trait Task {
  type ConcreteJSONConfig
  val configParser : JSONConfigParser[ConcreteJSONConfig]
  def run(jsonString: String): Unit = {
    val cfg = configParser.parse(jsonString)
    execute(cfg)
  }

  def execute(cfg: ConcreteJSONConfig): Unit
}

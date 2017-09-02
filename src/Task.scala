
trait Task {
  type ConcreteJSONConfig
  val parser : JSONConfigParser[ConcreteJSONConfig]
  def run(jsonString: String): Unit = {
    val cfg = parser.parse(jsonString)
    execute(cfg)
  }

  def execute(cfg: ConcreteJSONConfig): Unit
}

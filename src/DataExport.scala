object DataExport extends Task {
  case class Blob(account: String, key: String, container: String, path: String)
  case class ConfigExport(id: String = "DataExportConfig", blob: Blob = Blob("a", "a", "a", "a"))

  val configParser = new JSONConfigParser {
    type Config = ConfigExport

    override def parse(jsonString: String): ConfigExport = {
      println(s"Parsing $jsonString")
      val cfg = ConfigExport()
      println(cfg.toString)
      cfg
    }
  }

  override def execute(cfg: ConfigExport): Unit = {
    println("Doing DataExportConfig proprietary things")
    println(s"Config ID = ${cfg.id}")
  }
}

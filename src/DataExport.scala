object DataExport extends Task {

  object configParser extends JSONConfigParser[Config] {

    override def parse(jsonString: String): Config = {
      println("Parsing " + jsonString)
      val cfg = new Config()
      println(cfg.toString())
      cfg
    }
  }

  case class Blob(account: String, key: String, container: String, path: String)
  case class Config(id: String = "DataExportConfig", blob: Blob = new Blob("a", "a", "a", "a"))


  override def execute(cfg: Config): Unit = {
    println("Doing DataExportConfig proprietary things")
    println("Config ID = "+cfg.id)
  }

}

object DataExport extends Task {

  override type ConcreteJSONConfig = DataExportConfig

  object configParser extends JSONConfigParser[DataExportConfig] {

    override def parse(jsonString: String): DataExportConfig = {
      println("Parsing " + jsonString)
      val cfg = new DataExportConfig()
      println(cfg.toString())
      cfg
    }
  }

  case class Blob(account: String, key: String, container: String, path: String)
  case class DataExportConfig(id: String = "DataExportConfig", blob: Blob = new Blob("a", "a", "a", "a"))


  override def execute(cfg: ConcreteJSONConfig): Unit = {
    println("Doing DataExportConfig proprietary things")
    println("Config ID = "+cfg.id)
  }

}

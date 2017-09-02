object DataExport extends Task {

  override type ConcreteJSONConfig = DataExportConfig
  override val parser = DataExportConfigParser

  case class Blob(account: String, key: String, container: String, path: String)

  case class DataExportConfig(id: String = "DataExportConfig")

  object DataExportConfigParser extends JSONConfigParser[DataExportConfig] {

    override def parse(jsonString: String): DataExportConfig = {
      println("Parsing " + jsonString)
      val cfg = new DataExportConfig()
      println(cfg.toString())
      cfg
    }
  }

  override def execute(cfg: ConcreteJSONConfig): Unit = {
    println("Doing DataExportConfig proprietary things")
  }

}

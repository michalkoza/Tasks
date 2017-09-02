object UploadExtractor extends Task {

  override type ConcreteJSONConfig = UploadExtractionConfig

  object configParser extends JSONConfigParser[UploadExtractionConfig] {

    override def parse(jsonString: String): UploadExtractionConfig = {
      println("Parsing " + jsonString)
      val cfg = new UploadExtractionConfig()
      println(cfg.toString())
      cfg
    }
  }

  case class Blob(account: String, key: String, container: String, path: String)
  case class UploadExtractionConfig(id: String = "UploadExtractionConfig", blob: Blob = new Blob("a", "a", "a", "a"), info: String = "emptyinfo")

  override def execute(cfg: ConcreteJSONConfig): Unit = {
    println("Doing UploadExtraction proprietary things")
    println("Config ID = "+cfg.id)
  }

}

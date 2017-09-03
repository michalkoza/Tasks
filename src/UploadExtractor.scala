object UploadExtractor extends Task {
  case class Blob(account: String, key: String, container: String, path: String)
  case class ConfigUpload(id: String = "UploadExtractionConfig", blob: Blob = Blob("a", "a", "a", "a"), info: String = "emptyinfo")

  val configParser = new JSONConfigParser {
    type Config = ConfigUpload

    override def parse(jsonString: String) = {
      println(s"Parsing $jsonString")
      val cfg = ConfigUpload()
      println(cfg.toString)
      cfg
    }
  }

  override def execute(cfg: ConfigUpload): Unit = {
    println("Doing UploadExtraction proprietary things")
    println(s"Config ID = ${cfg.id}")
  }
}

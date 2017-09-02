import UploadExtractor.configParser.Config

object UploadExtractor extends Task {

  object configParser extends JSONConfigParser {

    case class Blob(account: String, key: String, container: String, path: String)
    case class Config(id: String = "UploadExtractionConfig", blob: Blob = new Blob("a", "a", "a", "a"), info: String = "emptyinfo")

    override def parse(jsonString: String): Config = {
      println("Parsing " + jsonString)
      val cfg = new Config()
      println(cfg.toString())
      cfg
    }
  }

  override def execute(cfg: Config): Unit = {
    println("Doing UploadExtraction proprietary things")
    //println("Config ID = "+cfg.)
  }
}

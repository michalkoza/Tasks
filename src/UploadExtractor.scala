
object UploadExtractor extends Task{

  override type ConcreteJSONConfig = UploadExtractionConfig
  override val parser = UploadExtractionConfigParser

  case class Blob(account: String, key: String, container: String, path: String)
  case class UploadExtractionConfig(id: String = "UploadExtractionConfig")

  object UploadExtractionConfigParser extends JSONConfigParser[UploadExtractionConfig]{

    override def parse(jsonString: String): UploadExtractionConfig = {
      println ("Parsing "+jsonString)
      val cfg = new UploadExtractionConfig()
      println (cfg.toString())
      cfg
    }
  }

  override def execute(cfg: ConcreteJSONConfig): Unit = {
    println("Doing UploadExtraction proprietary things")
  }

}

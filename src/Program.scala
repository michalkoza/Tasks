
object Program {
  def main(args: Array[String]): Unit = {
    UploadExtractor.run(args(0))
    DataExport.run(args(0))
  }
}

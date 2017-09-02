
trait JSONConfigParser {
  type Config
  def parse(jsonString: String) : Config
}

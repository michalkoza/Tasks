
trait JSONConfigParser[ConcreteConfig] {
  def parse(jsonString: String) : ConcreteConfig
}

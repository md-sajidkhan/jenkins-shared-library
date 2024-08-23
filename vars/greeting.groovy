def call(){
  def greet = new com.test.Greet()
  def hello = greet.greeting()
  echo "${hello}"
}

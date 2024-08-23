def call(){
  def greet = new com.test.Greet(this)
  def hello = greet.greeting()
  echo "${hello}"
}

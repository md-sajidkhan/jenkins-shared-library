def call(int num){
  def doubleObj = new com.test.Double()
  def doubledValue = doubleObj.multiplyByTwo(num)
  echo "The double value of ${num} is ${doubledValue}"
  
}

def doubleValue(int num){
  def double = new com.test.Double()
  def doubledValue = double.doubleValue(num)
  echo "The double value of {$num} is ${$doubledValue}"
  
}

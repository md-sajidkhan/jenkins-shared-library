def doubleValue(int num){
  def doubleObj = new com.test.Double()
  def doubledValue = doubleObj.doubleValue(num)
  echo "The double value of {$num} is ${$doubledValue}"
  
}

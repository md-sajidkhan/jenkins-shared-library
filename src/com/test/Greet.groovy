package com.test

class Greet{
  def steps

    Greet(steps) {
        this.steps = steps
    }
  def greeting(){
    return steps.libraryResource('text.txt')
  }
}

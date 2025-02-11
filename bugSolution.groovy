```groovy
def myMethod(param) {
  if (param == null) {
    throw new NullPointerException("Parameter cannot be null")
  }
  // ... rest of the method
}

try {
  println myMethod(null)
} catch (NullPointerException e) {
  println "Exception caught: ${e.message}"
}
```
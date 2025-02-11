```groovy
def myMethod(param) {
  if (param == null) {
    return 0 //This is incorrect if the method expects a non-null return
  }
  // ... rest of the method
}

println myMethod(null) //This will print 0, but the caller might expect an exception
```
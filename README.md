# Groovy Null Handling Bug

This repository demonstrates a common issue in Groovy related to handling null values in method parameters.  The `myMethod` function doesn't explicitly handle the case where the `param` is null, which can lead to unexpected behavior depending on how the method is used and what the caller expects.

The `bug.groovy` file contains the buggy code. The `bugSolution.groovy` file provides a solution using explicit null checks and exception handling.

## How to Reproduce
1. Clone this repository.
2. Run `groovy bug.groovy` to observe the unexpected behavior.
3. Run `groovy bugSolution.groovy` to see the corrected implementation.

## Solution
The solution introduces explicit null checks and throws a `NullPointerException` if the parameter is null, aligning with expected behavior for non-nullable parameter types and preventing unexpected results.
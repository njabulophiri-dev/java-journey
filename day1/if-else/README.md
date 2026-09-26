# If / Else Exercises

A set of exercises to practice conditional logic in Java.
## How to use this

1. Read the exercise.
2. **Try it yourself before looking at the solution.**
3. Write your code in a file like `Exercise1.java`.
4. Compile and run it: `javac Exercise1.java && java Exercise1`.
5. Test with different inputs, not just the example.
6. Only then compare with the solution in `solutions/`.

Struggling is part of the process. If you get stuck for more than 20 minutes look at the solution, understand then close it and rewrite from memory.

## Ground rules

- Use `if`, `else if`, `else`.
- No loops yet.
- No `switch` yet.
- No arrays yet.
- Keep each exercise in its own file.
- Use clear variable names.

---

## Exercise 1 : Even or odd

Write a program that:

- Stores an `int` in a variable called `number`.
- Prints `"even"` if the number is even.
- Prints `"odd"` if the number is odd.

**Hint:** use the modulo operator `%`. A number is even if `number % 2 == 0`.

**Test with:** `4`, `7`, `0`, `-3`

---

## Exercise 2 : Largest of two

Write a program that:

- Stores two `int` values `a` and `b`.
- Prints which one is larger.
- Prints `"equal"` if they are the same.

Example output:
a is larger

**Test with:** `(10, 5)`, `(3, 9)`, `(7, 7)`

---

## Exercise 3 : Largest of three

Write a program that:

- Stores three `int` values, `a`, `b`, `c`.
- Prints the largest one.

Example output:
The largest is 42

---

**Test with:** `(1, 2, 3)`, `(9, 4, 9)`, `(-5, -2, -8)`

**Think about:** can you do it without nesting more than two levels deep?

---

## Exercise 4 : Grade calculator

Write a program that:

- Stores a `double` score between 0 and 100.
- Prints the letter grade:

| Score   | Grade |
| ------- | ----- |
| 90–100  | A     |
| 80–89   | B     |
| 70–79   | C     |
| 60–69   | D     |
| 0–59    | F     |

- If the score is below 0 or above 100, print `"Invalid score"`.

**Test with:** `95`, `82`, `71`, `65`, `40`, `-5`, `120`

---

## Exercise 5 : Leap year

Write a program that:

- Stores a year as an `int`.
- Prints `"leap year"` or `"not a leap year"`.

Rules for a leap year:

- Divisible by 4 → leap year
- **Except** if divisible by 100 → not a leap year
- **Except** if divisible by 400 → leap year

**Test with:** `2024`, `1900`, `2000`, `2023`

**Hint:** this is a great one for combining conditions with `&&` and `||`.

---

## Exercise 6 : Login check

Write a program that:

- Stores a `String` username and a `String` password.
- If username is `"admin"` and password is `"1234"`, print `"Welcome, admin"`.
- If username is correct but password is wrong, print `"Wrong password"`.
- If username is wrong, print `"Unknown user"`.

**Hint:** use `.equals()` to compare Strings, not `==`.

**Test with:**

- `("admin", "1234")`
- `("admin", "wrong")`
- `("guest", "1234")`

---

## Exercise 7 : Ticket price

Write a program that calculates a movie ticket price based on age.

Rules:

- Age under 5 → free
- Age 5–12 → R50
- Age 13–64 → R120
- Age 65 and over → R60
- Negative age → print `"Invalid age"`

Print something like:
Ticket price: R120

**Test with:** `3`, `8`, `30`, `70`, `-1`

---

## Exercise 8 : Triangle type

Write a program that:

- Stores three `int` side lengths `a`, `b`, `c`.
- First checks if they can form a triangle.
    - They can if `a + b > c` AND `a + c > b` AND `b + c > a`.
- If they can't, print `"Not a triangle"`.
- If they can, print one of:
    - `"Equilateral"` — all sides equal
    - `"Isosceles"` — exactly two sides equal
    - `"Scalene"` — all sides different

**Test with:** `(3, 3, 3)`, `(3, 3, 5)`, `(3, 4, 5)`, `(1, 2, 10)`

**Think about:** why must the triangle check come first?

---

## Exercise 9 : FizzBuzz (single number)

Write a program that:

- Stores an `int` called `n`.
- If `n` is divisible by both 3 and 5, print `"FizzBuzz"`.
- Else if divisible by 3, print `"Fizz"`.
- Else if divisible by 5, print `"Buzz"`.
- Else print the number itself.

**Test with:** `15`, `9`, `10`, `7`

**Think about:** why must the `3 && 5` check come first?

---

## Exercise 10 : Simple calculator

Write a program that:

- Stores two `double` values `x` and `y`.
- Stores an operator as a `char` (`+`, `-`, `*`, `/`).
- Prints the result of applying the operator.
- If the operator is unknown, print `"Unknown operator"`.
- If dividing by zero, print `"Cannot divide by zero"`.

Example output:
Result: 7.5


**Test with:**

- `(5, 2, '+')`
- `(5, 2, '-')`
- `(5, 2, '*')`
- `(5, 2, '/')`
- `(5, 0, '/')`
- `(5, 2, '%')`

---

## Solutions

Solutions live in `solutions/`. Each file matches the exercise number.

Write your own attempt first. Then, and only then, look at the solution.

If your solution works but looks different from the reference, that's fine. There's more than one correct answer. The goal isn't to match exactly — it's to get the logic right.

## What you should be able to do after these

- Use `if`, `else if`, `else` correctly.
- Combine conditions with `&&`, `||`, `!`.
- Nest conditionals when one question depends on another.
- Compare Strings with `.equals()`.
- Handle invalid input.
- Order conditions correctly (specific cases before general ones).

## How to compile and run a file in solutions
Since your files are inside a subfolder, javac and java need a small adjustment:

- cd day1/if-else/solutions
- javac Exercise1.java
- java Exercise1






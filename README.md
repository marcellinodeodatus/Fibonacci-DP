# Fibonacci Calculator

This Java program calculates the Fibonacci sequence using three different methods:  
1. **Recursive approach (`fib_recursive`)**  
2. **Dynamic programming with array storage (`fib_dp`)**  
3. **Dynamic programming with optimized space (`fib_dp_optimized`)**

The program compares the performance of these approaches by measuring the execution time for calculating `Fibonacci(40)`.

---

## Functions and Their Analysis

### 1. `fib_recursive(int n)`
- **Description**: Solves the Fibonacci problem using a basic recursive approach.  
- **Logic**:  
  \[
  F(n) = 
  \begin{cases} 
  n & \text{if } n < 2 \\
  F(n-1) + F(n-2) & \text{otherwise}
  \end{cases}
  \]
- **Time Complexity**: \( O(2^n) \) (exponential growth due to redundant calculations).  
- **Space Complexity**: \( O(n) \) (call stack grows to \( n \) levels).  
- **Performance**: Very slow for large \( n \), as it recalculates many Fibonacci numbers repeatedly.  

---

### 2. `fib_dp(int n)`
- **Description**: Uses dynamic programming to compute the Fibonacci sequence, storing intermediate results in an array.  
- **Logic**: Iteratively fills an array `fibnumbers` from \( F(0) \) to \( F(n) \).  
- **Time Complexity**: \( O(n) \) (one pass through a loop).  
- **Space Complexity**: \( O(n) \) (due to the array `fibnumbers`).  
- **Performance**: Faster than recursion and avoids redundant calculations, but requires extra memory.

---

### 3. `fib_dp_optimized(int n)`
- **Description**: Optimizes the dynamic programming approach by storing only the two most recent Fibonacci numbers in variables.  
- **Logic**: Uses two variables (`fibfirst` and `fibsecond`) to iteratively compute the sequence.  
- **Time Complexity**: \( O(n) \) (one pass through a loop).  
- **Space Complexity**: \( O(1) \) (only two variables are used).  
- **Performance**: Most efficient method, as it minimizes both time and space usage.

---

## Performance Comparison

| **Function**         | **Time Complexity** | **Space Complexity** | **Efficiency**            |
|-----------------------|---------------------|-----------------------|---------------------------|
| `fib_recursive`       | \( O(2^n) \)       | \( O(n) \)           | Slow for large \( n \).   |
| `fib_dp`              | \( O(n) \)         | \( O(n) \)           | Efficient, but uses array.|
| `fib_dp_optimized`    | \( O(n) \)         | \( O(1) \)           | Most efficient solution.  |

---

## Example Output

For `n = 40`, the program calculates the 40th Fibonacci number using all three methods and measures their execution times.

Sample Output:

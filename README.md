# CA243 – Stack Assignment: Remove Adjacent Duplicates

**Student ID:** `c1240653`

## Problem
Remove adjacent pairs of identical characters repeatedly until no adjacent duplicate pair remains. The solution must use `Stack<Character>`, must not use arrays or recursion, and must run in `O(n)` time.

## Files
- `Solution.java` — Java solution for the required task and the bonus challenge.

## How it works
The program reads each character from left to right:
1. If the stack is not empty and its top character matches the current character, pop the top character. The current character is not pushed, so the matching pair disappears.
2. Otherwise, push the current character onto the stack.
3. Build the answer by reading the remaining stack characters in their original order.

This works because a stack is **Last In, First Out (LIFO)**. The most recently kept character is at the top, so it can be checked immediately against the next character. Removing a pair can expose another pair, which will be handled as the next characters are processed.

## Examples
| Input | Output |
|---|---|
| `abbaca` | `ca` |
| `azxxzy` | `ay` |
| `abcd` | `abcd` |
| `aabbcc` | empty string |

## Bonus challenge
`removeTriples(String s)` removes groups of three adjacent identical characters. It uses a character stack and a count stack, not arrays.

Example: `deeedbbcccbdaa` → `aa`

## Complexity
- **Time:** `O(n)` — each character is pushed and popped at most once (or a constant number of times in the bonus method).
- **Space:** `O(n)` — the stack can hold up to `n` characters.

## Run
With Java installed, run:

```bash
javac Solution.java
java Solution
```

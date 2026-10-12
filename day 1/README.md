# Day 1: Even or Odd

This folder contains four Java programs that determine whether an integer is even or odd using different approaches.

## Programs

| File | Description |
| --- | --- |
| `even_odd.java` | Uses the modulo operator (`%`). A number is even when its remainder after division by 2 is zero. |
| `even_odd2.java` | Uses integer division and multiplication (`x / 2 * 2 == x`) to check whether the number can be reconstructed as an even number. |
| `even_odd3.java` | Repeatedly subtracts 2 until the value reaches 0 or 1, then identifies the number as even or odd. |
| `even_odd4.java` | Demonstrates a bitwise check using the `&` operator. In the current code, `x & 0` is always 0, so it reports every input as even. |

## How to Run

From this folder, compile the programs:

```bash
javac even_odd.java even_odd2.java even_odd3.java even_odd4.java
```

Run any program, for example:

```bash
java even_odd
```

Each program asks for an integer and prints whether it is even or odd.

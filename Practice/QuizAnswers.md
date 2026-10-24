# Week 10 Practice — Quiz Answers

1. **D** — `==` compares object references; `equals()` compares string contents.
2. **B** — Appending yields `Java Lab`; reversing yields `baL avaJ`.
3. **B** — `new Student("Ravi")` directly invokes `Student(String name)`.
4. **D** — `w1` and `w2` point to the same wallet; both observe balance 700.
5. **C** — The static visitor count becomes 3.
6. **A** — The loop prints `45 78 92 60 85` in array order.
7. **B** — `continue` skips 3, so the output is `1 2 4 5`.
8. **A** — Java passes the primitive value; changing parameter `n` does not change `x`, so it prints 5.
9. **C** — Because `count` is a double, division is floating-point and prints about `83.33333333333333`.
10. **B** — A 2% fee on 500 gives `Paid 510.0 by card`.
11. **B** — Strings are immutable; `name` stays `java` while `upperName` refers to `JAVA`.
12. **B** — The literal is interned once, and `new String("hello")` creates a separate string object: 2 objects for this code pattern.
13. **A** — `Campus` has length 6 and index 2 contains `m`.
14. **A** — The `@` in `user@domain.com` is at index 4.
15. **B** — The default constructor sets title to `Unknown` and price to `0.0`.
16. **A** — The parameterized constructor sets `Java Programming` and `450.0`.
17. **B** — There are two wallet objects: one shared by `w1`/`w2` and a separate one referenced by `w3`.
18. **C** — The `w1` and `w2` references see the same updated balance, 700.
19. **C** — Changing `s1` affects only that Student object; `s2` remains `Ravi`.
20. **C** — Three Visitor objects are constructed, so `visitorCount` is 3.

# Design and Analysis of Algorithms — Assignment 2
## Pair 2 — Advanced Sorting Algorithms
**Student A:** Kalzhanov Zhansultan — Shell Sort  
**Student B:** Amanzhol Aldiyar — Heap Sort

---

##  Project Overview
This project is part of the *Design and Analysis of Algorithms* course.  
The goal was to implement, analyze, and optimize advanced sorting algorithms (Heap Sort and Shell Sort),  
then perform a peer review with full theoretical and empirical analysis.

Each student implemented one algorithm and analyzed their partner’s work in terms of:
- Asymptotic time and space complexity
- Code efficiency and readability
- Optimization opportunities
- Empirical validation and benchmarking

---

##  Implemented Algorithms

### Heap Sort (Aldiyar)
- In-place implementation using a bottom-up heapify approach.
- Tracks comparisons, swaps, and execution time via `PerformanceTracker`.
- Includes optimized heap construction and edge-case handling.

### Shell Sort (Zhansultan)
- Implements three gap sequences:
    - **Shell’s sequence**
    - **Knuth’s sequence**
    - **Sedgewick’s sequence**
- Benchmarked for multiple array sizes (100, 1,000, 10,000, 100,000).
- Tracks comparisons, swaps, and total execution time.

---



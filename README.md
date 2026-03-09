# LeetCode Practice

This repository contains my solutions to LeetCode problems using Java.

---

# Problem: Reverse String (LeetCode 344)

## Description

The goal of this problem is to reverse a string.

Example:

Input:

hello

Output:

olleh

The characters of the string must be reversed.

---

# Solution 1: Two Pointers (Swap Method)

This solution reverses the string **in place** by swapping characters from the beginning and the end.

Example:

Before:

h e l l o

After swapping:

o e l l h

Final result:

o l l e h
Explanation

Two pointers are used:

left starts at the beginning

right starts at the end

At each step we swap the characters and move the pointers toward the center.

Complexity

Time Complexity:

O(n)

Space Complexity:

O(1)

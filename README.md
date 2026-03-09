# LeetCode Practice

This repository contains my solutions to LeetCode problems using Java.

---

# Problem: Reverse String 

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


# Solution 2: StringBuilder Method

Another way to reverse a string is to create a new reversed string using **StringBuilder**.

Instead of swapping characters inside the original array, we iterate through the string **from the last character to the first**, and append each character to a `StringBuilder`.

Example:

Original string:

h e l l o

Reading from the end:

o l l e h

Final result:

olleh



Explanation

A StringBuilder object is created.

The loop starts from the last character of the string.

Each character is added to the StringBuilder using append().

At the end, toString() converts the StringBuilder into a regular string.


Time Complexity:

O(n)

Space Complexity:

O(n)

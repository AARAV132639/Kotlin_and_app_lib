# Design Of Library Management System

## Book

- Owns book state
- Knows whether its available 
- Doesn't know anything about members of fines

## Member

- Represent the library user
- Doesn't directly manage borrowing logic

## Loan
- Represent one borrowing transcation
- Knows its due date and return date
- Calculates its own fine

## Library
- Acts as the main coordinator
- Finds books/members
- Creates loans
- Handles borrow/return operations

*Implementation Experience*

Since it was the first proper implementation of OOPS concepts there were some hiccups while implementing. However I now know need of Java, importance of OOPS, and the beginning of designing any software.
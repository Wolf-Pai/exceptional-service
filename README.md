# exceptional-service
Exceptional Service: Try to test a customer-service application.

## Goal: Fix and catch possible errors -> make try-catch clauses for possible exceptions

**Classes:**
- Item
- Customer
- Store

*Item:*
Fields: `String name`, `int cost`
Methods: Constructor, `String toString()`

*Customer:*
Fields: `String name`, `int funds`, `ArrayList<Item> cart`
Methods: Constructor, `void changeName()`, `void inputFunds(int fund)`, `void purchaseItem(Store store, Item item)`, `String cartToString()`, `String toString()`

*Store:*
Fields: `String name`, `ArrayList<Item> stock`, `ArrayList<Item> inventory`
Method: Constructor, `void restockItems()`, `String inventoryToString()`, `String toString()`

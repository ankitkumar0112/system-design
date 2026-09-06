# 🍔 Food Delivery App - Low Level Design (Java)

A Java implementation of the **Low Level Design (LLD)** for a Food Delivery application using Object-Oriented Design
principles and common design patterns.

## Objective

This project demonstrates how a food delivery system can be designed using clean architecture, interfaces, composition,
and strategy patterns.

---

## Features

- Search restaurants
- View restaurant menuItem
- Add / Remove items from cart
- Delivery & Takeaway orders
- Multiple payment methods
- Email / Mobile notifications
- Singleton restaurant manager

---

## Design Patterns Used

| Pattern      | Implementation        |
|--------------|-----------------------|
| Singleton    | `RestaurantManager`   |
| Strategy     | `PaymentService`      |
| Strategy     | `NotificationService` |
| Polymorphism | `Order` interface     |
| Composition  | User → Cart           |
| Composition  | Restaurant → Menu     |

---

## Project Structure

```text
food_delivery_app/
│
├── model/
│   ├── User.java
│   ├── Restaurant.java
│   ├── Menu.java
│   └── Cart.java
│
├── notification/
│   ├── NotificationService.java
│   ├── EmailNotification.java
│   └── MobileNotification.java
│
├── order/
│   ├── Order.java
│   ├── DeliveryOrder.java
│   └── TakeawayOrder.java
│
├── payment/
│   ├── PaymentService.java
│   ├── CreditCard.java
│   └── DebitCard.java
│
├── service/
│   ├── RestaurantManager.java
│   └── CartService.java
│
├── FoodDeliveryApp.java
│── README.md
└── LLD_Flow.md
```

---

## Package Responsibilities

### model

Contains all business entities.

- User
- Restaurant
- Menu
- Cart

### order

Responsible for order creation.

- Order (Interface)
- DeliveryOrder
- TakeawayOrder

### payment

Payment strategy implementations.

- PaymentService
- CreditCard
- DebitCard

### notification

Notification strategy implementations.

- NotificationService
- EmailNotification
- MobileNotification

### service

Business logic classes.

- RestaurantManager (Singleton)
- CartService

---

## Execution Flow

1. User searches restaurants.
2. RestaurantManager returns matching restaurants.
3. User selects restaurant.
4. User adds menuItem items to cart.
5. User places Delivery or Takeaway order.
6. Selected PaymentService processes payment.
7. NotificationService sends confirmation.

---

## Future Improvements

- UPI Payment
- Wallet Payment
- Coupon Engine
- Delivery Partner Assignment
- Order Tracking
- Rating & Reviews
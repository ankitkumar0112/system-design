# Food Delivery System - Low Level Design (LLD)

A modular, extensible Low-Level Design implementation of a Food Delivery System built in Java, adhering to SOLID
principles and standard Gang of Four (GoF) design patterns.

---

## 1. System Requirements

* **User Management:** Maintain user profile information.
* **Restaurant & Menu Management:** Restaurants maintain menus containing items with defined prices.
* **Cart Management:** Encapsulated cart lifecycle managed via `CartService` (adding/removing items, calculating
  subtotals, and clearing).
* **Order Processing:** Support extensible order types (`DeliveryOrder`, `TakeawayOrder`) with customized bill
  calculations.
* **Payment Subsystem:** Extensible strategy-based payment execution (Credit Card, Debit Card, UPI).
* **Notification Subsystem:** Decoupled observer-based event dispatch for real-time order tracking (Email, Mobile Push).

---

## 2. Design Patterns Implemented

* **Strategy Pattern (`food_delivery_app.payment`):** `PaymentStrategy` interface allows runtime swapping of payment
  algorithms (`CreditCard`, `DebitCard`) without modifying `PaymentService` (Open/Closed Principle).
* **Observer Pattern (`food_delivery_app.notification`):** `NotificationObserver` allows event-driven broadcasts to
  registered delivery channels (`EmailNotification`, `MobileNotification`).
* **Service Layer Pattern (`food_delivery_app.service`):** `CartService` orchestrates business domain logic separately
  from data model entities.
* **Polymorphism & Liskov Substitution Principle (`food_delivery_app.order`):** `Order` interface contracts order
  operations uniformly across `DeliveryOrder` (with fee routing) and `TakeawayOrder`.

---

## 3. Package Structure

```text
src/food_delivery_app/
├── FoodDeliveryApp.java              # Main driver/orchestrator
├── model/
│   ├── Cart.java                     # Cart entity holding selected items
│   ├── MenuItem.java                 # Individual dish item
│   ├── OrderStatus.java              # Lifecycle status enum
│   ├── Restaurant.java               # Restaurant entity and menu registry
│   └── User.java                     # Customer profile entity
├── notification/
│   ├── EmailNotification.java        # Email observer implementation
│   ├── MobileNotification.java       # Mobile push observer implementation
│   ├── NotificationObserver.java     # Observer interface
│   └── NotificationService.java      # Subject / broadcaster
├── order/
│   ├── DeliveryOrder.java            # Home delivery calculation with fees
│   ├── Order.java                    # Base Order interface
│   └── TakeawayOrder.java            # Self-pickup order calculation
├── payment/
│   ├── CreditCard.java               # Credit card payment strategy
│   ├── DebitCard.java                # Debit card payment strategy
│   ├── PaymentService.java           # Payment orchestration service
│   └── PaymentStrategy.java          # Strategy interface
└── service/
    ├── CartService.java              # Cart operations orchestrator
    └── RestaurantManager.java        # Restaurant lookup and discovery
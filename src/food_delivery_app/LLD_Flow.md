# Food Delivery App - Low Level Design

This document contains the UML diagrams and overall flow of the Food Delivery application.

---

# 1. Class Diagram

```mermaid
classDiagram
direction LR

class User{
    +int id
    +String name
    +long phone
}

class Cart{
    +List~Menu~ items
    +addItem()
    +removeItem()
    +clear()
    +getTotal()
}

class Restaurant{
    +int id
    +String name
    +String address
}

class Menu{
    +int id
    +String name
    +double price
}

class CartService{
    +addItem()
    +removeItem()
    +calculateTotal()
}

class RestaurantManager{
    <<Singleton>>
    +searchRestaurant(location)
    +getRestaurants()
}

class Order{
    <<interface>>
    +placeOrder()
    +getTotal()
}

class DeliveryOrder{
    +deliveryAddress
}

class TakeawayOrder{
    +pickupTime
}

class PaymentService{
    <<interface>>
    +pay(amount)
}

class CreditCard
class DebitCard

class NotificationService{
    <<interface>>
    +send(orderId)
}

class EmailNotification
class MobileNotification

User *-- Cart
Cart --> Menu

Restaurant "1" *-- "1..*" Menu

RestaurantManager --> Restaurant

CartService --> Cart

Order <|.. DeliveryOrder
Order <|.. TakeawayOrder

PaymentService <|.. CreditCard
PaymentService <|.. DebitCard

NotificationService <|.. EmailNotification
NotificationService <|.. MobileNotification

DeliveryOrder --> PaymentService
DeliveryOrder --> NotificationService
DeliveryOrder --> Restaurant

TakeawayOrder --> PaymentService
TakeawayOrder --> NotificationService
TakeawayOrder --> Restaurant

User --> Order
```

---

# 2. Order Placement Flow

```mermaid
sequenceDiagram

actor User

participant RM as RestaurantManager
participant Cart
participant Order
participant Payment
participant Notify

User->>RM: Search Restaurants

RM-->>User: Restaurant List

User->>Cart: Add Menu Items

User->>Order: Place Order

Order->>Payment: pay(total)

Payment-->>Order: Payment Success

Order->>Notify: send(orderId)

Notify-->>User: Order Confirmation
```

---

# 3. Component Flow

```mermaid
flowchart LR

A[User]

B[RestaurantManager]

C[Restaurant]

D[Cart]

E[Delivery / Takeaway Order]

F[Payment Service]

G[Notification Service]

A --> B
B --> C
A --> D
D --> E
E --> F
F --> G
G --> A
```

---

# 4. Relationships

| Source             | Relation    | Target              |
|--------------------|-------------|---------------------|
| User               | Composition | Cart                |
| Restaurant         | Composition | Menu                |
| RestaurantManager  | Association | Restaurant          |
| CartService        | Association | Cart                |
| DeliveryOrder      | Implements  | Order               |
| TakeawayOrder      | Implements  | Order               |
| CreditCard         | Implements  | PaymentService      |
| DebitCard          | Implements  | PaymentService      |
| EmailNotification  | Implements  | NotificationService |
| MobileNotification | Implements  | NotificationService |

---

# 5. Design Patterns

| Pattern      | Class               |
|--------------|---------------------|
| Singleton    | RestaurantManager   |
| Strategy     | PaymentService      |
| Strategy     | NotificationService |
| Polymorphism | Order Interface     |
| Composition  | User, Restaurant    |

---

# 6. End-to-End Flow

1. User searches nearby restaurants.
2. RestaurantManager returns restaurants.
3. User views menu.
4. Items are added into Cart.
5. User chooses Delivery or Takeaway.
6. Appropriate PaymentService processes payment.
7. NotificationService sends confirmation.
8. Order is completed successfully.
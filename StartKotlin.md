# Main function in Kotlin
Main function in Kotlin is `main`
```kotlin
fun main() {
}
```

This syntax corresponds to the main function in Java.
```java
public static void main(String[] args){
}
```

# Type in Kotlin

* Unit Type
This type is same as `void` in Java

# Idiom
* Data class
```kotlin
data class Customer(val name: String, val email: String)
```

This will generate this class.

```java
public final data class Customer public constructor(name: kotlin.String, email: kotlin.String) {
    public final val email: kotlin.String /* compiled code */

    public final val name: kotlin.String /* compiled code */

    public final operator fun component1(): kotlin.String { /* compiled code */ }

    public final operator fun component2(): kotlin.String { /* compiled code */ }
}
```
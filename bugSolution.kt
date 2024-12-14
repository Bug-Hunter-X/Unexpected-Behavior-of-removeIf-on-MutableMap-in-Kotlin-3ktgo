```kotlin
fun main() {
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")

    // Safer approach using a copy to avoid concurrent modification issues
    val filteredMap = map.filterNot { it.key > 2 }.toMutableMap()
    println("Safe approach: $filteredMap")

    //Alternative Approach:  Iterate and remove elements explicitly
    val keysToRemove = map.filter { it.key > 2 }.keys
    keysToRemove.forEach{map.remove(it)}
    println("Explicit Remove: $map")
}
```
fun main() {
    // Task 1: Declare variables for name, age, and pi
    // Print the values

    // Task 2: Create a list of three fruits
    // Print the list

    // Task 3: Create a mutable list of integers
    // Add at least two numbers and print the list

    // Task 4: Check if a given number is even or odd using an if statement
    // Print the result

    // Task 5: Use a when expression to print a message based on the day of the week

    // Task 6: Use a for loop to iterate from 1 to 5 and print each iteration

    // Task 7: Use a while loop to create a countdown from 3 to 1

    // Task 8: Define a function that takes two integers and returns their sum
    // Call the function and print the result
    println("Sum: " + sum(5, 10)) // Example call

    // Task 9: Implement an interface and use it
    val myDog = Dog("Buddy")
    myDog.makeSound()
    val myCat = Cat("Mate")
    myCat.makeSound()
}

// Task 8: Define the sum function
fun sum(a: Int, b: Int): Int {
    // Implement this function
    return 0
}

// Task 9: Predefined interface
interface Animal {
    fun makeSound()
}

// Implement the interface in a class
class Dog(private val name: String) : Animal {
    override fun makeSound() {
        // Implement this method
    }
}


/* EXPECTED RESULT: 
Name: Soongyu, Age: 21, Pi: 3.14159
Fruits: [Apple, Banana, Cherry]
Numbers: [10, 20, 30]
7 is odd
Start of the week!
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4
Iteration: 5
Countdown: 3
Countdown: 2
Countdown: 1
Sum: 15
Buddy says: Woof! Woof!
Mate says: Meow! Meow!
*/

fun main(args: Array<String>) {
    // Задание 1
    fun printFullName(firstName: String, lastName: String){
        println("$firstName $lastName")
    }
    printFullName("Ольга", "Макаренко")

    // Задание 2
    printFullName(firstName = "Ольга", lastName = "Макаренко")

    // Задание 3
    fun calculateFullName(firstName: String, lastName: String) = "$firstName $lastName"
    val myName = calculateFullName("Ольга", "Макаренко")
    println(myName)

    // Задание 4
    fun calculateFullName1(firstName: String, lastName: String) : Pair<String, Int>{
        return Pair("$firstName $lastName", "$firstName$lastName".length)
    }
    val myNameLength = calculateFullName1("Ольга", "Макаренко").second
    println(myNameLength)

    // Задание 5
    fun primeNumber(num: Int) : Boolean{
        if(num > 1){
            for (i in  2 until num) if (num % i == 0) return false
            return true
        } else return false
    }
    println(primeNumber(7))

    // Задание 6
    fun fibonacci(num: Int): Int{
      //  if (num == 1 || num == 2) return 1
       // else{
            val result = ((Math.pow(1.618034, num.toDouble()) - Math.pow(1 - 1.618034, num.toDouble())) / Math.sqrt(5.0)).toInt()
            return result
       // }
    }
    println(fibonacci(10))
}
fun main(args: Array<String>) {
    var test_byte = 1
    var myShort = -32768
    var myInt: Int = 128000000
    var myLong: Long = 1000000000000000
    var myFloat: Float = 0.71F
    var myDouble: Double = 45.70707071
    var myBoolean: Boolean = true
    var letter: Char = 'a'

    println("Byte Value is: " +test_byte);
    println("Short Value is: " +myShort);
    println("Integer Value is: " +myInt);
    println("Long Value is: " +myLong);
    println("Float Value is: " +myFloat);
    println("Double Value is: " +myDouble);
    println("Boolean Value is: " +myBoolean);
    println("Char Value is: " +letter);

    println("Program arguments: ${args.joinToString()}")
}
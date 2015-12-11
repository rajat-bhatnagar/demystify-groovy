
//There are 8 primitive types in java int, long,  short, char, byte , float , double , boolean

//In Groovy everything is an object
println	3.getClass().getName()   //Prints java.lang.Integer
println 33333333333333333333333333333.getClass().getName() //prints java.math.BigInteger
println 2.1d.getClass().getName() //prints java.lang.Double
println 9.7f.getClass().getName() //prints java.lang.Float


// Note - All mathematical calculations in groovy are done at the BigDecimal level
println 3.2.getClass().getName() //prints java.math.BigDecimal

// In all financial calculations we write code at BigDecimal level


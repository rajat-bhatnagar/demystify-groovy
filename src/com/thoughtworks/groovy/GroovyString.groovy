def s = 'This is a String ${2+7}' 
println s //prints This is a String ${2+7} and DOES NOT evaluate the expression
println s.getClass().getName() //prints java.lang.String

//To evaluate an expression do not forget to use the $ before the parentheses . example ${8+5} 

//Interpolate the String
s = "I am a different String ${1+7}"
println s //prints I am a different String 8 and EVALUATES the EXPRESSION
println s.getClass().getName() // prints org.codehaus.groovy.runtime.GStringImpl

def d = 'This is some other string'
println d * 2 // Repeats the String 
println d + ' some more' // Adds to the String
println d - 'is' //removes the first occurrence of is in the string , see API docs for groovy String
 
println d[0] //prints T
println d[-2] //prints n

// The last index in a string will always be -1 and the first index is 0

def e = 'Show range function of groovy'
//Demonstrating how the range function of groovy can be used
println e[0..3] //prints Show
println e[-1..-6] //prints yvoorg
println e[-6..-1] //prints groovy
//Removing blank spaces in string using range function
println e[0..3,5..9,11..18,20..21,23..-1]  //prints Showrangefunctionofgroovy without any spaces
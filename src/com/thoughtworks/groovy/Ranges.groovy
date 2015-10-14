//The double dots define the range
def numbers = 1..10
//The operands at the left and right denote the extent of the range
for(num in numbers){
	println num
}

//Define a range for alphabets

def alphabets = 'a'..'f'
for(var in alphabets){
	println var 
}

//Creating a  enum object

def enum DAYS{
	MON,
	TUE,
	WED,
	THURS,
	FRI,
	SAT,
	SUN
}
//Create a range for the enum days
def weekdays = DAYS.MON..DAYS.FRI

//Iterate over the collection and do what you want
for(day in weekdays){
	println day
}

println "Extents: "
// Extents tell the upper and lower range
println weekdays.from
println weekdays.to
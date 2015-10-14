def numbers = 0..9
for(num in numbers){
	if(iseven(num)){
		println num
	}
}

//A function which returns only even numbers
def iseven(num){
	//Note that there is no return staement here
	//return type is implicit
	num%2 == 0
}
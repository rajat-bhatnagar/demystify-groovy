def greeting = "Hello, "
def beatles = [ "John", "Paul", "George", "Ringo" ]
for(beatle in beatles){
	println "$greeting" + "$beatle"
}

//Another way , The old java way

for(int counter=0;counter<beatles.size;counter++){
	def teamMember = "Team Member Name :: "
	println "$teamMember" + "${beatles[counter]}"
}

// Single quote is treated as a text and the expression is seen as a text

def num = 10;
println '${num * 10}'

//Double quote is evaluated and the expression is evaluated 
println "${num * 10}"
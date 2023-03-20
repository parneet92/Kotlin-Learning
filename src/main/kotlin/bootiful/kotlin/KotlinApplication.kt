package bootiful.kotlin



fun main(){

	fun transform(string : String, counter : (String) -> Int) : String =
		"there are ${counter(string)} "

	// lambda function can be outside the function parenthesis
	transform("Josh"){ str -> str.length }

	fun foo(myFunc : (String) -> Int){
		//toDo use my func
	}

	/*
	//All signatures mean the same
	foo{ name -> name.length}
	foo(){name -> name.length}
	foo({name -> name.length})

	 */

	//fun reverse(string: String) = string.reversed()
	val reverse: (String) -> String = { name -> name.reversed() }
	val name = reverse("Josh")
	val age = 31
	println("the name is $name and the age is $age")
}


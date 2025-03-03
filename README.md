# Frogs and Toads
The game is called “Frogs and Toads”. Player A thinks of a 4 digit ‘Hidden’ number. Player B must guess a 4 digit number based upon hints from Player A. 

The hints are encoded as ‘Frogs’ and ‘Toads’. The number of Frogs in a hint indicates how many digits in the guess match the Hidden number in both digit and position. The number of Toads in the hint shows the number of digits in the guess that match the Hidden number but is located in the wrong position. 

## For Example:
> Hidden number: "4185"
Player B guess: "5481"
Hint: 1 Frog and 3 Toads. (The Frog is 8; the Toads are 4, 1, and 5)

> Next Guess: “4583”
Hint:  2 Frogs and 1 Toad (The Frogs are 4 and 8; the Toad is 5)

> Next Guess: “5555”
Hint: 1 Frog and 0 Toads (The Frog is the last 5)

> Next Guess: “5454”
Hint: 0 Frogs and 2 Toads (The Toads are the first 5 and 4)

Player B continues to guess until they discover the Hidden number.

Frogs are not Toads so, so if a number is a Frog (correct digit in the correct location) then that digit does not need to be checked for Toad-worthiness.

You have been given a method named getHint(String hiddenStr, String guessStr)  that receives two parameters: the first parameter is a String that contains the Hidden number and the second parameter contains a guess String. The method should return a String “Hint”. The Hint indicates the number of Frogs and Toads according to the above rules. Use ‘F’ to indicate the Frogs and ‘T’ to indicate the Toads. Here are sample test cases and their expected results:

> getHint(“1807”,”7810”);
	Returned Hint: “1F3T”

> getHint(“1807”,”2805”);
	Returned Hint: “2F0T”

> getHint(“1807”,”9807”);
	Returned Hint: “3F0T”

> getHint(“1807”,”1807”);
	Returned Hint: “4F0T”

You have been given a potential solution to this problem. Your task is to get the provided test cases to pass and write some other test cases and then alter the code, if needed, to ensure all requirements above are fulfilled.
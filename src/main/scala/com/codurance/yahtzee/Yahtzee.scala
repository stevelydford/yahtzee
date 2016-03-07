package com.codurance.yahtzee

class Yahtzee(category: Category,
              turn: Turn,
              console: Console) {

	def startGame(): Unit = {
		console.printLine(s"Category: ${category.name}")
		val score = turn start()
		score print()
	}

}

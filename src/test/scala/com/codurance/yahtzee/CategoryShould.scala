package com.codurance.yahtzee

import com.codurance.UnitSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CategoryShould extends UnitSpec {

	"return calculate points for dice roll" in {
		Category("One").pointsFor("D1:2 D2:4 D3:1 D4:6 D5:1") should be(2)
		Category("One").pointsFor("D1:2 D2:1 D3:1 D4:6 D5:1") should be(3)
		Category("One").pointsFor("D1:2 D2:3 D3:4 D4:2 D5:6") should be(0)
	}



}
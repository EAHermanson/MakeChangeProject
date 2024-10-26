# MakeChangeProject

## Description

This program takes input from the user for the cost of an item, and the cash tendered to pay for it, and outputs the denominations of the change due.

## Technologies Used
	- Java
	- Eclipse
	- Sublime Text
	- Git/Github
	- MacOS Terminal

## Lessons Learned
	- Double arithmetic has errors and causes imprecision 


## How To Run
	This program should function on its own with only Scanner as an import, but I am running it in Eclipse in a project called makechange.
	Once running, it will prompt you for the price of a purchase, then the amount tendered for the purchase.
	It supports up to two decimal places for cents, but as there are no fractions of a cent available in US currency any further decimal points are dropped.
	The math seems to break when trying to deal with purchases above the ten million range.
	As it uses Doubles, it should also be able to handle any purchase on planet Earth at this time, even if purchasing something the most wealthy person in the world cannot afford.
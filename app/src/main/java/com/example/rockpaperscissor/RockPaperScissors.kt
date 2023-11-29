package com.example.rockpaperscissor

import java.util.Locale

fun main(){
    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper or Scissor? Enter your choice")
    playerChoice = readln()
    while ((playerChoice != "Scissor") && (playerChoice != "Paper") && (playerChoice != "Rock")) {
        println("Please give a valid input")
        playerChoice = readln()
    }

    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissor"
        }
    }

    val winner = when{
        playerChoice == computerChoice -> "Draw"
        playerChoice == "Rock" && computerChoice == "Scissor" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissor" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }
    when(winner){
        "Draw" -> {
            println("Computer's choice is also same so the match is draw")
        }
        else -> {
            println("Player's choice is $playerChoice and Computer's choice is $computerChoice so the winner is $winner")
        }
    }

}
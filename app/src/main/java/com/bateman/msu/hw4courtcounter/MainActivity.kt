package com.bateman.msu.hw4courtcounter


import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bateman.msu.hw4courtcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val courtCounterViewModel:CourtCounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        displayForTeamA(courtCounterViewModel.displayTeamAScore())
        displayForTeamB(courtCounterViewModel.displayTeamBScore())
    }


    fun addOneForTeamA(v: View?) {
        courtCounterViewModel.addOnToTeamA(1)
        displayForTeamA(courtCounterViewModel.displayTeamAScore())
    }


    fun addTwoForTeamA(v: View?) {
        courtCounterViewModel.addOnToTeamA(2)
        displayForTeamA(courtCounterViewModel.displayTeamAScore())
    }

    fun addThreeForTeamA(v: View?) {
        courtCounterViewModel.addOnToTeamA(3)
        displayForTeamA(courtCounterViewModel.displayTeamAScore())
    }

    fun addOneForTeamB(v: View?) {
        courtCounterViewModel.addOnToTeamB(1)
        displayForTeamB(courtCounterViewModel.displayTeamBScore())
    }

    fun addTwoForTeamB(v: View?) {
        courtCounterViewModel.addOnToTeamB(2)
        displayForTeamB(courtCounterViewModel.displayTeamBScore())
    }

    fun addThreeForTeamB(v: View?) {
        courtCounterViewModel.addOnToTeamB(3)
        displayForTeamB(courtCounterViewModel.displayTeamBScore())
    }

    fun resetScore(v: View?) {
        courtCounterViewModel.resetScore()
        displayForTeamA(courtCounterViewModel.scoreTeamA)
        displayForTeamB(courtCounterViewModel.scoreTeamB)
    }

    fun displayForTeamA(score: Int) {
        val scoreView = binding.teamAScore
        scoreView.text = score.toString()
    }

    fun displayForTeamB(score: Int) {
        val scoreView = binding.teamBScore
        scoreView.text = score.toString()
    }
}
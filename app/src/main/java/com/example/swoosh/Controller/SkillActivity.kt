package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import com.example.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : Base_Activity() {

    lateinit var player : Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }
    fun finishactivitybtn(view: View){
        if(player.skill !="") {
            val finish_Activity = Intent(this, FinalActivity::class.java)
            finish_Activity.putExtra(EXTRA_PLAYER, player)
            startActivity(finish_Activity)
        } else {
            Toast.makeText(this,"Please select skill level",Toast.LENGTH_SHORT).show()
        }
    }
    fun onBeginnerClicked(view: View){
        ballerskillbtn.isChecked = false
        player.skill = "beginner"
    }
    fun onBallerClicked(view: View){
        beginnerSkillbtn.isChecked = false
        player.skill= "baller"
    }
}

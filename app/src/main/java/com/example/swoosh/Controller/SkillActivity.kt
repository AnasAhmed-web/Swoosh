package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : Base_Activity() {
    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }
    fun finishactivitybtn(view: View){
        if(skill !="") {
            val finish_Activity = Intent(this, FinalActivity::class.java)
            finish_Activity.putExtra(EXTRA_LEAGUE,league)
            finish_Activity.putExtra(EXTRA_SKILL,skill)
            startActivity(finish_Activity)
        } else {
            Toast.makeText(this,"Please select skill level",Toast.LENGTH_SHORT).show()
        }
    }
    fun onBeginnerClicked(view: View){
        ballerskillbtn.isChecked = false
        skill = "beginner"
    }
    fun onBallerClicked(view: View){
        beginnerSkillbtn.isChecked = false
        skill = "baller"
    }
}

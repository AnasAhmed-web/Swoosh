package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : Base_Activity() {

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun mensLeagueClicked(view:View){
        womensleguebtn.isChecked = false
        coedleguebtn.isChecked = false
        player.league= "mens"
    }
    fun womensLeagueClicked(view:View){
        mensleaguebtn.isChecked = false
        coedleguebtn.isChecked = false
        player.league = "womens"
    }
    fun coedLeagueClicked(view: View){
        mensleaguebtn.isChecked = false
        womensleguebtn.isChecked = false
        player.league = "co-ed"
    }
    fun nextLayout(view: View){
        if(player.league != ""){
        val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER,player)

        startActivity(skillIntent)
        } else{
            Toast.makeText(this,"Please Select League.",Toast.LENGTH_SHORT).show()
        }
    }
}

package com.aprp19.valorantagents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvItemView: RecyclerView
    private val list = ArrayList<AgentModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        rvItemView = findViewById(R.id.rv_item)
        rvItemView.setHasFixedSize(true)

        list.addAll(AgentData.agentItem)


    }

    //Toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        val home = menu?.findItem(R.id.toolbar_home)
        val share = menu?.findItem(R.id.toolbar_share)
        home?.isVisible = false
        share?.isVisible = false
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.toolbar_about ->{
                Toast.makeText(applicationContext,"About Button", Toast.LENGTH_LONG).show()
                val intent = Intent(applicationContext, AboutActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showRecyclerCardView() {
        rvItemView.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = AgentAdapter(list)
        rvItemView.adapter = cardViewHeroAdapter
    }
}
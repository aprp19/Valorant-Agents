package com.aprp19.valorantagents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class DetailActivity : AppCompatActivity() {
    private lateinit var iv_agent_image : ImageView
    private lateinit var tv_agent_name : TextView
    private lateinit var iv_agent_role : ImageView
    private lateinit var tv_agent_role : TextView
    private lateinit var tv_agent_bibliography : TextView


    private lateinit var iv_agent_skill_q : ImageView
    private lateinit var tv_agent_skill_q_name : TextView
    private lateinit var tv_agent_skill_q_detail : TextView

    private lateinit var iv_agent_skill_e : ImageView
    private lateinit var tv_agent_skill_e_name : TextView
    private lateinit var tv_agent_skill_e_detail : TextView

    private lateinit var iv_agent_skill_c : ImageView
    private lateinit var tv_agent_skill_c_name : TextView
    private lateinit var tv_agent_skill_c_detail : TextView

    private lateinit var iv_agent_skill_x : ImageView
    private lateinit var tv_agent_skill_x_name : TextView
    private lateinit var tv_agent_skill_x_detail : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //Toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        iv_agent_image = findViewById(R.id.iv_agent_image)
        tv_agent_name = findViewById(R.id.tv_agent_name)
        iv_agent_role = findViewById(R.id.iv_agent_role)
        tv_agent_role = findViewById(R.id.tv_agent_role)
        tv_agent_bibliography = findViewById(R.id.tv_agent_bibliography)

        iv_agent_skill_q = findViewById(R.id.iv_agent_skill_q)
        tv_agent_skill_q_name = findViewById(R.id.tv_agent_skill_q_name)
        tv_agent_skill_q_detail = findViewById(R.id.tv_agent_skill_q_detail)

        iv_agent_skill_e = findViewById(R.id.iv_agent_skill_e)
        tv_agent_skill_e_name = findViewById(R.id.tv_agent_skill_e_name)
        tv_agent_skill_e_detail = findViewById(R.id.tv_agent_skill_e_detail)

        iv_agent_skill_c = findViewById(R.id.iv_agent_skill_c)
        tv_agent_skill_c_name = findViewById(R.id.tv_agent_skill_c_name)
        tv_agent_skill_c_detail = findViewById(R.id.tv_agent_skill_c_detail)

        iv_agent_skill_x = findViewById(R.id.iv_agent_skill_x)
        tv_agent_skill_x_name = findViewById(R.id.tv_agent_skill_x_name)
        tv_agent_skill_x_detail = findViewById(R.id.tv_agent_skill_x_detail)

        val bundle : Bundle?= intent.extras

        tv_agent_name.text = bundle!!.getString("agent_name")
        iv_agent_image.setImageResource(bundle.getInt("agent_image"))
        iv_agent_role.setImageResource(bundle.getInt("agent_role_image"))
        tv_agent_role.text = intent.getStringExtra("agent_role")
        tv_agent_bibliography.text = intent.getStringExtra("agent_detail")

        iv_agent_skill_q.setImageResource(bundle.getInt("agent_skill_1_image"))
        tv_agent_skill_q_name.text = intent.getStringExtra("agent_skill_1_name")
        tv_agent_skill_q_detail.text = intent.getStringExtra("agent_skill_1_detail")

        iv_agent_skill_e.setImageResource(bundle.getInt("agent_skill_2_image"))
        tv_agent_skill_e_name.text = intent.getStringExtra("agent_skill_2_name")
        tv_agent_skill_e_detail.text = intent.getStringExtra("agent_skill_2_detail")

        iv_agent_skill_c.setImageResource(bundle.getInt("agent_skill_3_image"))
        tv_agent_skill_c_name.text = intent.getStringExtra("agent_skill_3_name")
        tv_agent_skill_c_detail.text = intent.getStringExtra("agent_skill_3_detail")

        iv_agent_skill_x.setImageResource(bundle.getInt("agent_skill_4_image"))
        tv_agent_skill_x_name.text = intent.getStringExtra("agent_skill_4_name")
        tv_agent_skill_x_detail.text = intent.getStringExtra("agent_skill_4_detail")

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        val home = menu?.findItem(R.id.toolbar_home)
        val about = menu?.findItem(R.id.toolbar_about)
        home?.isVisible = false
        about?.isVisible = false
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.toolbar_share ->{
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, "Check out Valorant Apps")
                intent.type = "text/plain"
                startActivity(Intent.createChooser(intent, "Share to: "))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

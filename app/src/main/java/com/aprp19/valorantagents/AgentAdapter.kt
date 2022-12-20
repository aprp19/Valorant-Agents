package com.aprp19.valorantagents

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

class AgentAdapter internal constructor(private val agentList: ArrayList<AgentModel>) : RecyclerView.Adapter<AgentAdapter.CardViewViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val item = agentList[position]
        val ctx = holder.itemView.context

        Glide.with(ctx)
            .load(item.agent_image)
            .apply(RequestOptions().override(350,550))
            .into(holder.itmphoto)

        holder.tvname.text = item.agent_name
        holder.tvdetail.text = item.agent_detail


        holder.btndetail.setOnClickListener{
            Toast.makeText(ctx, "Showing Detail " + agentList[holder.adapterPosition].agent_name, Toast.LENGTH_SHORT).show()
            val intent = Intent(ctx, DetailActivity::class.java)
            intent.putExtra("agent_name", item.agent_name)
            intent.putExtra("agent_detail", item.agent_detail)
            intent.putExtra("agent_image", item.agent_image)
            intent.putExtra("agent_role_image", item.agent_role_image)
            intent.putExtra("agent_role", item.agent_role)
            intent.putExtra("agent_skill_1_image", item.agent_skill_1_image)
            intent.putExtra("agent_skill_1_name", item.agent_skill_1_name)
            intent.putExtra("agent_skill_1_detail", item.agent_skill_1_detail)
            intent.putExtra("agent_skill_2_image", item.agent_skill_2_image)
            intent.putExtra("agent_skill_2_name", item.agent_skill_2_name)
            intent.putExtra("agent_skill_2_detail", item.agent_skill_2_detail)
            intent.putExtra("agent_skill_3_image", item.agent_skill_3_image)
            intent.putExtra("agent_skill_3_name", item.agent_skill_3_name)
            intent.putExtra("agent_skill_3_detail", item.agent_skill_3_detail)
            intent.putExtra("agent_skill_4_image", item.agent_skill_4_image)
            intent.putExtra("agent_skill_4_name", item.agent_skill_4_name)
            intent.putExtra("agent_skill_4_detail", item.agent_skill_4_detail)
            ctx.startActivity(intent)
        }
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itmphoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvname: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvdetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btndetail: Button = itemView.findViewById(R.id.btn_info)
    }

    override fun getItemCount(): Int {
        return agentList.size
    }
}

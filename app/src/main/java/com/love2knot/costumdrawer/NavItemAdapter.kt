package com.love2knot.costumdrawer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NavItemAdapter(val myItemClickListener: MyItemClickListener) :
    RecyclerView.Adapter<NavItemAdapter.MyViewHolder>() {


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtHeading: TextView = itemView.findViewById(R.id.txtHeading)
        val txtSubHeading: TextView = itemView.findViewById(R.id.txtSubHeading)
        val img: ImageView = itemView.findViewById(R.id.img)
        val rlRoot: RelativeLayout = itemView.findViewById(R.id.rlRoot)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false))
    }


    override fun getItemCount(): Int {
        return 8
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        when(position){
            0-> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "Dashboard"
                holder.txtSubHeading.text = "See , All Items"
                holder.rlRoot.setOnClickListener { myItemClickListener.clicked(position) }
            }
            1-> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "Dashboard"
                holder.txtSubHeading.text = "See , All Items"
                holder.rlRoot.setOnClickListener { myItemClickListener.clicked(position) }

            }
            2-> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "Dashboard"
                holder.txtSubHeading.text = "See , All Items"
                holder.rlRoot.setOnClickListener { myItemClickListener.clicked(position) }

            }

            3-> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "Dashboard"
                holder.txtSubHeading.text = "See , All Items"
                holder.rlRoot.setOnClickListener { myItemClickListener.clicked(position) }

            }
            4-> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "Dashboard"
                holder.txtSubHeading.text = "See , All Items"
                holder.rlRoot.setOnClickListener { myItemClickListener.clicked(position) }

            }
            5-> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "Dashboard"
                holder.txtSubHeading.text = "See , All Items"
                holder.rlRoot.setOnClickListener { myItemClickListener.clicked(position) }

            }
            6-> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "Dashboard"
                holder.txtSubHeading.text = "See , All Items"
                holder.rlRoot.setOnClickListener { myItemClickListener.clicked(position) }

            }
            7 -> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "Dashboard"
                holder.txtSubHeading.text = "See , All Items"
                holder.rlRoot.setOnClickListener { myItemClickListener.clicked(position) }

            }
            8 -> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "Dashboard"
                holder.txtSubHeading.text = "See , All Items"
                holder.rlRoot.setOnClickListener { myItemClickListener.clicked(position) }

            }
        }

    }


    interface MyItemClickListener {
        fun clicked(id: Int)
    }


}


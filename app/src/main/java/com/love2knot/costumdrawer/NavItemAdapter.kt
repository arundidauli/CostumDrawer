package com.love2knot.costumdrawer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NavItemAdapter(context: Context) : RecyclerView.Adapter<NavItemAdapter.MyViewHolder>() {


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtHeading: TextView =itemView.findViewById(R.id.txtHeading)
        val txtSubHeading:TextView=itemView.findViewById(R.id.txtSubHeading)
        val img:ImageView=itemView.findViewById(R.id.img)

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
                holder.txtHeading.text = "Profile"
                holder.txtSubHeading.text = "See , edit your profile"
            }
            1-> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "Search"
                holder.txtSubHeading.text = "Search services , location here....."
            }
            2-> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "Appointments"
                holder.txtSubHeading.text = "Check pending, approved, etc....."
            }

            3-> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "Favorites"
                holder.txtSubHeading.text = "Your favorites are saved here....."
            }
            4-> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "Events"
                holder.txtSubHeading.text = "Check events here....."
            }
            5-> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "Products"
                holder.txtSubHeading.text = "Browse our products here...…."
            }
            6-> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "My orders"
                holder.txtSubHeading.text = "Know about your orders......"
            }
            7-> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "About us"
                holder.txtSubHeading.text = "Wanna know us ?...…."
            }
            8-> {
                holder.img.resources.getDrawable(R.drawable.ic_icon_ionic_ios_search)
                holder.txtHeading.text = "Contact us"
                holder.txtSubHeading.text = "Connect with us...…."
            }
        }

    }


    }


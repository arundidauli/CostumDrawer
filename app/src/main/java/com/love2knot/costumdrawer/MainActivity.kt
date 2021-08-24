package com.love2knot.costumdrawer

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.love2knot.costumdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), NavItemAdapter.MyItemClickListener {
    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.appBarMain.fab.setOnClickListener {
            val intent = Intent(applicationContext, DetailsActivity::class.java)
            startActivity(intent)
        }
        drawerLayout = binding.drawerLayout

        val rvItem: RecyclerView = findViewById(R.id.rvItem)
        rvItem.layoutManager = LinearLayoutManager(this)
        rvItem.adapter = NavItemAdapter(this)
        binding.appBarMain.drawerMenu.setOnClickListener {
            drawerLayout.open()
        }
        binding.appBarMain.searchBar.setOnClickListener {
            //Search Click
        }
        binding.navHeader.imgCancel.setOnClickListener {
            drawerLayout.close()
        }

        navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main)

    }


    override fun clicked(id: Int) {
        Toast.makeText(applicationContext, "Clicked $id", Toast.LENGTH_LONG).show()
        drawerLayout.closeDrawers()
        when (id) {
            0 -> {
                navController.navigate(R.id.nav_home)
            }
            1 -> navController.navigate(R.id.nav_gallery)
            2 -> navController.navigate(R.id.nav_slideshow)
            3 -> navController.navigate(R.id.nav_slideshow)
            4 -> navController.navigate(R.id.nav_gallery)
            5 -> navController.navigate(R.id.nav_home)
            6 -> navController.navigate(R.id.nav_gallery)
            7 -> {

            }
            else -> showConfirmLogoutDialog()
        }
    }

    fun showConfirmLogoutDialog() {

    }

}
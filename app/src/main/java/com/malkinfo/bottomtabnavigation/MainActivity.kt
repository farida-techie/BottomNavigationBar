package com.malkinfo.bottomtabnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.fragment.app.FragmentTransaction
import com.malkinfo.bottomtabnavigation.view.*

class MainActivity : AppCompatActivity() {
    private val fragmentManger = supportFragmentManager
    private val homeFrag= HomeFragment()
    private val addFrag= AddFragment()
    private val seachFrag= SeachFragment()
    private val notifiyFrag= NotificationFragment()
    private val profileFrag= ProfileFragment()
    /**call id*/
    private lateinit var btnH :ImageButton
    private lateinit var btnA :ImageButton
    private lateinit var btnS :ImageButton
    private lateinit var btnN :ImageButton
    private lateinit var btnP :ImageButton
    private lateinit var  manger :FragmentTransaction
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**set find id view*/
        btnH = findViewById(R.id.home)
        btnA = findViewById(R.id.addBtn)
        btnN = findViewById(R.id.notifiyBtn)
        btnP = findViewById(R.id.profileBtn)
        btnS = findViewById(R.id.seachBtn)
        /**set First Fragment*/
        manger = fragmentManger.beginTransaction()
            .replace(R.id.myView,homeFrag)
        manger.commit()
        btnH.setImageResource(R.drawable.ic_pink_home)

    }

    fun addFragOnClick(view: View) {
        /**set replace fragment*/
        manger = fragmentManger.beginTransaction()
        when(view){
            btnH -> {
                manger.replace(R.id.myView,homeFrag)
                    .commit()
                btnH.setImageResource(R.drawable.ic_pink_home)
                btnN.setImageResource(R.drawable.ic_notifications)
                btnA.setImageResource(R.drawable.ic_add)
                btnS.setImageResource(R.drawable.ic_search)
                btnP.setImageResource(R.drawable.ic_account_bl)
            }
            btnA -> {
                manger.replace(R.id.myView,addFrag)
                    .commit()
                btnH.setImageResource(R.drawable.ic_home)
                btnN.setImageResource(R.drawable.ic_notifications)
                btnA.setImageResource(R.drawable.ic_pink_add)
                btnS.setImageResource(R.drawable.ic_search)
                btnP.setImageResource(R.drawable.ic_account_bl)
            }
            btnS -> {
                manger.replace(R.id.myView,seachFrag)
                    .commit()
                btnH.setImageResource(R.drawable.ic_home)
                btnN.setImageResource(R.drawable.ic_notifications)
                btnA.setImageResource(R.drawable.ic_add)
                btnS.setImageResource(R.drawable.ic_baseline_search_24)
                btnP.setImageResource(R.drawable.ic_account_bl)
            }
            btnN -> {
                manger.replace(R.id.myView,notifiyFrag)
                    .commit()
                btnH.setImageResource(R.drawable.ic_home)
                btnN.setImageResource(R.drawable.ic__notifications_pink)
                btnA.setImageResource(R.drawable.ic_add)
                btnS.setImageResource(R.drawable.ic_search)
                btnP.setImageResource(R.drawable.ic_account_bl)
            }
            btnP -> {
                manger.replace(R.id.myView,profileFrag)
                    .commit()
                btnH.setImageResource(R.drawable.ic_home)
                btnN.setImageResource(R.drawable.ic_notifications)
                btnA.setImageResource(R.drawable.ic_add)
                btnS.setImageResource(R.drawable.ic_search)
                btnP.setImageResource(R.drawable.ic_account)
            }
        }
    }
    /**now run it*/

}
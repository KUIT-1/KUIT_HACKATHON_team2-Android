package com.example.hackatonkuit.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuAdapter
import androidx.fragment.app.Fragment
import com.example.hackatonkuit.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding : FragmentHomeBinding
    lateinit var adapter: MenuAdapter
    lateinit var menuList: ArrayList<MenuItem>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        //menuAdapter = MenuAdapter()
        //binding.homeRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        //binding.homeRecyclerView.adapter = menuAdapter

        initData()
        initLayout()
        return binding.root

    }

    fun initData(){
        //menuList = arrayListOf(MenuItem("아메리카노"), MenuItem("카페라떼"))
    }

    fun initLayout(){
        //adapter = MenuAdapter(menuList)
        //binding.homeNewMenuList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        //binding.homeNewMenuList.adapter = adapter
    }


    /*data class MenuItem(
        val menuimage: Int,
        val menuname: String
        )*/





    /*class MenuAdapter : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>(){
        private var menuItems: List<MenuItem> = emptyList()


        //외부에서 데이터 리스트를 설정
        fun setMenuList(menuItems: List<MenuItem>){
            this.menuItems = menuItems
            notifyDataSetChanged()
        }


        //RecyclerView의 아이템 뷰를 위한 뷰 홀더 클래스
        inner class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            private val imageView: ImageView = itemView.findViewById<ImageView>(R.id.home_new_image)
            private val textView: TextView = itemView.findViewById(R.id.home_new_name)

            fun bind(menuItem: MenuItem) {
                imageView.setImageResource(menuItem.menuimage)
                textView.text = menuItem.menuname
            }
        }
    }*/


}
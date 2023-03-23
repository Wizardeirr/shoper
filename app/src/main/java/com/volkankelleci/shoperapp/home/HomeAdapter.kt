package com.volkankelleci.shoperapp.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.volkankelleci.shoperapp.R
import com.volkankelleci.shoperapp.databinding.ShoppingListRawBinding
import com.volkankelleci.shoperapp.room.Shopping



class HomeAdapter(
    var items:List<Shopping>,
    val viewModel: HomeViewModel
): RecyclerView.Adapter<HomeAdapter.adapterVH>() {
    class adapterVH(itemView: View): RecyclerView.ViewHolder(itemView) {
        val binding =ShoppingListRawBinding.bind(itemView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapterVH {
        val inflater= LayoutInflater.from(parent.context)
        val viewHolder=inflater.inflate(R.layout.shopping_list_raw,parent,false)
        return adapterVH(viewHolder)
    }

    override fun onBindViewHolder(holder: adapterVH, position: Int) {

        val inShop=items[position]
        holder.binding.itemShop.text=inShop.shopItem
        holder.binding.counter.text="${inShop.count}"
        holder.binding.minus.setOnClickListener{
            if (inShop.count>10){
                inShop.count--
                viewModel.upsert(inShop)
            }
        }
        holder.binding.plus.setOnClickListener {
            inShop.count++
            viewModel.upsert(inShop)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
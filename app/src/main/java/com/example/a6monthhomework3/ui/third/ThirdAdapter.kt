package com.example.a6monthhomework3.ui.third

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a6monthhomework3.CountModel
import com.example.a6monthhomework3.databinding.ItemHistoryBinding

class ThirdAdapter : RecyclerView.Adapter<ThirdAdapter.ThirdViewHolder>() {
    private var model = arrayListOf<CountModel>()

    inner class ThirdViewHolder(private var binding :ItemHistoryBinding) :RecyclerView.ViewHolder(binding.root){
        fun bind(countModel: CountModel) {
            binding.text.text = countModel.result.toString()

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ThirdViewHolder {
        return ThirdViewHolder(ItemHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ThirdViewHolder, position: Int) {
        holder.bind(model[position])
    }

    override fun getItemCount(): Int {
        return model.size
    }
}
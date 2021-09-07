package ru.iqmafia.iqmafiaandroidapp.judge.screens.stats

import android.content.Context
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.RecyclerView
import ru.iqmafia.iqmafiaandroidapp.R
import ru.iqmafia.iqmafiaandroidapp.judge.models.CurrentGamePlayerModel

class StatsCurrentGameAdapter : RecyclerView.Adapter<StatsCurrentGameAdapter.SCGViewHolder>() {

    private val mStatsFragment = StatsFragment()
    private lateinit var mContext: Context
    private var mListCurrentGamePlayerModel = emptyList<CurrentGamePlayerModel>()

    class SCGViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val slotText: TextView = view.findViewById(R.id.current_game_slot_text)
        val nameText: TextView = view.findViewById(R.id.current_game_name_text)
        val cardText: TextView = view.findViewById(R.id.current_game_card_text)
        val winText: TextView = view.findViewById(R.id.current_game_win_text)
        val rating: TextView = view.findViewById(R.id.current_game_rating_text)
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SCGViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.stats_current_game_item, parent, false)
        return SCGViewHolder(view)
    }

    override fun onBindViewHolder(holder: SCGViewHolder, position: Int) {
        mContext = holder.cardText.context

        holder.nameText.text = mListCurrentGamePlayerModel[position].name

        holder.cardText.text = mListCurrentGamePlayerModel[position].card
        holder.cardText.background = when (mListCurrentGamePlayerModel[position].card) {
            "bl" -> AppCompatResources.getDrawable(mContext, R.drawable.my_border_grey)
            "dn" -> AppCompatResources.getDrawable(mContext, R.drawable.my_border_darkgrey)
            "rd" -> AppCompatResources.getDrawable(mContext, R.drawable.my_border_red)
            "sh" -> AppCompatResources.getDrawable(mContext, R.drawable.my_border_yellow)
            else -> AppCompatResources.getDrawable(mContext, R.drawable.my_border_white)
        }

        holder.slotText.text = mListCurrentGamePlayerModel[position].slot.toString()
        holder.slotText.background = when (mListCurrentGamePlayerModel[position].card) {
            "bl" -> AppCompatResources.getDrawable(mContext, R.drawable.my_border_grey)
            "dn" -> AppCompatResources.getDrawable(mContext, R.drawable.my_border_darkgrey)
            "rd" -> AppCompatResources.getDrawable(mContext, R.drawable.my_border_red)
            "sh" -> AppCompatResources.getDrawable(mContext, R.drawable.my_border_yellow)
            else -> AppCompatResources.getDrawable(mContext, R.drawable.my_border_white)
        }

        holder.winText.text = mListCurrentGamePlayerModel[position].win
        holder.winText.background = when (mListCurrentGamePlayerModel[position].win) {
            "win" -> AppCompatResources.getDrawable(mContext, R.drawable.my_boder_white_in_red)
            else -> AppCompatResources.getDrawable(mContext, R.drawable.my_border_white)
        }

        holder.rating.text = mListCurrentGamePlayerModel[position].rating.toString()
        holder.rating.background = when (mListCurrentGamePlayerModel[position].win) {
            "win" -> AppCompatResources.getDrawable(mContext, R.drawable.my_boder_white_in_red)
            else -> AppCompatResources.getDrawable(mContext, R.drawable.my_border_white)
        }

    //TODO:: text listener
//        holder.rating.addTextChangedListener(beforeTextChanged = , onTextChanged = ,afterTextChanged = )

    }

    override fun getItemCount(): Int = mListCurrentGamePlayerModel.size


    override fun onViewAttachedToWindow(holder: SCGViewHolder) {
        super.onViewAttachedToWindow(holder)
        holder.itemView.setOnClickListener {
            mStatsFragment.popupClick(mListCurrentGamePlayerModel[holder.adapterPosition])
        }
    }

    override fun onViewDetachedFromWindow(holder: SCGViewHolder) {
        holder.itemView.setOnClickListener(null)
        super.onViewDetachedFromWindow(holder)
    }


    fun setList(list: List<CurrentGamePlayerModel>) {
        mListCurrentGamePlayerModel = list
        notifyDataSetChanged()
    }
}
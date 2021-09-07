package ru.iqmafia.iqmafiaandroidapp.judge.screens.stats

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.iqmafia.iqmafiaandroidapp.databinding.FragmentStatsBinding
import ru.iqmafia.iqmafiaandroidapp.judge.JudgeActivity
import ru.iqmafia.iqmafiaandroidapp.judge.models.CurrentGamePlayerModel

class StatsFragment : Fragment() {


    //TODO:: VK MUSIC

    private var _mBinding: FragmentStatsBinding? = null
    private val mBinding get() = _mBinding!!

    private lateinit var mRecyclerView: RecyclerView
    private lateinit var mCurrentGameAdapter: StatsCurrentGameAdapter
    private lateinit var mObserverList: Observer<List<CurrentGamePlayerModel>>

    private lateinit var mStatsFragmentViewModel: StatsFragmentViewModel
    private lateinit var mJudgeActivity: JudgeActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is JudgeActivity) {
            mJudgeActivity = context as JudgeActivity
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _mBinding = FragmentStatsBinding.inflate(layoutInflater)

        mCurrentGameAdapter = StatsCurrentGameAdapter()
        mRecyclerView = mBinding.statsRecycler
        mRecyclerView.adapter = mCurrentGameAdapter


        mStatsFragmentViewModel = ViewModelProvider(mJudgeActivity).get(StatsFragmentViewModel::class.java)

        return mBinding.root
    }

    override fun onResume() {
        super.onResume()

        mObserverList = Observer {
            val list = it
            mCurrentGameAdapter.setList(list)
        }
        mStatsFragmentViewModel.listCurrentGamePlayerModel.observe(this, mObserverList)
    }

    fun popupClick(player: CurrentGamePlayerModel) {
        val playerBundle = Bundle()
        playerBundle.putSerializable("selectedPlayer", player)

        //TODO::
//        val popupLayout = layoutInflater.inflate(R.layout.stats_player_customise_popup, null)
//        val popupWindow = PopupWindow(popupLayout,
//        LinearLayout.LayoutParams.WRAP_CONTENT,
//        LinearLayout.LayoutParams.WRAP_CONTENT)
//
//        val popupView = popupWindow.contentView
//
//        TransitionManager.beginDelayedTransition(stats_fragment_root)
//        popupWindow.showAtLocation(stats_fragment_root, Gravity.CENTER, 0, 0)
    }

    override fun onDestroy() {
        _mBinding = null
        mStatsFragmentViewModel.listCurrentGamePlayerModel.removeObserver(mObserverList)
        mRecyclerView.adapter = null
        super.onDestroy()
    }



    companion object {
        @JvmStatic
        fun newInstance() = StatsFragment()
    }


}
package ru.iqmafia.iqmafiaandroidapp.judge.screens.night

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.transition.TransitionManager
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.iqmafia.iqmafiaandroidapp.R
import ru.iqmafia.iqmafiaandroidapp.databinding.FragmentNightBinding
import ru.iqmafia.iqmafiaandroidapp.judge.JudgeActivity
import ru.iqmafia.iqmafiaandroidapp.judge.fragments.falls.FallsViewModel
import ru.iqmafia.iqmafiaandroidapp.judge.fragments.vote.VoteViewModel
import ru.iqmafia.iqmafiaandroidapp.judge.screeens.night.NightViewModel
import ru.iqmafia.iqmafiaandroidapp.judge.screens.stats.StatsViewModel


class NightFragment : Fragment() {

    private var _mBinding: FragmentNightBinding? = null
    private val mBinding get() = _mBinding!!

    private lateinit var mVoteViewModel: VoteViewModel
    private lateinit var mFallsViewModel: FallsViewModel
    private lateinit var mNightViewModel: NightViewModel
    private lateinit var mStatsViewModel: StatsViewModel

    private lateinit var mJudgeActivity: JudgeActivity


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is JudgeActivity) {
            mJudgeActivity = context
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _mBinding = FragmentNightBinding.inflate(layoutInflater)
        mVoteViewModel = ViewModelProvider(mJudgeActivity).get(VoteViewModel::class.java)
        mFallsViewModel = ViewModelProvider(mJudgeActivity).get(FallsViewModel::class.java)
        mNightViewModel = ViewModelProvider(mJudgeActivity).get(NightViewModel::class.java)
        mStatsViewModel = ViewModelProvider(mJudgeActivity).get(StatsViewModel::class.java)

        //BEST MOVE
        val mBestMoveStringObserver = Observer<String> { mBinding.nightBestmoveButton.text = it }
        mVoteViewModel.mBestMoveTextString.observe(viewLifecycleOwner, mBestMoveStringObserver)
        val mBestMoveDrawableObserver =
            Observer<Drawable> { mBinding.nightBestmoveButton.background = it }
        mVoteViewModel.mBestMoveButtonDrawable.observe(viewLifecycleOwner, mBestMoveDrawableObserver)


        mBinding.nightBestmoveButton.setOnClickListener {
            mVoteViewModel.bestMove()
        }

        mBinding.nightBestmoveButton.setOnLongClickListener(View.OnLongClickListener {
            mVoteViewModel.resetBestMove()
            true
        })


        //GAME END
        mBinding.nightRedwinButton.setOnClickListener {
            mNightViewModel.setWinner("rd")
            popupCall()
        }

        mBinding.nightBlackwinButton.setOnClickListener {
            mNightViewModel.setWinner("bl")
            popupCall()
        }

        //START NEW GAME INIT ALL
        mBinding.nightStartNewGameButton.setOnClickListener {
            val mPopupLayout = layoutInflater.inflate(R.layout.game_reset_popup, null)
            val mPopupWindow = PopupWindow(
                mPopupLayout,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            val mPopupView = mPopupWindow.contentView

            TransitionManager.beginDelayedTransition(mBinding.nightFragmentRoot)
            mPopupWindow.showAtLocation(mBinding.nightFragmentRoot, Gravity.CENTER, 0, 0)

            val mYesButton: Button = mPopupView.findViewById(R.id.game_reset_popup_yes_button)
            val mNoButton: Button = mPopupView.findViewById(R.id.game_reset_popup_no_button)

            mYesButton.setOnClickListener {
                mNightViewModel.resetNames()
                mVoteViewModel.resetThisShit()
                mVoteViewModel.resetBestMove()
                mFallsViewModel.resetThisShit()
                mNightViewModel.resetFlags()


                mPopupWindow.dismiss()
            }
            mNoButton.setOnClickListener { mPopupWindow.dismiss() }
        }

        return mBinding.root
    }


    private fun popupCall() {
        val popupLayout = layoutInflater.inflate(R.layout.game_end_popup, null)
        val popupWindow = PopupWindow(
            popupLayout,
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        val popupView = popupWindow.contentView

        TransitionManager.beginDelayedTransition(mBinding.nightFragmentRoot)
        popupWindow.showAtLocation(mBinding.nightFragmentRoot, Gravity.CENTER, 0, 0)

        //SELECT BLACK BUTTONS
        val mSelectBlack1Button: Button = popupView.findViewById(R.id.gep_select_black_1_button)
        val mSelectBlack2Button: Button = popupView.findViewById(R.id.gep_select_black_2_button)
        val mSelectBlack3Button: Button = popupView.findViewById(R.id.gep_select_black_3_button)
        val mSelectBlack4Button: Button = popupView.findViewById(R.id.gep_select_black_4_button)
        val mSelectBlack5Button: Button = popupView.findViewById(R.id.gep_select_black_5_button)
        val mSelectBlack6Button: Button = popupView.findViewById(R.id.gep_select_black_6_button)
        val mSelectBlack7Button: Button = popupView.findViewById(R.id.gep_select_black_7_button)
        val mSelectBlack8Button: Button = popupView.findViewById(R.id.gep_select_black_8_button)
        val mSelectBlack9Button: Button = popupView.findViewById(R.id.gep_select_black_9_button)
        val mSelectBlack10Button: Button = popupView.findViewById(R.id.gep_select_black_10_button)


        //SELECT DON BUTTONS
        val mSelectDon1Button: Button = popupView.findViewById(R.id.gep_select_don_1_button)
        val mSelectDon2Button: Button = popupView.findViewById(R.id.gep_select_don_2_button)
        val mSelectDon3Button: Button = popupView.findViewById(R.id.gep_select_don_3_button)
        val mSelectDon4Button: Button = popupView.findViewById(R.id.gep_select_don_4_button)
        val mSelectDon5Button: Button = popupView.findViewById(R.id.gep_select_don_5_button)
        val mSelectDon6Button: Button = popupView.findViewById(R.id.gep_select_don_6_button)
        val mSelectDon7Button: Button = popupView.findViewById(R.id.gep_select_don_7_button)
        val mSelectDon8Button: Button = popupView.findViewById(R.id.gep_select_don_8_button)
        val mSelectDon9Button: Button = popupView.findViewById(R.id.gep_select_don_9_button)
        val mSelectDon10Button: Button = popupView.findViewById(R.id.gep_select_don_10_button)

        //SELECT SHERIFF BUTTONS
        val mSelectSher1Button: Button = popupView.findViewById(R.id.gep_select_sher_1_button)
        val mSelectSher2Button: Button = popupView.findViewById(R.id.gep_select_sher_2_button)
        val mSelectSher3Button: Button = popupView.findViewById(R.id.gep_select_sher_3_button)
        val mSelectSher4Button: Button = popupView.findViewById(R.id.gep_select_sher_4_button)
        val mSelectSher5Button: Button = popupView.findViewById(R.id.gep_select_sher_5_button)
        val mSelectSher6Button: Button = popupView.findViewById(R.id.gep_select_sher_6_button)
        val mSelectSher7Button: Button = popupView.findViewById(R.id.gep_select_sher_7_button)
        val mSelectSher8Button: Button = popupView.findViewById(R.id.gep_select_sher_8_button)
        val mSelectSher9Button: Button = popupView.findViewById(R.id.gep_select_sher_9_button)
        val mSelectSher10Button: Button = popupView.findViewById(R.id.gep_select_sher_10_button)

        //CONFIRM CHOOSE
        val mConfirmButton: Button = popupView.findViewById(R.id.gep_confirm_button)


        //TODO: назначить слушатели кнопкам (переключение флагов или генерирование листов)

        //TODO:: НАЗНАЧИТЬ ПЕРЕКЛЮЧЕНИЕ BACKGROUND КНОПКАМ

        //END GAME POPUP LOGIC

        //BLACK TEAM


        mSelectBlack1Button.setOnClickListener {
            if (!mNightViewModel.flagBlack1Button) {
                    mNightViewModel.flagBlack1Button = true
                    mSelectBlack1Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_black)
                } else {
                    mNightViewModel.flagBlack1Button = false
                    mSelectBlack1Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            mNightViewModel.setCardToBlack("1")
        }


        mSelectBlack2Button.setOnClickListener {
            if (!mNightViewModel.flagBlack2Button) {
                    mNightViewModel.flagBlack2Button = true
                    mSelectBlack2Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_black)
                }
                else {
                    mNightViewModel.flagBlack2Button = false
                    mSelectBlack2Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            mNightViewModel.setCardToBlack("2")
        }


        mSelectBlack3Button.setOnClickListener {
            if (!mNightViewModel.flagBlack3Button) {

                mNightViewModel.flagBlack3Button = true
                mSelectBlack3Button.background =
                    AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_black)
            } else {
                    mNightViewModel.flagBlack3Button = false
                    mSelectBlack3Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            mNightViewModel.setCardToBlack("3")
        }


        mSelectBlack4Button.setOnClickListener {
            if (!mNightViewModel.flagBlack4Button) {
                    mNightViewModel.flagBlack4Button = true
                    mSelectBlack4Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_black)
                } else {
                    mNightViewModel.flagBlack4Button = false
                    mSelectBlack4Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            mNightViewModel.setCardToBlack("4")
        }


        mSelectBlack5Button.setOnClickListener {
            if (!mNightViewModel.flagBlack5Button) {
                    mNightViewModel.flagBlack5Button = true
                    mSelectBlack5Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_black)
                } else {
                    mNightViewModel.flagBlack5Button = false
                    mSelectBlack5Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            mNightViewModel.setCardToBlack("5")
        }


        mSelectBlack6Button.setOnClickListener {
            if (!mNightViewModel.flagBlack6Button) {
                    mNightViewModel.flagBlack6Button = true
                    mSelectBlack6Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_black)
                } else {
                    mNightViewModel.flagBlack6Button = false
                    mSelectBlack6Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            mNightViewModel.setCardToBlack("6")
        }


        mSelectBlack7Button.setOnClickListener {
            if (!mNightViewModel.flagBlack7Button) {
                    mNightViewModel.flagBlack7Button = true
                    mSelectBlack7Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_black)
                } else {
                    mNightViewModel.flagBlack7Button = false
                    mSelectBlack7Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            mNightViewModel.setCardToBlack("7")
        }


        mSelectBlack8Button.setOnClickListener {
            if (!mNightViewModel.flagBlack8Button) {
                    mNightViewModel.flagBlack8Button = true
                    mSelectBlack8Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_black)
                } else {
                    mNightViewModel.flagBlack8Button = false
                    mSelectBlack8Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            mNightViewModel.setCardToBlack("8")
        }


        mSelectBlack9Button.setOnClickListener {
            if (!mNightViewModel.flagBlack9Button) {
                    mNightViewModel.flagBlack9Button = true
                    mSelectBlack9Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_black)
                } else {
                    mNightViewModel.flagBlack9Button = false
                    mSelectBlack9Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            mNightViewModel.setCardToBlack("9")
        }


        mSelectBlack10Button.setOnClickListener {
            if (!mNightViewModel.flagBlack10Button) {
                    mNightViewModel.flagBlack10Button = true
                    mSelectBlack10Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_black)
                } else {
                    mNightViewModel.flagBlack10Button = false
                    mSelectBlack10Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            mNightViewModel.setCardToBlack("10")
        }


        //DON
        val noOneIsDon =
            (!mNightViewModel.flagDon1Button && !mNightViewModel.flagDon2Button &&
                    !mNightViewModel.flagDon3Button && !mNightViewModel.flagDon4Button && !mNightViewModel.flagDon5Button &&
                    !mNightViewModel.flagDon6Button && !mNightViewModel.flagDon7Button && !mNightViewModel.flagDon8Button &&
                    !mNightViewModel.flagDon9Button && !mNightViewModel.flagDon10Button)

        mSelectDon1Button.setOnClickListener {
            when (mNightViewModel.flagDon1Button) {
                false -> {
                    if (noOneIsDon) {
                        mNightViewModel.flagDon1Button = true
                        mSelectDon1Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagDon1Button = false
                    mSelectDon1Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToDon("1")
        }

        mSelectDon2Button.setOnClickListener {
            when (mNightViewModel.flagDon2Button) {
                false -> {
                    if (noOneIsDon) {
                        mNightViewModel.flagDon2Button = true
                        mSelectDon2Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagDon2Button = false
                    mSelectDon2Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToDon("2")
        }

        mSelectDon3Button.setOnClickListener {
            when (mNightViewModel.flagDon3Button) {
                false -> {
                    if (noOneIsDon) {
                        mNightViewModel.flagDon3Button = true
                        mSelectDon3Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagDon3Button = false
                    mSelectDon3Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToDon("3")
        }

        mSelectDon4Button.setOnClickListener {
            when (mNightViewModel.flagDon4Button) {
                false -> {
                    if (noOneIsDon) {
                        mNightViewModel.flagDon4Button = true
                        mSelectDon4Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagDon4Button = false
                    mSelectDon4Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToDon("4")
        }

        mSelectDon5Button.setOnClickListener {
            when (mNightViewModel.flagDon5Button) {
                false -> {
                    if (noOneIsDon) {
                        mNightViewModel.flagDon5Button = true
                        mSelectDon5Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagDon5Button = false
                    mSelectDon5Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToDon("5")
        }

        mSelectDon6Button.setOnClickListener {
            when (mNightViewModel.flagDon6Button) {
                false -> {
                    if (noOneIsDon) {
                        mNightViewModel.flagDon6Button = true
                        mSelectDon6Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagDon6Button = false
                    mSelectDon6Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToDon("6")
        }

        mSelectDon7Button.setOnClickListener {
            when (mNightViewModel.flagDon7Button) {
                false -> {
                    if (noOneIsDon) {
                        mNightViewModel.flagDon7Button = true
                        mSelectDon7Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagDon7Button = false
                    mSelectDon7Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToDon("7")
        }

        mSelectDon8Button.setOnClickListener {
            when (mNightViewModel.flagDon8Button) {
                false -> {
                    if (noOneIsDon) {
                        mNightViewModel.flagDon8Button = true
                        mSelectDon8Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagDon8Button = false
                    mSelectDon8Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToDon("8")
        }

        mSelectDon9Button.setOnClickListener {
            when (mNightViewModel.flagDon9Button) {
                false -> {
                    if (noOneIsDon) {
                        mNightViewModel.flagDon9Button = true
                        mSelectDon9Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagDon9Button = false
                    mSelectDon9Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToDon("9")
        }

        mSelectDon10Button.setOnClickListener {
            when (mNightViewModel.flagDon10Button) {
                false -> {
                    if (noOneIsDon) {
                        mNightViewModel.flagDon10Button = true
                        mSelectDon10Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagDon10Button = false
                    mSelectDon10Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToDon("10")
        }


        //SHERIFF
        val noOneIsSher: Boolean =
            (!mNightViewModel.flagSher1Button && !mNightViewModel.flagSher2Button && !mNightViewModel.flagSher3Button && !mNightViewModel.flagSher4Button && !mNightViewModel.flagSher5Button && !mNightViewModel.flagSher6Button && !mNightViewModel.flagSher7Button && !mNightViewModel.flagSher8Button && !mNightViewModel.flagSher9Button && !mNightViewModel.flagSher10Button)

        mSelectSher1Button.setOnClickListener {
            when (mNightViewModel.flagSher1Button) {
                false -> {
                    if (noOneIsSher) {
                        mNightViewModel.flagSher1Button = true
                        mSelectSher1Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagSher1Button = false
                    mSelectSher1Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToSher("1")
        }

        mSelectSher2Button.setOnClickListener {
            when (mNightViewModel.flagSher2Button) {
                false -> {
                    if (noOneIsSher) {
                        mNightViewModel.flagSher2Button = true
                        mSelectSher2Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagSher2Button = false
                    mSelectSher2Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToSher("2")
        }

        mSelectSher3Button.setOnClickListener {
            when (mNightViewModel.flagSher3Button) {
                false -> {
                    if (noOneIsSher) {
                        mNightViewModel.flagSher3Button = true
                        mSelectSher3Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagSher3Button = false
                    mSelectSher3Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToSher("3")
        }

        mSelectSher4Button.setOnClickListener {
            when (mNightViewModel.flagSher4Button) {
                false -> {
                    if (noOneIsSher) {
                        mNightViewModel.flagSher4Button = true
                        mSelectSher4Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagSher4Button = false
                    mSelectSher4Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToSher("4")
        }

        mSelectSher5Button.setOnClickListener {
            when (mNightViewModel.flagSher5Button) {
                false -> {
                    if (noOneIsSher) {
                        mNightViewModel.flagSher5Button = true
                        mSelectSher5Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagSher5Button = false
                    mSelectSher5Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToSher("5")
        }

        mSelectSher6Button.setOnClickListener {
            when (mNightViewModel.flagSher6Button) {
                false -> {
                    if (noOneIsSher) {
                        mNightViewModel.flagSher6Button = true
                        mSelectSher6Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagSher6Button = false
                    mSelectSher6Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToSher("6")
        }

        mSelectSher7Button.setOnClickListener {
            when (mNightViewModel.flagSher7Button) {
                false -> {
                    if (noOneIsSher) {
                        mNightViewModel.flagSher7Button = true
                        mSelectSher7Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagSher7Button = false
                    mSelectSher7Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToSher("7")
        }

        mSelectSher8Button.setOnClickListener {
            when (mNightViewModel.flagSher8Button) {
                false -> {
                    if (noOneIsSher) {
                        mNightViewModel.flagSher8Button = true
                        mSelectSher8Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagSher8Button = false
                    mSelectSher8Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToSher("8")
        }

        mSelectSher9Button.setOnClickListener {
            when (mNightViewModel.flagSher9Button) {
                false -> {
                    if (noOneIsSher) {
                        mNightViewModel.flagSher9Button = true
                        mSelectSher9Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagSher9Button = false
                    mSelectSher9Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToSher("9")
        }

        mSelectSher10Button.setOnClickListener {
            when (mNightViewModel.flagSher10Button) {
                false -> {
                    if (noOneIsSher) {
                        mNightViewModel.flagSher10Button = true
                        mSelectSher10Button.background =
                            AppCompatResources.getDrawable(
                                mJudgeActivity,
                                R.drawable.my_border_black
                            )
                    }
                }
                true -> {
                    mNightViewModel.flagSher10Button = false
                    mSelectSher10Button.background =
                        AppCompatResources.getDrawable(mJudgeActivity, R.drawable.my_border_white)
                }
            }
            mNightViewModel.setCardToSher("10")
        }


        //CONFIRM
        mConfirmButton.setOnClickListener {

            if (!mNightViewModel.name1String.value.isNullOrEmpty()
                && !mNightViewModel.name2String.value.isNullOrEmpty() &&
                !mNightViewModel.name3String.value.isNullOrEmpty() && !mNightViewModel.name4String.value.isNullOrEmpty() &&
                !mNightViewModel.name5String.value.isNullOrEmpty() && !mNightViewModel.name6String.value.isNullOrEmpty() &&
                !mNightViewModel.name7String.value.isNullOrEmpty() && !mNightViewModel.name8String.value.isNullOrEmpty() &&
                !mNightViewModel.name9String.value.isNullOrEmpty() && !mNightViewModel.name10String.value.isNullOrEmpty()
            ) {
                //TODO: создание модели игры
                mNightViewModel.setTeam()
                mNightViewModel.setRating()


                mNightViewModel.insert10Players()
                popupWindow.dismiss()


            } else {
                Toast.makeText(
                    mJudgeActivity,
                    "Set Players Names and do it again!",
                    Toast.LENGTH_LONG
                ).show()
                popupWindow.dismiss()
            }
        }
    }

    override fun onDestroy() {
        _mBinding = null
        super.onDestroy()
    }

    companion object {
        @JvmStatic
        fun newInstance() = NightFragment()
    }
}
package ru.iqmafia.iqmafiaandroidapp.judge.screens.slot

import android.os.Bundle
import android.transition.TransitionManager
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupWindow
import ru.iqmafia.iqmafiaandroidapp.R
import ru.iqmafia.iqmafiaandroidapp.databinding.FragmentSlotBinding
import ru.iqmafia.iqmafiaandroidapp.judge.utils.Randomizer

class SlotFragment : Fragment() {

    private var _mBinding: FragmentSlotBinding? = null
    private val mBinding get() = _mBinding!!
    private var mSlotIsRandomedBool: Boolean = true
    private var mSlotNumbersArray: Array<String> =
        arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    private var mCountArrayInt = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _mBinding = FragmentSlotBinding.inflate(layoutInflater)


        Randomizer().shuffle(mSlotNumbersArray)

        if (savedInstanceState != null) {
            mSlotIsRandomedBool = savedInstanceState.getBoolean("randomisedBool")
            mSlotNumbersArray = savedInstanceState.getStringArray("numbersArray") as Array<String>
            mCountArrayInt = savedInstanceState.getInt("countInt")

            if (mCountArrayInt < 10) {
                if (!mSlotIsRandomedBool) {
                    mBinding.slotRandomizerButton.setTextSize(170f)
                    mBinding.slotRandomizerButton.setText(mSlotNumbersArray[mCountArrayInt - 1])

                } else {
                    mBinding.slotRandomizerButton.setText(R.string.q)
                }
            } else {
                mBinding.slotRandomizerButton.setTextSize(30f)
                mBinding.slotRandomizerButton.setText(R.string.reset)
            }
        }


        mBinding.slotRandomizerButton.setOnClickListener {
            SlotRandomise()
        }

        mBinding.slotRandomizerButton.setOnLongClickListener(View.OnLongClickListener
        {
            val mPopupLayout = layoutInflater.inflate(R.layout.slot_reset_popup, null)
            val mPopupWindow = PopupWindow(
                mPopupLayout,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            val mPopupView: View = mPopupWindow.contentView
            val mYesButton = mPopupView.findViewById<Button>(R.id.slot_popup_yes_button)
            val mNoButton = mPopupView.findViewById<Button>(R.id.slot_popup_no_button)

            TransitionManager.beginDelayedTransition(mBinding.slotFragmentRoot)
            mPopupWindow.showAtLocation(mBinding.slotFragmentRoot, Gravity.CENTER, 0, 0)

            mYesButton.setOnClickListener {
                ResetOfRandom()
                mPopupWindow.dismiss()
            }
            mNoButton.setOnClickListener {
                mPopupWindow.dismiss()
            }


            true
        })

        return mBinding.root
    }


    //RESET SLOT FRAGMENT
    private fun ResetOfRandom() {
        mSlotIsRandomedBool = true
        mBinding.slotRandomizerButton.setText(R.string.get_slot)
        Randomizer().shuffle(mSlotNumbersArray)
        mCountArrayInt = 0
        mBinding.slotRandomizerButton.setTextSize(100f)
    }

    //SHOW SLOT NUMBERS
    private fun SlotRandomise() {
        if (mCountArrayInt < 10) {
            if (mSlotIsRandomedBool) {
                mBinding.slotRandomizerButton.setTextSize(170f)
                mBinding.slotRandomizerButton.setText(mSlotNumbersArray[mCountArrayInt])

                mCountArrayInt++
                mSlotIsRandomedBool = false

            } else {
                mSlotIsRandomedBool = true
                mBinding.slotRandomizerButton.setText(R.string.q)
            }

        } else {
            mBinding.slotRandomizerButton.setTextSize(30f)
            mBinding.slotRandomizerButton.setText(R.string.reset)
        }
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putBoolean("randomisedBool", mSlotIsRandomedBool)
        outState.putStringArray("numbersArray", mSlotNumbersArray)
        outState.putInt("countInt", mCountArrayInt)
    }


    override fun onDestroy() {
        _mBinding = null
        super.onDestroy()
    }


    companion object {

        fun newInstance() = SlotFragment()
    }
}
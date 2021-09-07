package ru.iqmafia.iqmafiaandroidapp.judge.screens.card

import android.os.Bundle
import android.transition.TransitionManager
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.fragment.app.Fragment
import ru.iqmafia.iqmafiaandroidapp.R
import ru.iqmafia.iqmafiaandroidapp.databinding.FragmentCardBinding
import ru.iqmafia.iqmafiaandroidapp.judge.utils.Randomizer


class CardFragment : Fragment() {

    private var _mBinding: FragmentCardBinding? = null
    private val mBinding get() = _mBinding!!

    //CLICK FLAG
    private var mCardIsRandomedBool = true

    //1 - black, 2 - red, 3 - sheriff, 4 - don
    private var mCardsArray =
        arrayOf("rd", "rd", "rd", "rd", "rd", "rd", "bl", "bl", "sh", "dn")

    //array to synrhronise with TableOfPlayers
    private val mCardRandomiseCompleteArray = arrayOf("", "", "", "", "", "", "", "", "", "")

    //inflate the button UI
    private var mValueToImageString = ""

    private var mCountArrayInt = 0


    //POPUP
    private lateinit var mPopupLayout: View
    private lateinit var mPopupWindow: PopupWindow


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _mBinding = FragmentCardBinding.inflate(layoutInflater)


        //RESET POPUP
        mPopupLayout = layoutInflater.inflate(R.layout.card_reset_popup, null)
        mPopupWindow = PopupWindow(
            mPopupLayout,
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        val mPopupView: View = mPopupWindow.contentView
        val mYesButton = mPopupView.findViewById<Button>(R.id.card_popup_yes_button)
        val mNoButton = mPopupView.findViewById<Button>(R.id.card_popup_no_button)



        Randomizer().shuffle(mCardsArray)

        mBinding.cardRandomiserButton.setOnClickListener { cardRandomClick() }

        mBinding.cardRandomiserButton.setOnLongClickListener(View.OnLongClickListener {

            TransitionManager.beginDelayedTransition(mBinding.cardFragmentRoot)
            mPopupWindow.showAtLocation(mBinding.cardFragmentRoot, Gravity.CENTER, 0, 0)

            true
        })


        mYesButton.setOnClickListener {
            cardRandomReset()
            mPopupWindow.dismiss()
        }

        mNoButton.setOnClickListener { mPopupWindow.dismiss() }


        //TODO:: 10 номеров карт из массива

        return mBinding.root
    }

    private fun cardRandomClick() {

        if (mCountArrayInt < 10) {
            if (mCardIsRandomedBool) {
                mCardIsRandomedBool = false
                mValueToImageString = mCardsArray[mCountArrayInt]
                mCardRandomiseCompleteArray[mCountArrayInt] = mValueToImageString

                setCardImageToButton()

                mCountArrayInt++
            } else {
                mCardIsRandomedBool = true
                mValueToImageString = "?"
                setCardImageToButton()
            }
        } else {
            mBinding.cardRandomiserButton.setTextSize(25f)
            mBinding.cardRandomiserButton.setBackgroundResource(R.color.colorCoolBlue)
            mBinding.cardRandomiserButton.setTextColor(resources.getColor(android.R.color.black))
            mBinding.cardRandomiserButton.setText(
                "Long Press\n (Key Vol Down)\n to Reset\n" +
                        "\n1 = ${mCardRandomiseCompleteArray[0]}" +
                        "\n2 = ${mCardRandomiseCompleteArray[1]}" +
                        "\n3 = ${mCardRandomiseCompleteArray[2]}" +
                        "\n4 = ${mCardRandomiseCompleteArray[3]}" +
                        "\n5 = ${mCardRandomiseCompleteArray[4]}" +
                        "\n6 = ${mCardRandomiseCompleteArray[5]}" +
                        "\n7 = ${mCardRandomiseCompleteArray[6]}" +
                        "\n8 = ${mCardRandomiseCompleteArray[7]}" +
                        "\n9 = ${mCardRandomiseCompleteArray[8]}" +
                        "\n10 = ${mCardRandomiseCompleteArray[9]}"
            )
        }
    }


    fun setCardImageToButton() {
        when (mValueToImageString) {
            "bl" -> {
                mBinding.cardRandomiserButton.setText("")
                mBinding.cardRandomiserButton.setBackgroundResource(R.color.colorCoolBlack)
                mBinding.cardRandomiserButton.setTextColor(resources.getColor(android.R.color.black))
            }
            "rd" -> {
                mBinding.cardRandomiserButton.setText("")
                mBinding.cardRandomiserButton.setBackgroundResource(R.color.colorCoolRed)
                mBinding.cardRandomiserButton.setTextColor(resources.getColor(android.R.color.black))
            }
            "sh" -> {
                mBinding.cardRandomiserButton.setText("S")
                mBinding.cardRandomiserButton.setTextSize(260f)
                mBinding.cardRandomiserButton.setBackgroundResource(R.color.colorCoolRed)
                mBinding.cardRandomiserButton.setTextColor(resources.getColor(android.R.color.black))
            }
            "dn" -> {
                mBinding.cardRandomiserButton.setText("D")
                mBinding.cardRandomiserButton.setTextColor(resources.getColor(R.color.colorCoolRed))
                mBinding.cardRandomiserButton.setTextSize(260f)
                mBinding.cardRandomiserButton.setBackgroundResource(R.color.colorCoolBlack)
            }
            "?" -> {
                mBinding.cardRandomiserButton.setBackgroundResource(R.color.colorCoolBlue)
                mBinding.cardRandomiserButton.setTextSize(80f)
                mBinding.cardRandomiserButton.setText(R.string.choose_your_destiny)
                mBinding.cardRandomiserButton.setTextColor(resources.getColor(android.R.color.black))
            }
        }
    }


    private fun cardRandomReset() {
        mCardIsRandomedBool = true
        Randomizer().shuffle(mCardsArray)
        mCountArrayInt = 0
        mValueToImageString = "?"
        setCardImageToButton()
    }

    companion object {
        fun newInstance() = CardFragment()
    }
}
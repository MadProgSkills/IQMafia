package ru.iqmafia.iqmafiaandroidapp.judge.fragments.falls

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import ru.iqmafia.iqmafiaandroidapp.databinding.FragmentFallsBinding
import ru.iqmafia.iqmafiaandroidapp.judge.JudgeActivity

class FallsFragment : Fragment() {

    private var _mBinding: FragmentFallsBinding? = null
    private val mBinding get() = _mBinding!!

    private lateinit var mDrawable1Observer: Observer<Drawable>
    private lateinit var mDrawable2Observer: Observer<Drawable>
    private lateinit var mDrawable3Observer: Observer<Drawable>
    private lateinit var mDrawable4Observer: Observer<Drawable>
    private lateinit var mDrawable5Observer: Observer<Drawable>
    private lateinit var mDrawable6Observer: Observer<Drawable>
    private lateinit var mDrawable7Observer: Observer<Drawable>
    private lateinit var mDrawable8Observer: Observer<Drawable>
    private lateinit var mDrawable9Observer: Observer<Drawable>
    private lateinit var mDrawable10Observer: Observer<Drawable>

    private lateinit var mString1Observer: Observer<String>
    private lateinit var mString2Observer: Observer<String>
    private lateinit var mString3Observer: Observer<String>
    private lateinit var mString4Observer: Observer<String>
    private lateinit var mString5Observer: Observer<String>
    private lateinit var mString6Observer: Observer<String>
    private lateinit var mString7Observer: Observer<String>
    private lateinit var mString8Observer: Observer<String>
    private lateinit var mString9Observer: Observer<String>
    private lateinit var mString10Observer: Observer<String>


    private lateinit var mFallsViewModel: FallsViewModel

    private lateinit var mJudgeActivity: JudgeActivity


    // onAttach - присоединение фрагмента к родителю
    // присваивание переменной контекста родителя
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

        _mBinding = FragmentFallsBinding.inflate(layoutInflater)
        mFallsViewModel = ViewModelProvider(mJudgeActivity).get(FallsViewModel::class.java)


        //        FALLS BUTTONS
        //FALLS to players onClicks
        // 1
        mBinding.fallsPl1FallButton.setOnClickListener { mFallsViewModel.fall1OnClick() }
        mBinding.fallsPl1FallButton.setOnLongClickListener(View.OnLongClickListener {
            mFallsViewModel.fall1OnLongClick()
            true
        })
        // 2
        mBinding.fallsPl2FallButton.setOnClickListener { mFallsViewModel.fall2OnClick() }
        mBinding.fallsPl2FallButton.setOnLongClickListener(View.OnLongClickListener {
            mFallsViewModel.fall2OnLongClick()
            true
        })
        // 3
        mBinding.fallsPl3FallButton.setOnClickListener { mFallsViewModel.fall3OnClick() }
        mBinding.fallsPl3FallButton.setOnLongClickListener(View.OnLongClickListener {
            mFallsViewModel.fall3OnLongClick()
            true
        })
        // 4
        mBinding.fallsPl4FallButton.setOnClickListener { mFallsViewModel.fall4OnClick() }
        mBinding.fallsPl4FallButton.setOnLongClickListener(View.OnLongClickListener {
            mFallsViewModel.fall4OnLongClick()
            true
        })
        // 5
        mBinding.fallsPl5FallButton.setOnClickListener { mFallsViewModel.fall5OnClick() }
        mBinding.fallsPl5FallButton.setOnLongClickListener(View.OnLongClickListener {
            mFallsViewModel.fall5OnLongClick()
            true
        })
        // 6
        mBinding.fallsPl6FallButton.setOnClickListener { mFallsViewModel.fall6OnClick() }
        mBinding.fallsPl6FallButton.setOnLongClickListener(View.OnLongClickListener {
            mFallsViewModel.fall6OnLongClick()
            true
        })
        // 7
        mBinding.fallsPl7FallButton.setOnClickListener { mFallsViewModel.fall7OnClick() }
        mBinding.fallsPl7FallButton.setOnLongClickListener(View.OnLongClickListener {
            mFallsViewModel.fall7OnLongClick()
            true
        })
//        // 8
        mBinding.fallsPl8FallButton.setOnClickListener { mFallsViewModel.fall8OnClick() }
        mBinding.fallsPl8FallButton.setOnLongClickListener(View.OnLongClickListener {
            mFallsViewModel.fall8OnLongClick()
            true
        })
//        // 9
        mBinding.fallsPl9FallButton.setOnClickListener { mFallsViewModel.fall9OnClick() }
        mBinding.fallsPl9FallButton.setOnLongClickListener(View.OnLongClickListener {
            mFallsViewModel.fall9OnLongClick()
            true
        })
//        // 10
        mBinding.fallsPl10FallButton.setOnClickListener { mFallsViewModel.fall10OnClick() }
        mBinding.fallsPl10FallButton.setOnLongClickListener(View.OnLongClickListener {
            mFallsViewModel.fall10OnLongClick()
            true
        })


        //RESET CLICK
        mBinding.fallsLabelText.setOnClickListener { mFallsViewModel.resetThisShit() }


        //DRAWABLE OBSERVE
        mDrawable1Observer = Observer<Drawable> { mBinding.fallsPl1FallButton.background = it }
        mDrawable2Observer = Observer<Drawable> { mBinding.fallsPl2FallButton.background = it }
        mDrawable3Observer = Observer<Drawable> { mBinding.fallsPl3FallButton.background = it }
        mDrawable4Observer = Observer<Drawable> { mBinding.fallsPl4FallButton.background = it }
        mDrawable5Observer = Observer<Drawable> { mBinding.fallsPl5FallButton.background = it }
        mDrawable6Observer = Observer<Drawable> { mBinding.fallsPl6FallButton.background = it }
        mDrawable7Observer = Observer<Drawable> { mBinding.fallsPl7FallButton.background = it }
        mDrawable8Observer = Observer<Drawable> { mBinding.fallsPl8FallButton.background = it }
        mDrawable9Observer = Observer<Drawable> { mBinding.fallsPl9FallButton.background = it }
        mDrawable10Observer = Observer<Drawable> { mBinding.fallsPl10FallButton.background = it }

        mFallsViewModel.mButton1ResDrawable.observe(this, mDrawable1Observer)
        mFallsViewModel.mButton2ResDrawable.observe(this, mDrawable2Observer)
        mFallsViewModel.mButton3ResDrawable.observe(this, mDrawable3Observer)
        mFallsViewModel.mButton4ResDrawable.observe(this, mDrawable4Observer)
        mFallsViewModel.mButton5ResDrawable.observe(this, mDrawable5Observer)
        mFallsViewModel.mButton6ResDrawable.observe(this, mDrawable6Observer)
        mFallsViewModel.mButton7ResDrawable.observe(this, mDrawable7Observer)
        mFallsViewModel.mButton8ResDrawable.observe(this, mDrawable8Observer)
        mFallsViewModel.mButton9ResDrawable.observe(this, mDrawable9Observer)
        mFallsViewModel.mButton10ResDrawable.observe(this, mDrawable10Observer)


        //TEXT OBSERVE
        mString1Observer = Observer<String> { mBinding.fallsPl1FallButton.text = it }
        mString2Observer = Observer<String> { mBinding.fallsPl2FallButton.text = it }
        mString3Observer = Observer<String> { mBinding.fallsPl3FallButton.text = it }
        mString4Observer = Observer<String> { mBinding.fallsPl4FallButton.text = it }
        mString5Observer = Observer<String> { mBinding.fallsPl5FallButton.text = it }
        mString6Observer = Observer<String> { mBinding.fallsPl6FallButton.text = it }
        mString7Observer = Observer<String> { mBinding.fallsPl7FallButton.text = it }
        mString8Observer = Observer<String> { mBinding.fallsPl8FallButton.text = it }
        mString9Observer = Observer<String> { mBinding.fallsPl9FallButton.text = it }
        mString10Observer = Observer<String> { mBinding.fallsPl10FallButton.text = it }

        mFallsViewModel.mButton1TextString.observe(this,mString1Observer)
        mFallsViewModel.mButton2TextString.observe(this,mString2Observer)
        mFallsViewModel.mButton3TextString.observe(this,mString3Observer)
        mFallsViewModel.mButton4TextString.observe(this,mString4Observer)
        mFallsViewModel.mButton5TextString.observe(this,mString5Observer)
        mFallsViewModel.mButton6TextString.observe(this,mString6Observer)
        mFallsViewModel.mButton7TextString.observe(this,mString7Observer)
        mFallsViewModel.mButton8TextString.observe(this,mString8Observer)
        mFallsViewModel.mButton9TextString.observe(this,mString9Observer)
        mFallsViewModel.mButton10TextString.observe(this,mString10Observer)


        return mBinding.root
    }


    override fun onDestroy() {
        _mBinding = null
        super.onDestroy()
    }
}
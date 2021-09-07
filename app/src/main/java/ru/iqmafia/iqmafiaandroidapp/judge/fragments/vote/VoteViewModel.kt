package ru.iqmafia.iqmafiaandroidapp.judge.fragments.vote

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.appcompat.content.res.AppCompatResources
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.iqmafia.iqmafiaandroidapp.R

class VoteViewModel(application: Application) : AndroidViewModel(application) {


    //VOTING FLAGS
    private val _vote1PlayerBool = MutableLiveData<Boolean>()
    val vote1PlayerBool: LiveData<Boolean>
        get() = _vote1PlayerBool

    private val _vote2PlayerBool = MutableLiveData<Boolean>()
    val vote2PlayerBool: LiveData<Boolean>
        get() = _vote2PlayerBool

    private val _vote3PlayerBool = MutableLiveData<Boolean>()
    val vote3PlayerBool: LiveData<Boolean>
        get() = _vote3PlayerBool

    private val _vote4PlayerBool = MutableLiveData<Boolean>()
    val vote4PlayerBool: LiveData<Boolean>
        get() = _vote4PlayerBool

    private val _vote5PlayerBool = MutableLiveData<Boolean>()
    val vote5PlayerBool: LiveData<Boolean>
        get() = _vote5PlayerBool

    private val _vote6PlayerBool = MutableLiveData<Boolean>()
    val vote6PlayerBool: LiveData<Boolean>
        get() = _vote6PlayerBool

    private val _vote7PlayerBool = MutableLiveData<Boolean>()
    val vote7PlayerBool: LiveData<Boolean>
        get() = _vote7PlayerBool

    private val _vote8PlayerBool = MutableLiveData<Boolean>()
    val vote8PlayerBool: LiveData<Boolean>
        get() = _vote8PlayerBool

    private val _vote9PlayerBool = MutableLiveData<Boolean>()
    val vote9PlayerBool: LiveData<Boolean>
        get() = _vote9PlayerBool

    private val _vote10PlayerBool = MutableLiveData<Boolean>()
    val vote10PlayerBool: LiveData<Boolean>
        get() = _vote10PlayerBool


    //BACKGROUND RESOURCES
    private val _mButton1Drawable = MutableLiveData<Drawable>()
    val mButton1Drawable: LiveData<Drawable>
        get() = _mButton1Drawable

    private val _mButton2Drawable = MutableLiveData<Drawable>()
    val mButton2Drawable: LiveData<Drawable>
        get() = _mButton2Drawable

    private val _mButton3Drawable = MutableLiveData<Drawable>()
    val mButton3Drawable: LiveData<Drawable>
        get() = _mButton3Drawable

    private val _mButton4Drawable = MutableLiveData<Drawable>()
    val mButton4Drawable: LiveData<Drawable>
        get() = _mButton4Drawable

    private val _mButton5Drawable = MutableLiveData<Drawable>()
    val mButton5Drawable: LiveData<Drawable>
        get() = _mButton5Drawable

    private val _mButton6Drawable = MutableLiveData<Drawable>()
    val mButton6Drawable: LiveData<Drawable>
        get() = _mButton6Drawable

    private val _mButton7Drawable = MutableLiveData<Drawable>()
    val mButton7Drawable: LiveData<Drawable>
        get() = _mButton7Drawable

    private val _mButton8Drawable = MutableLiveData<Drawable>()
    val mButton8Drawable: LiveData<Drawable>
        get() = _mButton8Drawable

    private val _mButton9Drawable = MutableLiveData<Drawable>()
    val mButton9Drawable: LiveData<Drawable>
        get() = _mButton9Drawable

    private val _mButton10Drawable = MutableLiveData<Drawable>()
    val mButton10Drawable: LiveData<Drawable>
        get() = _mButton10Drawable


    //ARRAY VOTED PLAYERS
    private val _mVotedPlayersArray = MutableLiveData<ArrayList<Int>>()
    val mVotedPlayersArray: LiveData<ArrayList<Int>>
        get() = _mVotedPlayersArray

    private val _mVotedArrayString = MutableLiveData<String>()
    val mVotedArrayString: LiveData<String>
        get() = _mVotedArrayString

    private val _mVotedArrayString1 = MutableLiveData<String>()
    val mVotedArrayString1: LiveData<String>
        get() = _mVotedArrayString1

    private val _mVotedArrayString2 = MutableLiveData<String>()
    val mVotedArrayString2: LiveData<String>
        get() = _mVotedArrayString2

    private val _mVotedArrayString3 = MutableLiveData<String>()
    val mVotedArrayString3: LiveData<String>
        get() = _mVotedArrayString3

    private val _mVotedArrayString4 = MutableLiveData<String>()
    val mVotedArrayString4: LiveData<String>
        get() = _mVotedArrayString4

    private val _mVotedArrayString5 = MutableLiveData<String>()
    val mVotedArrayString5: LiveData<String>
        get() = _mVotedArrayString5

    private val _mVotedArrayString6 = MutableLiveData<String>()
    val mVotedArrayString6: LiveData<String>
        get() = _mVotedArrayString6

    private val _mVotedArrayString7 = MutableLiveData<String>()
    val mVotedArrayString7: LiveData<String>
        get() = _mVotedArrayString7

    private val _mVotedArrayString8 = MutableLiveData<String>()
    val mVotedArrayString8: LiveData<String>
        get() = _mVotedArrayString8

    private val _mVotedArrayString9 = MutableLiveData<String>()
    val mVotedArrayString9: LiveData<String>
        get() = _mVotedArrayString9

    private val _mVotedArrayString10 = MutableLiveData<String>()
    val mVotedArrayString10: LiveData<String>
        get() = _mVotedArrayString10


    //BEST MOVE BOOL
    private val _bestMoveActiveBool = MutableLiveData<Boolean>()
    val bestMoveActiveBool: LiveData<Boolean>
        get() = _bestMoveActiveBool

    private val _bestMove1Bool = MutableLiveData<Boolean>()
    val bestMove1Bool: LiveData<Boolean>
        get() = _bestMove1Bool

    private val _bestMove2Bool = MutableLiveData<Boolean>()
    val bestMove2Bool: LiveData<Boolean>
        get() = _bestMove2Bool

    private val _bestMove3Bool = MutableLiveData<Boolean>()
    val bestMove3Bool: LiveData<Boolean>
        get() = _bestMove3Bool

    private val _bestMove4Bool = MutableLiveData<Boolean>()
    val bestMove4Bool: LiveData<Boolean>
        get() = _bestMove4Bool

    private val _bestMove5Bool = MutableLiveData<Boolean>()
    val bestMove5Bool: LiveData<Boolean>
        get() = _bestMove5Bool

    private val _bestMove6Bool = MutableLiveData<Boolean>()
    val bestMove6Bool: LiveData<Boolean>
        get() = _bestMove6Bool

    private val _bestMove7Bool = MutableLiveData<Boolean>()
    val bestMove7Bool: LiveData<Boolean>
        get() = _bestMove7Bool

    private val _bestMove8Bool = MutableLiveData<Boolean>()
    val bestMove8Bool: LiveData<Boolean>
        get() = _bestMove8Bool

    private val _bestMove9Bool = MutableLiveData<Boolean>()
    val bestMove9Bool: LiveData<Boolean>
        get() = _bestMove9Bool

    private val _bestMove10Bool = MutableLiveData<Boolean>()
    val bestMove10Bool: LiveData<Boolean>
        get() = _bestMove10Bool


    //ARRAY BEST MOVE
    private val _mBestMoveArray = MutableLiveData<ArrayList<Int>>()
    val mBestMoveArray: LiveData<ArrayList<Int>>
        get() = _mBestMoveArray

    //BEST MOVE BUTTON DRAWABLE
    private val _mBestMoveButtonDrawable = MutableLiveData<Drawable>()
    val mBestMoveButtonDrawable: LiveData<Drawable>
        get() = _mBestMoveButtonDrawable

    private val _mBestMoveTextString = MutableLiveData<String>()
    val mBestMoveTextString: LiveData<String>
        get() = _mBestMoveTextString



    init {

        initVoteBool()
        initButtonDrawable()
        initBestMove()
    }

    private fun initVoteBool() {
        _vote1PlayerBool.value = false
        _vote2PlayerBool.value = false
        _vote3PlayerBool.value = false
        _vote4PlayerBool.value = false
        _vote5PlayerBool.value = false
        _vote6PlayerBool.value = false
        _vote7PlayerBool.value = false
        _vote8PlayerBool.value = false
        _vote9PlayerBool.value = false
        _vote10PlayerBool.value = false

        _mVotedPlayersArray.value = arrayListOf()
        _mVotedArrayString.value = "порядок голосования"
    }

    private fun initButtonDrawable() {
        _mButton1Drawable.value =
            AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        _mButton2Drawable.value =
            AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        _mButton3Drawable.value =
            AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        _mButton4Drawable.value =
            AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        _mButton5Drawable.value =
            AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        _mButton6Drawable.value =
            AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        _mButton7Drawable.value =
            AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        _mButton8Drawable.value =
            AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        _mButton9Drawable.value =
            AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        _mButton10Drawable.value =
            AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
    }

    private fun initBestMove() {
        _bestMoveActiveBool.value = false

        _bestMove1Bool.value = false
        _bestMove2Bool.value = false
        _bestMove3Bool.value = false
        _bestMove4Bool.value = false
        _bestMove5Bool.value = false
        _bestMove6Bool.value = false
        _bestMove7Bool.value = false
        _bestMove8Bool.value = false
        _bestMove9Bool.value = false
        _bestMove10Bool.value = false

        _mBestMoveButtonDrawable.value =
            AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)

        _mBestMoveArray.value = arrayListOf()

        _mBestMoveTextString.value = "Best Move"
    }


    //VOTE FLAGS
    fun vote1Flag() {
        if (_bestMoveActiveBool.value == false) {
            if (vote1PlayerBool.value == false) {
                _mButton1Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
                _mVotedPlayersArray.value?.plusAssign(1)
                votedArrayToString()
                _vote1PlayerBool.value = true
            } else {
                _mButton1Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
                _mVotedPlayersArray.value?.removeAll { it.equals(1) }
                votedArrayToString()
                _vote1PlayerBool.value = false
            }
        } else {
            bm1Flag()
        }
    }

    fun vote2Flag() {
        if (_bestMoveActiveBool.value == false) {
            if (vote2PlayerBool.value == false) {
                _mButton2Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
                _mVotedPlayersArray.value?.plusAssign(2)
                votedArrayToString()
                _vote2PlayerBool.value = true
            } else {
                _mButton2Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
                _mVotedPlayersArray.value?.removeAll { it.equals(2) }
                votedArrayToString()
                _vote2PlayerBool.value = false
            }
        } else {
            bm2Flag()
        }
    }

    fun vote3Flag() {
        if (_bestMoveActiveBool.value == false) {
            if (vote3PlayerBool.value == false) {
                _mButton3Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
                _mVotedPlayersArray.value?.plusAssign(3)
                votedArrayToString()
                _vote3PlayerBool.value = true
            } else {
                _mButton3Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
                _mVotedPlayersArray.value?.removeAll { it.equals(3) }
                votedArrayToString()
                _vote3PlayerBool.value = false
            }
        } else {
            bm3Flag()
        }
    }

    fun vote4Flag() {
        if (_bestMoveActiveBool.value == false) {
            if (vote4PlayerBool.value == false) {
                _mButton4Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
                _mVotedPlayersArray.value?.plusAssign(4)
                votedArrayToString()
                _vote4PlayerBool.value = true
            } else {
                _mButton4Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
                _mVotedPlayersArray.value?.removeAll { it.equals(4) }
                votedArrayToString()
                _vote4PlayerBool.value = false
            }
        } else {
            bm4Flag()
        }
    }

    fun vote5Flag() {
        if (_bestMoveActiveBool.value == false) {
            if (vote5PlayerBool.value == false) {
                _mButton5Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
                _mVotedPlayersArray.value?.plusAssign(5)
                votedArrayToString()
                _vote5PlayerBool.value = true
            } else {
                _mButton5Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
                _mVotedPlayersArray.value?.removeAll { it.equals(5) }
                votedArrayToString()
                _vote5PlayerBool.value = false
            }
        } else {
            bm5Flag()
        }
    }

    fun vote6Flag() {
        if (_bestMoveActiveBool.value == false) {
            if (vote6PlayerBool.value == false) {
                _mButton6Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
                _mVotedPlayersArray.value?.plusAssign(6)
                votedArrayToString()
                _vote6PlayerBool.value = true
            } else {
                _mButton6Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
                mVotedPlayersArray.value?.removeAll { it.equals(6) }
                votedArrayToString()
                _vote6PlayerBool.value = false
            }
        } else {
            bm6Flag()
        }
    }

    fun vote7Flag() {
        if (_bestMoveActiveBool.value == false) {
            if (vote7PlayerBool.value == false) {
                _mButton7Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
                _mVotedPlayersArray.value?.plusAssign(7)
                votedArrayToString()
                _vote7PlayerBool.value = true
            } else {
                _mButton7Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
                _mVotedPlayersArray.value?.removeAll { it.equals(7) }
                votedArrayToString()
                _vote7PlayerBool.value = false
            }
        } else {
            bm7Flag()
        }
    }

    fun vote8Flag() {
        if (_bestMoveActiveBool.value == false) {
            if (vote8PlayerBool.value == false) {
                _mButton8Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
                _mVotedPlayersArray.value?.plusAssign(8)
                votedArrayToString()
                _vote8PlayerBool.value = true
            } else {
                _mButton8Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
                _mVotedPlayersArray.value?.removeAll { it.equals(8) }
                votedArrayToString()
                _vote8PlayerBool.value = false
            }
        } else {
            bm8Flag()
        }
    }

    fun vote9Flag() {
        if (_bestMoveActiveBool.value == false) {
            if (vote9PlayerBool.value == false) {
                _mButton9Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
                _mVotedPlayersArray.value?.plusAssign(9)
                votedArrayToString()
                _vote9PlayerBool.value = true
            } else {
                _mButton9Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
                _mVotedPlayersArray.value?.removeAll { it.equals(9) }
                votedArrayToString()
                _vote9PlayerBool.value = false
            }
        } else {
            bm9Flag()
        }
    }

    fun vote10Flag() {
        if (_bestMoveActiveBool.value == false) {
            if (vote10PlayerBool.value == false) {
                _mButton10Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
                _mVotedPlayersArray.value?.plusAssign(10)
                votedArrayToString()
                _vote10PlayerBool.value = true
            } else {
                _mButton10Drawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
                mVotedPlayersArray.value?.removeAll { it.equals(10) }
                votedArrayToString()
                _vote10PlayerBool.value = false
            }
        } else {
            bm10Flag()
        }
    }


    //BEST MOVE
    fun bestMove() {
        if (bestMoveActiveBool.value == false) {
            _bestMoveActiveBool.value = true
            _mBestMoveButtonDrawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            _mButton1Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            _mButton2Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            _mButton3Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            _mButton4Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            _mButton5Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            _mButton6Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            _mButton7Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            _mButton8Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            _mButton9Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            _mButton10Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)


        } else if (bestMoveActiveBool.value == true) {
            _bestMoveActiveBool.value = false
            _mBestMoveButtonDrawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
            _mButton1Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
            _mButton2Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
            _mButton3Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
            _mButton4Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
            _mButton5Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
            _mButton6Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
            _mButton7Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
            _mButton8Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
            _mButton9Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
            _mButton10Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)

            if (mBestMoveArray.value!!.isNotEmpty()) {
                _mBestMoveTextString.value = mBestMoveArray.value.toString()
                _mBestMoveButtonDrawable.value =
                    AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
            } else if (mBestMoveArray.value!!.isEmpty()) {
                _mBestMoveTextString.value = "Best Move"

            }
        }
    }

    fun votedArrayToString() {
        if (mVotedPlayersArray.value!!.isEmpty()) {
            _mVotedArrayString.value = ""
            _mVotedArrayString1.value = ""
            _mVotedArrayString2.value = ""
            _mVotedArrayString3.value = ""
            _mVotedArrayString4.value = ""
            _mVotedArrayString5.value = ""
            _mVotedArrayString6.value = ""
            _mVotedArrayString7.value = ""
            _mVotedArrayString8.value = ""
            _mVotedArrayString9.value = ""
            _mVotedArrayString10.value = ""
        } else {
            _mVotedArrayString.value = mVotedPlayersArray.value.toString()

            when (mVotedPlayersArray.value!!.size) {
                1 -> {
                    _mVotedArrayString1.value = mVotedPlayersArray.value?.get(0).toString()
                    _mVotedArrayString2.value = ""
                    _mVotedArrayString3.value = ""
                    _mVotedArrayString4.value = ""
                    _mVotedArrayString5.value = ""
                    _mVotedArrayString6.value = ""
                    _mVotedArrayString7.value = ""
                    _mVotedArrayString8.value = ""
                    _mVotedArrayString9.value = ""
                    _mVotedArrayString10.value = ""
                }
                2 -> {
                    _mVotedArrayString1.value = mVotedPlayersArray.value?.get(0).toString()
                    _mVotedArrayString2.value = mVotedPlayersArray.value?.get(1).toString()
                    _mVotedArrayString3.value = ""
                    _mVotedArrayString4.value = ""
                    _mVotedArrayString5.value = ""
                    _mVotedArrayString6.value = ""
                    _mVotedArrayString7.value = ""
                    _mVotedArrayString8.value = ""
                    _mVotedArrayString9.value = ""
                    _mVotedArrayString10.value = ""
                }
                3 -> {
                    _mVotedArrayString1.value = mVotedPlayersArray.value?.get(0).toString()
                    _mVotedArrayString2.value = mVotedPlayersArray.value?.get(1).toString()
                    _mVotedArrayString3.value = mVotedPlayersArray.value?.get(2).toString()
                    _mVotedArrayString4.value = ""
                    _mVotedArrayString5.value = ""
                    _mVotedArrayString6.value = ""
                    _mVotedArrayString7.value = ""
                    _mVotedArrayString8.value = ""
                    _mVotedArrayString9.value = ""
                    _mVotedArrayString10.value = ""
                }
                4 -> {
                    _mVotedArrayString1.value = mVotedPlayersArray.value?.get(0).toString()
                    _mVotedArrayString2.value = mVotedPlayersArray.value?.get(1).toString()
                    _mVotedArrayString3.value = mVotedPlayersArray.value?.get(2).toString()
                    _mVotedArrayString4.value = mVotedPlayersArray.value?.get(3).toString()
                    _mVotedArrayString5.value = ""
                    _mVotedArrayString6.value = ""
                    _mVotedArrayString7.value = ""
                    _mVotedArrayString8.value = ""
                    _mVotedArrayString9.value = ""
                    _mVotedArrayString10.value = ""
                }
                5 -> {
                    _mVotedArrayString1.value = mVotedPlayersArray.value?.get(0).toString()
                    _mVotedArrayString2.value = mVotedPlayersArray.value?.get(1).toString()
                    _mVotedArrayString3.value = mVotedPlayersArray.value?.get(2).toString()
                    _mVotedArrayString4.value = mVotedPlayersArray.value?.get(3).toString()
                    _mVotedArrayString5.value = mVotedPlayersArray.value?.get(4).toString()
                    _mVotedArrayString6.value = ""
                    _mVotedArrayString7.value = ""
                    _mVotedArrayString8.value = ""
                    _mVotedArrayString9.value = ""
                    _mVotedArrayString10.value = ""
                }
                6 -> {
                    _mVotedArrayString1.value = mVotedPlayersArray.value?.get(0).toString()
                    _mVotedArrayString2.value = mVotedPlayersArray.value?.get(1).toString()
                    _mVotedArrayString3.value = mVotedPlayersArray.value?.get(2).toString()
                    _mVotedArrayString4.value = mVotedPlayersArray.value?.get(3).toString()
                    _mVotedArrayString5.value = mVotedPlayersArray.value?.get(4).toString()
                    _mVotedArrayString6.value = mVotedPlayersArray.value?.get(5).toString()
                    _mVotedArrayString7.value = ""
                    _mVotedArrayString8.value = ""
                    _mVotedArrayString9.value = ""
                    _mVotedArrayString10.value = ""
                }
                7 -> {
                    _mVotedArrayString1.value = mVotedPlayersArray.value?.get(0).toString()
                    _mVotedArrayString2.value = mVotedPlayersArray.value?.get(1).toString()
                    _mVotedArrayString3.value = mVotedPlayersArray.value?.get(2).toString()
                    _mVotedArrayString4.value = mVotedPlayersArray.value?.get(3).toString()
                    _mVotedArrayString5.value = mVotedPlayersArray.value?.get(4).toString()
                    _mVotedArrayString6.value = mVotedPlayersArray.value?.get(5).toString()
                    _mVotedArrayString7.value = mVotedPlayersArray.value?.get(6).toString()
                    _mVotedArrayString8.value = ""
                    _mVotedArrayString9.value = ""
                    _mVotedArrayString10.value = ""
                }
                8 -> {
                    _mVotedArrayString1.value = mVotedPlayersArray.value?.get(0).toString()
                    _mVotedArrayString2.value = mVotedPlayersArray.value?.get(1).toString()
                    _mVotedArrayString3.value = mVotedPlayersArray.value?.get(2).toString()
                    _mVotedArrayString4.value = mVotedPlayersArray.value?.get(3).toString()
                    _mVotedArrayString5.value = mVotedPlayersArray.value?.get(4).toString()
                    _mVotedArrayString6.value = mVotedPlayersArray.value?.get(5).toString()
                    _mVotedArrayString7.value = mVotedPlayersArray.value?.get(6).toString()
                    _mVotedArrayString8.value = mVotedPlayersArray.value?.get(7).toString()
                    _mVotedArrayString9.value = ""
                    _mVotedArrayString10.value = ""
                }
                9 -> {
                    _mVotedArrayString1.value = mVotedPlayersArray.value?.get(0).toString()
                    _mVotedArrayString2.value = mVotedPlayersArray.value?.get(1).toString()
                    _mVotedArrayString3.value = mVotedPlayersArray.value?.get(2).toString()
                    _mVotedArrayString4.value = mVotedPlayersArray.value?.get(3).toString()
                    _mVotedArrayString5.value = mVotedPlayersArray.value?.get(4).toString()
                    _mVotedArrayString6.value = mVotedPlayersArray.value?.get(5).toString()
                    _mVotedArrayString7.value = mVotedPlayersArray.value?.get(6).toString()
                    _mVotedArrayString8.value = mVotedPlayersArray.value?.get(7).toString()
                    _mVotedArrayString9.value = mVotedPlayersArray.value?.get(8).toString()
                    _mVotedArrayString10.value = ""
                }
                10 -> {
                    _mVotedArrayString1.value = mVotedPlayersArray.value?.get(0).toString()
                    _mVotedArrayString2.value = mVotedPlayersArray.value?.get(1).toString()
                    _mVotedArrayString3.value = mVotedPlayersArray.value?.get(2).toString()
                    _mVotedArrayString4.value = mVotedPlayersArray.value?.get(3).toString()
                    _mVotedArrayString5.value = mVotedPlayersArray.value?.get(4).toString()
                    _mVotedArrayString6.value = mVotedPlayersArray.value?.get(5).toString()
                    _mVotedArrayString7.value = mVotedPlayersArray.value?.get(6).toString()
                    _mVotedArrayString8.value = mVotedPlayersArray.value?.get(7).toString()
                    _mVotedArrayString9.value = mVotedPlayersArray.value?.get(8).toString()
                    _mVotedArrayString10.value = mVotedPlayersArray.value?.get(9).toString()
                }
            }
        }
    }

    //BEST MOVE FLAGS
    fun bm1Flag() {
        if (bestMove1Bool.value == false) {
            _mButton1Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
            mBestMoveArray.value?.plusAssign(1)
            _bestMove1Bool.value = true
        } else {
            _mButton1Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            mBestMoveArray.value?.removeAll { it.equals(1) }
            _bestMove1Bool.value = false
        }
    }

    fun bm2Flag() {
        if (bestMove2Bool.value == false) {
            _mButton2Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
            mBestMoveArray.value?.plusAssign(2)
            _bestMove2Bool.value = true
        } else {
            _mButton2Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            mBestMoveArray.value?.removeAll { it.equals(2) }
            _bestMove2Bool.value = false
        }
    }

    fun bm3Flag() {
        if (bestMove3Bool.value == false) {
            _mButton3Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
            mBestMoveArray.value?.plusAssign(3)
            _bestMove3Bool.value = true
        } else {
            _mButton3Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            mBestMoveArray.value?.removeAll { it.equals(3) }
            _bestMove3Bool.value = false
        }
    }

    fun bm4Flag() {
        if (bestMove4Bool.value == false) {
            _mButton4Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
            mBestMoveArray.value?.plusAssign(4)
            _bestMove4Bool.value = true
        } else {
            _mButton4Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            mBestMoveArray.value?.removeAll { it.equals(4) }
            _bestMove4Bool.value = false
        }
    }

    fun bm5Flag() {
        if (bestMove5Bool.value == false) {
            _mButton5Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
            mBestMoveArray.value?.plusAssign(5)
            _bestMove5Bool.value = true
        } else {
            _mButton5Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            mBestMoveArray.value?.removeAll { it.equals(5) }
            _bestMove5Bool.value = false
        }
    }

    fun bm6Flag() {
        if (bestMove6Bool.value == false) {
            _mButton6Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
            mBestMoveArray.value?.plusAssign(6)
            _bestMove6Bool.value = true
        } else {
            _mButton6Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            mBestMoveArray.value?.removeAll { it.equals(6) }
            _bestMove6Bool.value = false
        }
    }

    fun bm7Flag() {
        if (bestMove7Bool.value == false) {
            _mButton7Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
            mBestMoveArray.value?.plusAssign(7)
            _bestMove7Bool.value = true
        } else {
            _mButton7Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            mBestMoveArray.value?.removeAll { it.equals(7) }
            _bestMove7Bool.value = false
        }
    }

    fun bm8Flag() {
        if (bestMove8Bool.value == false) {
            _mButton8Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
            mBestMoveArray.value?.plusAssign(8)
            _bestMove8Bool.value = true
        } else {
            _mButton8Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            mBestMoveArray.value?.removeAll { it.equals(8) }
            _bestMove8Bool.value = false
        }
    }

    fun bm9Flag() {
        if (bestMove9Bool.value == false) {
            _mButton9Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
            mBestMoveArray.value?.plusAssign(9)
            _bestMove9Bool.value = true
        } else {
            _mButton9Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            mBestMoveArray.value?.removeAll { it.equals(9) }
            _bestMove9Bool.value = false
        }
    }

    fun bm10Flag() {
        if (bestMove10Bool.value == false) {
            _mButton10Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
            mBestMoveArray.value?.plusAssign(10)
            _bestMove10Bool.value = true
        } else {
            _mButton10Drawable.value =
                AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
            mBestMoveArray.value?.removeAll { it.equals(10) }
            _bestMove10Bool.value = false
        }
    }

    fun resetBestMove() {
        initBestMove()
    }


    //RESET VOTE
    fun resetThisShit() {
        initVoteBool()
        initButtonDrawable()
        votedArrayToString()
    }
}
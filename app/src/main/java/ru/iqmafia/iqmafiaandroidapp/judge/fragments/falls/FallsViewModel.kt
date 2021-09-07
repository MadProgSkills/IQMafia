package ru.iqmafia.iqmafiaandroidapp.judge.fragments.falls

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.appcompat.content.res.AppCompatResources
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.iqmafia.iqmafiaandroidapp.R

class FallsViewModel(application: Application) : AndroidViewModel(application) {
    //FALLS UI
    private val _mButton1TextString = MutableLiveData<String>()
    val mButton1TextString: LiveData<String>
        get() = _mButton1TextString

    private val _mButton1ResDrawable = MutableLiveData<Drawable>()
    val mButton1ResDrawable: LiveData<Drawable>
        get() = _mButton1ResDrawable

    private val _mButton2TextString = MutableLiveData<String>()
    val mButton2TextString: LiveData<String>
        get() = _mButton2TextString

    private val _mButton2ResDrawable = MutableLiveData<Drawable>()
    val mButton2ResDrawable: LiveData<Drawable>
        get() = _mButton2ResDrawable

    private val _mButton3TextString = MutableLiveData<String>()
    val mButton3TextString: LiveData<String>
        get() = _mButton3TextString

    private val _mButton3ResDrawable = MutableLiveData<Drawable>()
    val mButton3ResDrawable: LiveData<Drawable>
        get() = _mButton3ResDrawable

    private val _mButton4TextString = MutableLiveData<String>()
    val mButton4TextString: LiveData<String>
        get() = _mButton4TextString

    private val _mButton4ResDrawable = MutableLiveData<Drawable>()
    val mButton4ResDrawable: LiveData<Drawable>
        get() = _mButton4ResDrawable

    private val _mButton5TextString = MutableLiveData<String>()
    val mButton5TextString: LiveData<String>
        get() = _mButton5TextString

    private val _mButton5ResDrawable = MutableLiveData<Drawable>()
    val mButton5ResDrawable: LiveData<Drawable>
        get() = _mButton5ResDrawable

    private val _mButton6TextString = MutableLiveData<String>()
    val mButton6TextString: LiveData<String>
        get() = _mButton6TextString

    private val _mButton6ResDrawable = MutableLiveData<Drawable>()
    val mButton6ResDrawable: LiveData<Drawable>
        get() = _mButton6ResDrawable

    private val _mButton7TextString = MutableLiveData<String>()
    val mButton7TextString: LiveData<String>
        get() = _mButton7TextString

    private val _mButton7ResDrawable = MutableLiveData<Drawable>()
    val mButton7ResDrawable: LiveData<Drawable>
        get() = _mButton7ResDrawable

    private val _mButton8TextString = MutableLiveData<String>()
    val mButton8TextString: LiveData<String>
        get() = _mButton8TextString

    private val _mButton8ResDrawable = MutableLiveData<Drawable>()
    val mButton8ResDrawable: LiveData<Drawable>
        get() = _mButton8ResDrawable

    private val _mButton9TextString = MutableLiveData<String>()
    val mButton9TextString: LiveData<String>
        get() = _mButton9TextString

    private val _mButton9ResDrawable = MutableLiveData<Drawable>()
    val mButton9ResDrawable: LiveData<Drawable>
        get() = _mButton9ResDrawable

    private val _mButton10TextString = MutableLiveData<String>()
    val mButton10TextString: LiveData<String>
        get() = _mButton10TextString

    private val _mButton10ResDrawable = MutableLiveData<Drawable>()
    val mButton10ResDrawable: LiveData<Drawable>
        get() = _mButton10ResDrawable



    //FALLS COUNT
    private val _mFallsCounter1Int = MutableLiveData<Int>()
    val mFallsCounter1Int: LiveData<Int>
        get() = _mFallsCounter1Int

    private val _mFallsCounter2Int = MutableLiveData<Int>()
    val mFallsCounter2Int: LiveData<Int>
        get() = _mFallsCounter2Int

    private val _mFallsCounter3Int = MutableLiveData<Int>()
    val mFallsCounter3Int: LiveData<Int>
        get() = _mFallsCounter3Int

    private val _mFallsCounter4Int = MutableLiveData<Int>()
    val mFallsCounter4Int: LiveData<Int>
        get() = _mFallsCounter4Int

    private val _mFallsCounter5Int = MutableLiveData<Int>()
    val mFallsCounter5Int: LiveData<Int>
        get() = _mFallsCounter5Int

    private val _mFallsCounter6Int = MutableLiveData<Int>()
    val mFallsCounter6Int: LiveData<Int>
        get() = _mFallsCounter6Int

    private val _mFallsCounter7Int = MutableLiveData<Int>()
    val mFallsCounter7Int: LiveData<Int>
        get() = _mFallsCounter7Int

    private val _mFallsCounter8Int = MutableLiveData<Int>()
    val mFallsCounter8Int: LiveData<Int>
        get() = _mFallsCounter8Int

    private val _mFallsCounter9Int = MutableLiveData<Int>()
    val mFallsCounter9Int: LiveData<Int>
        get() = _mFallsCounter9Int

    private val _mFallsCounter10Int = MutableLiveData<Int>()
    val mFallsCounter10Int: LiveData<Int>
        get() = _mFallsCounter10Int




    init {
        initButtons()
        initCounter()
    }

    private fun initButtons() {
        _mButton1TextString.value = ""
        _mButton1ResDrawable.value = AppCompatResources.getDrawable(getApplication(),R.drawable.my_border_blue)
        _mButton2TextString.value = ""
        _mButton2ResDrawable.value = AppCompatResources.getDrawable(getApplication(),R.drawable.my_border_blue)
        _mButton3TextString.value = ""
        _mButton3ResDrawable.value = AppCompatResources.getDrawable(getApplication(),R.drawable.my_border_blue)
        _mButton4TextString.value = ""
        _mButton4ResDrawable.value = AppCompatResources.getDrawable(getApplication(),R.drawable.my_border_blue)
        _mButton5TextString.value = ""
        _mButton5ResDrawable.value = AppCompatResources.getDrawable(getApplication(),R.drawable.my_border_blue)
        _mButton6TextString.value = ""
        _mButton6ResDrawable.value = AppCompatResources.getDrawable(getApplication(),R.drawable.my_border_blue)
        _mButton7TextString.value = ""
        _mButton7ResDrawable.value = AppCompatResources.getDrawable(getApplication(),R.drawable.my_border_blue)
        _mButton8TextString.value = ""
        _mButton8ResDrawable.value = AppCompatResources.getDrawable(getApplication(),R.drawable.my_border_blue)
        _mButton9TextString.value = ""
        _mButton9ResDrawable.value = AppCompatResources.getDrawable(getApplication(),R.drawable.my_border_blue)
        _mButton10TextString.value = ""
        _mButton10ResDrawable.value = AppCompatResources.getDrawable(getApplication(),R.drawable.my_border_blue)
    }

    private fun initCounter() {
        _mFallsCounter1Int.value = 0
        _mFallsCounter2Int.value = 0
        _mFallsCounter3Int.value = 0
        _mFallsCounter4Int.value = 0
        _mFallsCounter5Int.value = 0
        _mFallsCounter6Int.value = 0
        _mFallsCounter7Int.value = 0
        _mFallsCounter8Int.value = 0
        _mFallsCounter9Int.value = 0
        _mFallsCounter10Int.value = 0
    }


    // FALL ONCLICKS
    fun fall1OnClick() {
        if (mFallsCounter1Int.value!!.toInt() < 4 && mFallsCounter1Int.value!!.toInt() >= 0) {
            _mFallsCounter1Int.value = (_mFallsCounter1Int.value)?.plus(1)
            fall1View()
        }
    }

    fun fall1OnLongClick() {
        if (mFallsCounter1Int.value!!.toInt() <= 4 && mFallsCounter1Int.value!!.toInt() > 0) {
            _mFallsCounter1Int.value = (_mFallsCounter1Int.value)?.minus(1)
            fall1View()
        }
    }

    fun fall2OnClick() {
        if (mFallsCounter2Int.value!!.toInt() < 4 && mFallsCounter2Int.value!!.toInt() >= 0) {
            _mFallsCounter2Int.value = (mFallsCounter2Int.value)?.plus(1)
            fall2View()
        }
    }

    fun fall2OnLongClick() {
        if (mFallsCounter2Int.value!!.toInt()  <= 4 && mFallsCounter2Int.value!!.toInt()  > 0) {
            _mFallsCounter2Int.value = (mFallsCounter2Int.value)?.minus(1)
            fall2View()
        }
    }

    fun fall3OnClick() {
        if (mFallsCounter3Int.value!!.toInt() < 4 && mFallsCounter3Int.value!!.toInt() >= 0) {
            _mFallsCounter3Int.value = (mFallsCounter3Int.value)?.plus(1)
            fall3View()
        }
    }

    fun fall3OnLongClick() {
        if (mFallsCounter3Int.value!!.toInt() <= 4 && mFallsCounter3Int.value!!.toInt() > 0) {
            _mFallsCounter3Int.value = (mFallsCounter3Int.value)?.minus(1)
            fall3View()
        }
    }

    fun fall4OnClick() {
        if (mFallsCounter4Int.value!!.toInt() < 4 && mFallsCounter4Int.value!!.toInt() >= 0) {
            _mFallsCounter4Int.value = (mFallsCounter4Int.value)?.plus(1)
            fall4View()
        }
    }

    fun fall4OnLongClick() {
        if (mFallsCounter4Int.value!!.toInt() <= 4 && mFallsCounter4Int.value!!.toInt() > 0) {
            _mFallsCounter4Int.value = (mFallsCounter4Int.value)?.minus(1)
            fall4View()
        }
    }

    fun fall5OnClick() {
        if (mFallsCounter5Int.value!!.toInt() < 4 && mFallsCounter5Int.value!!.toInt() >= 0) {
            _mFallsCounter5Int.value = (mFallsCounter5Int.value)?.plus(1)
            fall5View()
        }
    }

    fun fall5OnLongClick() {
        if (mFallsCounter5Int.value!!.toInt() <= 4 && mFallsCounter5Int.value!!.toInt() > 0) {
            _mFallsCounter5Int.value = (mFallsCounter5Int.value)?.minus(1)
            fall5View()
        }
    }

    fun fall6OnClick() {
        if (mFallsCounter6Int.value!!.toInt() < 4 && mFallsCounter6Int.value!!.toInt() >= 0) {
            _mFallsCounter6Int.value = (mFallsCounter6Int.value)?.plus(1)
            fall6View()
        }
    }

    fun fall6OnLongClick() {
        if (mFallsCounter6Int.value!!.toInt() <= 4 && mFallsCounter6Int.value!!.toInt() > 0) {
            _mFallsCounter6Int.value = (mFallsCounter6Int.value)?.minus(1)
            fall6View()
        }
    }

    fun fall7OnClick() {
        if (mFallsCounter7Int.value!!.toInt() < 4 && mFallsCounter7Int.value!!.toInt() >= 0) {
            _mFallsCounter7Int.value = (mFallsCounter7Int.value)?.plus(1)
            fall7View()
        }
    }

    fun fall7OnLongClick() {
        if (mFallsCounter7Int.value!!.toInt() <= 4 && mFallsCounter7Int.value!!.toInt() > 0) {
            _mFallsCounter7Int.value = (mFallsCounter7Int.value)?.minus(1)
            fall7View()
        }
    }


    fun fall8OnClick() {
        if (mFallsCounter8Int.value!!.toInt() < 4 && mFallsCounter8Int.value!!.toInt() >= 0) {
            _mFallsCounter8Int.value = (mFallsCounter8Int.value)?.plus(1)
            fall8View()
        }
    }

    fun fall8OnLongClick() {
        if (mFallsCounter8Int.value!!.toInt() <= 4 && mFallsCounter8Int.value!!.toInt() > 0) {
            _mFallsCounter8Int.value = (mFallsCounter8Int.value)?.minus(1)
            fall8View()
        }
    }

    fun fall9OnClick() {
        if (mFallsCounter9Int.value!!.toInt() < 4 && mFallsCounter9Int.value!!.toInt() >= 0) {
            _mFallsCounter9Int.value = (mFallsCounter9Int.value)?.plus(1)
            fall9View()
        }
    }

    fun fall9OnLongClick() {
        if (mFallsCounter9Int.value!!.toInt() <= 4 && mFallsCounter9Int.value!!.toInt() > 0) {
            _mFallsCounter9Int.value = (mFallsCounter9Int.value)?.minus(1)
            fall9View()
        }
    }

    fun fall10OnClick() {
        if (mFallsCounter10Int.value!!.toInt() < 4 && mFallsCounter10Int.value!!.toInt() >= 0) {
            _mFallsCounter10Int.value = (mFallsCounter10Int.value)?.plus(1)
            fall10View()
        }
    }

    fun fall10OnLongClick() {
        if (mFallsCounter10Int.value!!.toInt() <= 4 && mFallsCounter10Int.value!!.toInt() > 0) {
            _mFallsCounter10Int.value = (mFallsCounter10Int.value)?.minus(1)
            fall10View()
        }
    }


    // FALL VIEWS
    fun fall1View() {
        if(mFallsCounter1Int.value!!.toInt() == 0) {
            _mButton1TextString.value = ""
            _mButton1ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter1Int.value!!.toInt() == 1) {
            _mButton1TextString.value = "|"
            _mButton1ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter1Int.value!!.toInt() == 2) {
            _mButton1TextString.value = "||"
            _mButton1ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter1Int.value!!.toInt() == 3) {
            _mButton1TextString.value = "|||"
            _mButton1ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
        } else if (mFallsCounter1Int.value!!.toInt() == 4) {
            _mButton1TextString.value = "||||"
            _mButton1ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
        }
    }

    fun fall2View() {
        if(mFallsCounter2Int.value!!.toInt() == 0) {
            _mButton2TextString.value = ""
            _mButton2ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter2Int.value!!.toInt() == 1) {
            _mButton2TextString.value = "|"
            _mButton2ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter2Int.value!!.toInt() == 2) {
            _mButton2TextString.value = "||"
            _mButton2ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter2Int.value!!.toInt() == 3) {
            _mButton2TextString.value = "|||"
            _mButton2ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
        } else if (mFallsCounter2Int.value!!.toInt() == 4) {
            _mButton2TextString.value = "||||"
            _mButton2ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
        }
    }

    fun fall3View() {
        if(mFallsCounter3Int.value!!.toInt() == 0) {
            _mButton3TextString.value = ""
            _mButton3ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter3Int.value!!.toInt() == 1) {
            _mButton3TextString.value = "|"
            _mButton3ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter3Int.value!!.toInt() == 2) {
            _mButton3TextString.value = "||"
            _mButton3ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter3Int.value!!.toInt() == 3) {
            _mButton3TextString.value = "|||"
            _mButton3ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
        } else if (mFallsCounter3Int.value!!.toInt() == 4) {
            _mButton3TextString.value = "||||"
            _mButton3ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
        }
    }

    fun fall4View() {
        if(mFallsCounter4Int.value!!.toInt() == 0) {
            _mButton4TextString.value = ""
            _mButton4ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter4Int.value!!.toInt() == 1) {
            _mButton4TextString.value = "|"
            _mButton4ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter4Int.value!!.toInt() == 2) {
            _mButton4TextString.value = "||"
            _mButton4ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter4Int.value!!.toInt() == 3) {
            _mButton4TextString.value = "|||"
            _mButton4ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
        } else if (mFallsCounter4Int.value!!.toInt() == 4) {
            _mButton4TextString.value = "||||"
            _mButton4ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
        }
    }

    fun fall5View() {
        if(mFallsCounter5Int.value!!.toInt() == 0) {
            _mButton5TextString.value = ""
            _mButton5ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter5Int.value!!.toInt() == 1) {
            _mButton5TextString.value = "|"
            _mButton5ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter5Int.value!!.toInt() == 2) {
            _mButton5TextString.value = "||"
            _mButton5ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter5Int.value!!.toInt() == 3) {
            _mButton5TextString.value = "|||"
            _mButton5ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
        } else if (mFallsCounter5Int.value!!.toInt() == 4) {
            _mButton5TextString.value = "||||"
            _mButton5ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
        }
    }

    fun fall6View() {
        if(mFallsCounter6Int.value!!.toInt() == 0) {
            _mButton6TextString.value = ""
            _mButton6ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter6Int.value!!.toInt() == 1) {
            _mButton6TextString.value = "|"
            _mButton6ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter6Int.value!!.toInt() == 2) {
            _mButton6TextString.value = "||"
            _mButton6ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter6Int.value!!.toInt() == 3) {
            _mButton6TextString.value = "|||"
            _mButton6ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
        } else if (mFallsCounter6Int.value!!.toInt() == 4) {
            _mButton6TextString.value = "||||"
            _mButton6ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
        }
    }

    fun fall7View() {
        if(mFallsCounter7Int.value!!.toInt() == 0) {
            _mButton7TextString.value = ""
            _mButton7ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter7Int.value!!.toInt() == 1) {
            _mButton7TextString.value = "|"
            _mButton7ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter7Int.value!!.toInt() == 2) {
            _mButton7TextString.value = "||"
            _mButton7ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter7Int.value!!.toInt() == 3) {
            _mButton7TextString.value = "|||"
            _mButton7ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
        } else if (mFallsCounter7Int.value!!.toInt() == 4) {
            _mButton7TextString.value = "||||"
            _mButton7ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
        }
    }

    fun fall8View() {
        if(mFallsCounter8Int.value!!.toInt() == 0) {
            _mButton8TextString.value = ""
            _mButton8ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter8Int.value!!.toInt() == 1) {
            _mButton8TextString.value = "|"
            _mButton8ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter8Int.value!!.toInt() == 2) {
            _mButton8TextString.value = "||"
            _mButton8ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter8Int.value!!.toInt() == 3) {
            _mButton8TextString.value = "|||"
            _mButton8ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
        } else if (mFallsCounter8Int.value!!.toInt() == 4) {
            _mButton8TextString.value = "||||"
            _mButton8ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
        }
    }

    fun fall9View() {
        if(mFallsCounter9Int.value!!.toInt() == 0) {
            _mButton9TextString.value = ""
            _mButton9ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter9Int.value!!.toInt() == 1) {
            _mButton9TextString.value = "|"
            _mButton9ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter9Int.value!!.toInt() == 2) {
            _mButton9TextString.value = "||"
            _mButton9ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter9Int.value!!.toInt() == 3) {
            _mButton9TextString.value = "|||"
            _mButton9ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
        } else if (mFallsCounter9Int.value!!.toInt() == 4) {
            _mButton9TextString.value = "||||"
            _mButton9ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
        }
    }

    fun fall10View() {
        if(mFallsCounter10Int.value!!.toInt() == 0) {
            _mButton10TextString.value = ""
            _mButton10ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter10Int.value!!.toInt() == 1) {
            _mButton10TextString.value = "|"
            _mButton10ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter10Int.value!!.toInt() == 2) {
            _mButton10TextString.value = "||"
            _mButton10ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_blue)
        } else if (mFallsCounter10Int.value!!.toInt() == 3) {
            _mButton10TextString.value = "|||"
            _mButton10ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
        } else if (mFallsCounter10Int.value!!.toInt() == 4) {
            _mButton10TextString.value = "||||"
            _mButton10ResDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_red)
        }
    }


    fun resetThisShit() {
        initButtons()
        initCounter()
    }
}
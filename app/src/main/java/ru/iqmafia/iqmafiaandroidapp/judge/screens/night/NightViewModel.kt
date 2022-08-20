package ru.iqmafia.iqmafiaandroidapp.judge.screeens.night

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ru.iqmafia.iqmafiaandroidapp.judge.models.CurrentGamePlayerModel

class NightViewModel(application: Application) : AndroidViewModel(application) {

    private val mContext = application
//    private val mDB = IqDatabase.getInstance(mContext)
//    private val mDao = mDB.getDao()
//    private val mRepo = JudgeRoomRepository(mDao)

    private var _playersStatsList = MutableLiveData<List<CurrentGamePlayerModel>>()
    val playersStatsList: LiveData<List<CurrentGamePlayerModel>> get() = _playersStatsList

    //WHO WIN
    private var _whoWinString = MutableLiveData<String>()
    val whoWinString: LiveData<String>
        get() = _whoWinString


    //CARDS
    private var _card1String = MutableLiveData<String>()
    val card1String: LiveData<String>
        get() = _card1String

    private var _card2String = MutableLiveData<String>()
    val card2String: LiveData<String>
        get() = _card2String

    private var _card3String = MutableLiveData<String>()
    val card3String: LiveData<String>
        get() = _card3String

    private var _card4String = MutableLiveData<String>()
    val card4String: LiveData<String>
        get() = _card4String

    private var _card5String = MutableLiveData<String>()
    val card5String: LiveData<String>
        get() = _card5String

    private var _card6String = MutableLiveData<String>()
    val card6String: LiveData<String>
        get() = _card6String

    private var _card7String = MutableLiveData<String>()
    val card7String: LiveData<String>
        get() = _card7String

    private var _card8String = MutableLiveData<String>()
    val card8String: LiveData<String>
        get() = _card8String

    private var _card9String = MutableLiveData<String>()
    val card9String: LiveData<String>
        get() = _card9String

    private var _card10String = MutableLiveData<String>()
    val card10String: LiveData<String>
        get() = _card10String


    //FLAG
    private val _listIsNotEmptyBoolean = MutableLiveData<Boolean>()
    val listIsNotEmptyBoolean: LiveData<Boolean>
        get() = _listIsNotEmptyBoolean


    //NAMES
    private val _name1String = MutableLiveData<String>()
    val name1String: LiveData<String>
        get() = _name1String

    private val _name2String = MutableLiveData<String>()
    val name2String: LiveData<String>
        get() = _name2String

    private val _name3String = MutableLiveData<String>()
    val name3String: LiveData<String>
        get() = _name3String

    private val _name4String = MutableLiveData<String>()
    val name4String: LiveData<String>
        get() = _name4String

    private val _name5String = MutableLiveData<String>()
    val name5String: LiveData<String>
        get() = _name5String

    private val _name6String = MutableLiveData<String>()
    val name6String: LiveData<String>
        get() = _name6String

    private val _name7String = MutableLiveData<String>()
    val name7String: LiveData<String>
        get() = _name7String

    private val _name8String = MutableLiveData<String>()
    val name8String: LiveData<String>
        get() = _name8String

    private val _name9String = MutableLiveData<String>()
    val name9String: LiveData<String>
        get() = _name9String

    private val _name10String = MutableLiveData<String>()
    val name10String: LiveData<String>
        get() = _name10String


    //TEAM
    private val _team1String = MutableLiveData<String>()
    val team1String: LiveData<String>
        get() = _team1String

    private val _team2String = MutableLiveData<String>()
    val team2String: LiveData<String>
        get() = _team2String

    private val _team3String = MutableLiveData<String>()
    val team3String: LiveData<String>
        get() = _team3String

    private val _team4String = MutableLiveData<String>()
    val team4String: LiveData<String>
        get() = _team4String

    private val _team5String = MutableLiveData<String>()
    val team5String: LiveData<String>
        get() = _team5String

    private val _team6String = MutableLiveData<String>()
    val team6String: LiveData<String>
        get() = _team6String

    private val _team7String = MutableLiveData<String>()
    val team7String: LiveData<String>
        get() = _team7String

    private val _team8String = MutableLiveData<String>()
    val team8String: LiveData<String>
        get() = _team8String

    private val _team9String = MutableLiveData<String>()
    val team9String: LiveData<String>
        get() = _team9String

    private val _team10String = MutableLiveData<String>()
    val team10String: LiveData<String>
        get() = _team10String


    //RATING
    private val _rating1Double = MutableLiveData<Double>()
    val rating1Double: LiveData<Double>
        get() = _rating1Double

    private val _rating2Double = MutableLiveData<Double>()
    val rating2Double: LiveData<Double>
        get() = _rating2Double

    private val _rating3Double = MutableLiveData<Double>()
    val rating3Double: LiveData<Double>
        get() = _rating3Double

    private val _rating4Double = MutableLiveData<Double>()
    val rating4Double: LiveData<Double>
        get() = _rating4Double

    private val _rating5Double = MutableLiveData<Double>()
    val rating5Double: LiveData<Double>
        get() = _rating5Double

    private val _rating6Double = MutableLiveData<Double>()
    val rating6Double: LiveData<Double>
        get() = _rating6Double

    private val _rating7Double = MutableLiveData<Double>()
    val rating7Double: LiveData<Double>
        get() = _rating7Double

    private val _rating8Double = MutableLiveData<Double>()
    val rating8Double: LiveData<Double>
        get() = _rating8Double

    private val _rating9Double = MutableLiveData<Double>()
    val rating9Double: LiveData<Double>
        get() = _rating9Double

    private val _rating10Double = MutableLiveData<Double>()
    val rating10Double: LiveData<Double>
        get() = _rating10Double


    init {
        _whoWinString.value = ""

        _card1String.value = "rd"
        _card2String.value = "rd"
        _card3String.value = "rd"
        _card4String.value = "rd"
        _card5String.value = "rd"
        _card6String.value = "rd"
        _card7String.value = "rd"
        _card8String.value = "rd"
        _card9String.value = "rd"
        _card10String.value = "rd"

        _team1String.value = ""
        _team2String.value = ""
        _team3String.value = ""
        _team4String.value = ""
        _team5String.value = ""
        _team6String.value = ""
        _team7String.value = ""
        _team8String.value = ""
        _team9String.value = ""
        _team10String.value = ""


        resetRating()
        resetNames()
    }


    //NAMES
    fun setNames(list: List<String>) {
        _listIsNotEmptyBoolean.value = true

        _name1String.value = list[0]
        _name2String.value = list[1]
        _name3String.value = list[2]
        _name4String.value = list[3]
        _name5String.value = list[4]
        _name6String.value = list[5]
        _name7String.value = list[6]
        _name8String.value = list[7]
        _name9String.value = list[8]
        _name10String.value = list[9]
    }


    //BLACK CARDS
    var flagBlack1Button = false
    var flagBlack2Button = false
    var flagBlack3Button = false
    var flagBlack4Button = false
    var flagBlack5Button = false
    var flagBlack6Button = false
    var flagBlack7Button = false
    var flagBlack8Button = false
    var flagBlack9Button = false
    var flagBlack10Button = false

    fun setCardToBlack(card: String) {
        when (card) {
            "1" -> when (card1String.value) {
                "rd", "dn", "sh" -> _card1String.value = "bl"
                "bl" -> {
                    if (flagDon1Button) _card1String.value = "dn"
                    if (flagSher1Button) _card1String.value = "sh"
                    else _card1String.value = "rd"
                }
            }

            "2" -> when (card2String.value) {
                "rd", "dn", "sh" -> _card2String.value = "bl"
                "bl" -> {
                    if (flagDon2Button) _card2String.value = "dn"
                    if (flagSher2Button) _card2String.value = "sh"
                    else _card2String.value = "rd"
                }
            }

            "3" -> when (card3String.value) {
                "rd", "dn", "sh" -> _card3String.value = "bl"
                "bl" -> {
                    if (flagDon3Button) _card3String.value = "dn"
                    if (flagSher3Button) _card3String.value = "sh"
                    else _card3String.value = "rd"
                }
            }

            "4" -> when (card4String.value) {
                "rd", "dn", "sh" -> _card4String.value = "bl"
                "bl" -> {
                    if (flagDon4Button) _card4String.value = "dn"
                    if (flagSher4Button) _card4String.value = "sh"
                    else _card4String.value = "rd"
                }
            }

            "5" -> when (card5String.value) {
                "rd", "dn", "sh" -> _card5String.value = "bl"
                "bl" -> {
                    if (flagDon5Button) _card5String.value = "dn"
                    if (flagSher5Button) _card5String.value = "sh"
                    else _card5String.value = "rd"
                }
            }

            "6" -> when (card6String.value) {
                "rd", "dn", "sh" -> _card6String.value = "bl"
                "bl" -> {
                    if (flagDon6Button) _card6String.value = "dn"
                    if (flagSher6Button) _card6String.value = "sh"
                    else _card6String.value = "rd"
                }
            }

            "7" -> when (card7String.value) {
                "rd", "dn", "sh" -> _card7String.value = "bl"
                "bl" -> {
                    if (flagDon7Button) _card7String.value = "dn"
                    if (flagSher7Button) _card7String.value = "sh"
                    else _card7String.value = "rd"
                }
            }

            "8" -> when (card8String.value) {
                "rd", "dn", "sh" -> _card8String.value = "bl"
                "bl" -> {
                    if (flagDon8Button) _card8String.value = "dn"
                    if (flagSher8Button) _card8String.value = "sh"
                    else _card8String.value = "rd"
                }
            }

            "9" -> when (card9String.value) {
                "rd", "dn", "sh" -> _card9String.value = "bl"
                "bl" -> {
                    if (flagDon9Button) _card9String.value = "dn"
                    if (flagSher9Button) _card9String.value = "sh"
                    else _card9String.value = "rd"
                }
            }

            "10" -> when (card10String.value) {
                "rd", "dn", "sh" -> _card10String.value = "bl"
                "bl" -> {
                    if (flagDon10Button) _card10String.value = "dn"
                    if (flagSher10Button) _card10String.value = "sh"
                    else _card10String.value = "rd"
                }
            }
        }

    }



    //DON
    var flagDon1Button = false
    var flagDon2Button = false
    var flagDon3Button = false
    var flagDon4Button = false
    var flagDon5Button = false
    var flagDon6Button = false
    var flagDon7Button = false
    var flagDon8Button = false
    var flagDon9Button = false
    var flagDon10Button = false

    fun setCardToDon(card: String) {
        when (card) {
            "1" -> {
                when (card1String.value) {
                    "rd", "bl", "sh" -> _card1String.value = "dn"
                    "dn" -> {
                        if (flagBlack1Button) _card1String.value = "bl"
                        if (flagSher1Button) _card1String.value = "sh"
                        else _card1String.value = "rd"
                    }
                }
            }
            "2" -> {
                when (card2String.value) {
                    "rd", "bl", "sh" -> _card2String.value = "dn"
                    "dn" -> {
                        if (flagBlack2Button) _card2String.value = "bl"
                        if (flagSher2Button) _card2String.value = "sh"
                        else _card2String.value = "rd"
                    }
                }
            }
            "3" -> {
                when (card3String.value) {
                    "rd", "bl", "sh" -> _card3String.value = "dn"
                    "dn" -> {
                        if (flagBlack3Button) _card3String.value = "bl"
                        if (flagSher3Button) _card3String.value = "sh"
                        else _card3String.value = "rd"
                    }
                }
            }
            "4" -> {
                when (card4String.value) {
                    "rd", "bl", "sh" -> _card4String.value = "dn"
                    "dn" -> {
                        if (flagBlack4Button) _card4String.value = "bl"
                        if (flagSher4Button) _card4String.value = "sh"
                        else _card4String.value = "rd"
                    }
                }
            }
            "5" -> {
                when (card5String.value) {
                    "rd", "bl", "sh" -> _card5String.value = "dn"
                    "dn" -> {
                        if (flagBlack5Button) _card5String.value = "bl"
                        if (flagSher5Button) _card5String.value = "sh"
                        else _card5String.value = "rd"
                    }
                }
            }
            "6" -> {
                when (card6String.value) {
                    "rd", "bl", "sh" -> _card6String.value = "dn"
                    "dn" -> {
                        if (flagBlack6Button) _card6String.value = "bl"
                        if (flagSher6Button) _card6String.value = "sh"
                        else _card6String.value = "rd"
                    }
                }
            }
            "7" -> {
                when (card7String.value) {
                    "rd", "bl", "sh" -> _card7String.value = "dn"
                    "dn" -> {
                        if (flagBlack7Button) _card7String.value = "bl"
                        if (flagSher7Button) _card7String.value = "sh"
                        else _card7String.value = "rd"
                    }
                }
            }
            "8" -> {
                when (card8String.value) {
                    "rd", "bl", "sh" -> _card8String.value = "dn"
                    "dn" -> {
                        if (flagBlack8Button) _card8String.value = "bl"
                        if (flagSher8Button) _card8String.value = "sh"
                        else _card8String.value = "rd"
                    }
                }
            }
            "9" -> {
                when (card9String.value) {
                    "rd", "bl", "sh" -> _card9String.value = "dn"
                    "dn" -> {
                        if (flagBlack9Button) _card9String.value = "bl"
                        if (flagSher9Button) _card9String.value = "sh"
                        else _card9String.value = "rd"
                    }
                }
            }
            "10" -> {
                when (card10String.value) {
                    "rd", "bl", "sh" -> _card10String.value = "dn"
                    "dn" -> {
                        if (flagBlack10Button) _card10String.value = "bl"
                        if (flagSher10Button) _card10String.value = "sh"
                        else _card10String.value = "rd"
                    }
                }
            }
        }
    }


    //SHERIFF
    var flagSher1Button = false
    var flagSher2Button = false
    var flagSher3Button = false
    var flagSher4Button = false
    var flagSher5Button = false
    var flagSher6Button = false
    var flagSher7Button = false
    var flagSher8Button = false
    var flagSher9Button = false
    var flagSher10Button = false

    fun setCardToSher(card: String) {
        when (card) {
            "1" -> {
                when (card1String.value) {
                    "rd", "bl", "dn" -> _card1String.value = "sh"
                    "sh" -> {
                        if (flagBlack1Button) _card1String.value = "bl"
                        if (flagDon1Button) _card1String.value = "dn"
                        else _card1String.value = "rd"
                    }
                }
            }
            "2" -> {
                when (card2String.value) {
                    "rd", "bl", "dn" -> _card2String.value = "sh"
                    "sh" -> {
                        if (flagBlack2Button) _card2String.value = "bl"
                        if (flagDon2Button) _card2String.value = "dn"
                        else _card2String.value = "rd"
                    }
                }
            }
            "3" -> {
                when (card3String.value) {
                    "rd", "bl", "dn" -> _card3String.value = "sh"
                    "sh" -> {
                        if (flagBlack3Button) _card3String.value = "bl"
                        if (flagDon3Button) _card3String.value = "dn"
                        else _card3String.value = "rd"
                    }
                }
            }
            "4" -> {
                when (card4String.value) {
                    "rd", "bl", "dn" -> _card4String.value = "sh"
                    "sh" -> {
                        if (flagBlack4Button) _card4String.value = "bl"
                        if (flagDon4Button) _card4String.value = "dn"
                        else _card4String.value = "rd"
                    }
                }
            }
            "5" -> {
                when (card5String.value) {
                    "rd", "bl", "dn" -> _card5String.value = "sh"
                    "sh" -> {
                        if (flagBlack5Button) _card5String.value = "bl"
                        if (flagDon5Button) _card5String.value = "dn"
                        else _card5String.value = "rd"
                    }
                }
            }
            "6" -> {
                when (card6String.value) {
                    "rd", "bl", "dn" -> _card6String.value = "sh"
                    "sh" -> {
                        if (flagBlack6Button) _card6String.value = "bl"
                        if (flagDon6Button) _card6String.value = "dn"
                        else _card6String.value = "rd"
                    }
                }
            }
            "7" -> {
                when (card7String.value) {
                    "rd", "bl", "dn" -> _card7String.value = "sh"
                    "sh" -> {
                        if (flagBlack7Button) _card7String.value = "bl"
                        if (flagDon7Button) _card7String.value = "dn"
                        else _card7String.value = "rd"
                    }
                }
            }
            "8" -> {
                when (card8String.value) {
                    "rd", "bl", "dn" -> _card8String.value = "sh"
                    "sh" -> {
                        if (flagBlack8Button) _card8String.value = "bl"
                        if (flagDon8Button) _card8String.value = "dn"
                        else _card8String.value = "rd"
                    }
                }
            }
            "9" -> {
                when (card9String.value) {
                    "rd", "bl", "dn" -> _card9String.value = "sh"
                    "sh" -> {
                        if (flagBlack9Button) _card9String.value = "bl"
                        if (flagDon9Button) _card9String.value = "dn"
                        else _card9String.value = "rd"
                    }
                }
            }
            "10" -> {
                when (card10String.value) {
                    "rd", "bl", "dn" -> _card10String.value = "sh"
                    "sh" -> {
                        if (flagBlack10Button) _card10String.value = "bl"
                        if (flagDon10Button) _card10String.value = "dn"
                        else _card10String.value = "rd"
                    }
                }
            }
        }
    }

    //WINNER
    fun setWinner(winner: String) {
        when (winner) {
            "bl" -> _whoWinString.value = "bl"
            "rd" -> _whoWinString.value = "rd"
        }
    }

    //TEAM
    fun setTeam() {
        if (card1String.value == "bl" || card1String.value == "dn") {
            _team1String.value = "bl"
        } else _team1String.value = "rd"

        if (card2String.value == "bl" || card2String.value == "dn") {
            _team2String.value = "bl"
        } else _team2String.value = "rd"

        if (card3String.value == "bl" || card3String.value == "dn") {
            _team3String.value = "bl"
        } else _team3String.value = "rd"

        if (card4String.value == "bl" || card4String.value == "dn") {
            _team4String.value = "bl"
        } else _team4String.value = "rd"

        if (card5String.value == "bl" || card5String.value == "dn") {
            _team5String.value = "bl"
        } else _team5String.value = "rd"

        if (card6String.value == "bl" || card6String.value == "dn") {
            _team6String.value = "bl"
        } else _team6String.value = "rd"

        if (card7String.value == "bl" || card7String.value == "dn") {
            _team7String.value = "bl"
        } else _team7String.value = "rd"

        if (card8String.value == "bl" || card8String.value == "dn") {
            _team8String.value = "bl"
        } else _team8String.value = "rd"

        if (card9String.value == "bl" || card9String.value == "dn") {
            _team9String.value = "bl"
        } else _team9String.value = "rd"

        if (card10String.value == "bl" || card10String.value == "dn") {
            _team10String.value = "bl"
        } else _team10String.value = "rd"
    }

    //RATING
    fun setRating() {
        if (team1String.value == whoWinString.value) {
            _rating1Double.value = 1.00
        }
        if (team2String.value == whoWinString.value) {
            _rating2Double.value = 1.00
        }
        if (team3String.value == whoWinString.value) {
            _rating3Double.value = 1.00
        }
        if (team4String.value == whoWinString.value) {
            _rating4Double.value = 1.00
        }
        if (team5String.value == whoWinString.value) {
            _rating5Double.value = 1.00
        }
        if (team6String.value == whoWinString.value) {
            _rating6Double.value = 1.00
        }
        if (team7String.value == whoWinString.value) {
            _rating7Double.value = 1.00
        }
        if (team8String.value == whoWinString.value) {
            _rating8Double.value = 1.00
        }
        if (team9String.value == whoWinString.value) {
            _rating9Double.value = 1.00
        }
        if (team10String.value == whoWinString.value) {
            _rating10Double.value = 1.00
        }
    }


    //RESETS
    fun resetNames() {
        _listIsNotEmptyBoolean.value = false

        _name1String.value = ""
        _name2String.value = ""
        _name3String.value = ""
        _name4String.value = ""
        _name5String.value = ""
        _name6String.value = ""
        _name7String.value = ""
        _name8String.value = ""
        _name9String.value = ""
        _name10String.value = ""
    }


    fun resetRating() {
        _rating1Double.value = 0.00
        _rating2Double.value = 0.00
        _rating3Double.value = 0.00
        _rating4Double.value = 0.00
        _rating5Double.value = 0.00
        _rating6Double.value = 0.00
        _rating7Double.value = 0.00
        _rating8Double.value = 0.00
        _rating9Double.value = 0.00
        _rating10Double.value = 0.00
    }

    fun resetFlags() {
        flagBlack1Button = false
        flagBlack2Button = false
        flagBlack3Button = false
        flagBlack4Button = false
        flagBlack5Button = false
        flagBlack6Button = false
        flagBlack7Button = false
        flagBlack8Button = false
        flagBlack9Button = false
        flagBlack10Button = false

        flagDon1Button = false
        flagDon2Button = false
        flagDon3Button = false
        flagDon4Button = false
        flagDon5Button = false
        flagDon6Button = false
        flagDon7Button = false
        flagDon8Button = false
        flagDon9Button = false
        flagDon10Button = false

        flagSher1Button = false
        flagSher2Button = false
        flagSher3Button = false
        flagSher4Button = false
        flagSher5Button = false
        flagSher6Button = false
        flagSher7Button = false
        flagSher8Button = false
        flagSher9Button = false
        flagSher10Button = false

        _playersStatsList.value = emptyList()
    }



    //WIN BOOL TO STRING??!!
    //INSERTS
    fun insert10Players() {
        val insertList: List<CurrentGamePlayerModel> = listOf(
            CurrentGamePlayerModel(
                slot = 1,
                name = name1String.value.toString(),
                card = card1String.value.toString(),
                win = if (whoWinString.value == team1String.value) "win" else "loose",
                rating = rating1Double.value!!.toDouble()
            ),
            CurrentGamePlayerModel(
                slot = 2,
                name = name2String.value.toString(),
                card = card2String.value.toString(),
                win = if (whoWinString.value == team2String.value) "win" else "loose",
                rating = rating2Double.value!!.toDouble()
            ),
            CurrentGamePlayerModel(
                slot = 3,
                name = name3String.value.toString(),
                card = card3String.value.toString(),
                win = if (whoWinString.value == team3String.value) "win" else "loose",
                rating = rating3Double.value!!.toDouble()
            ),
            CurrentGamePlayerModel(
                slot = 4,
                name = name4String.value.toString(),
                card = card4String.value.toString(),
                win = if (whoWinString.value == team4String.value) "win" else "loose",
                rating = rating4Double.value!!.toDouble()
            ),
            CurrentGamePlayerModel(
                slot = 5,
                name = name5String.value.toString(),
                card = card5String.value.toString(),
                win = if (whoWinString.value == team5String.value) "win" else "loose",
                rating = rating5Double.value!!.toDouble()
            ),
            CurrentGamePlayerModel(
                slot = 6,
                name = name6String.value.toString(),
                card = card6String.value.toString(),
                win = if (whoWinString.value == team6String.value) "win" else "loose",
                rating = rating6Double.value!!.toDouble()
            ),
            CurrentGamePlayerModel(
                slot = 7,
                name = name7String.value.toString(),
                card = card7String.value.toString(),
                win = if (whoWinString.value == team7String.value) "win" else "loose",
                rating = rating7Double.value!!.toDouble()
            ),
            CurrentGamePlayerModel(
                slot = 8,
                name = name8String.value.toString(),
                card = card8String.value.toString(),
                win = if (whoWinString.value == team8String.value) "win" else "loose",
                rating = rating8Double.value!!.toDouble()
            ),
            CurrentGamePlayerModel(
                slot = 9,
                name = name9String.value.toString(),
                card = card9String.value.toString(),
                win = if (whoWinString.value == team9String.value) "win" else "loose",
                rating = rating9Double.value!!.toDouble()
            ),
            CurrentGamePlayerModel(
                slot = 10,
                name = name10String.value.toString(),
                card = card10String.value.toString(),
                win = if (whoWinString.value == team10String.value) "win" else "loose",
                rating = rating10Double.value!!.toDouble()
            )
        )

        _playersStatsList.value = insertList
    }

    private fun insertCurrentGamePlayer(player: CurrentGamePlayerModel) =
        viewModelScope.launch(Dispatchers.IO) {
//            mRepo.insertCurrentGamePlayer(player)
        }
}
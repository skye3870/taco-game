package com.example.game

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.example.game.databinding.ActivityGameBinding
import com.example.game.databinding.ActivityGameoverBinding
import kotlin.concurrent.timer

class GameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGameBinding



    var score: Int = 0
    var time: Int = 200
    var taco_container: Int = 0
    var tool: Int = 0
    var state1: Int = 0
    var state2: Int = 0
    var state3: Int = 0
    var state4: Int = 0
    var state5: Int = 0
    var state6: Int = 0
    var state7: Int = 0
    var state8: Int = 0
    var state9: Int = 0
    var state10: Int = 0
    var state11: Int = 0
    var state12: Int = 0
    var state13: Int = 0
    var state14: Int = 0
    var state15: Int = 0
    var state16: Int = 0

    val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGameBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        /*---------------------------------------------------------------------------*/

        binding.flour.setOnClickListener() {
            reset()
            tool = 1
            binding.flour.setImageResource(R.drawable.flour_pick)
            Log.d("state", "1")
        }
        binding.octo.setOnClickListener() {
            reset()
            tool = 2
            binding.octo.setImageResource(R.drawable.octo_pick)
            Log.d("state", "2")
        }
        binding.pin.setOnClickListener() {
            reset()
            tool = 3
            binding.pin.setImageResource(R.drawable.pin_pick)
            Log.d("state", "3")
        }
        binding.oil.setOnClickListener() {
            reset()
            tool = 4
            binding.oil.setImageResource(R.drawable.oil_pick)
            Log.d("state", "4")
        }
        binding.hand.setOnClickListener() {
            reset()
            tool = 5
            binding.hand.setImageResource(R.drawable.hand_pick)
            Log.d("state", "5")
        }
        //전체시간
        Thread() {
            for (i in 60 downTo 0) {
                time=i

                val timeNum = i.toString()
                Thread.sleep(1000)
                handler.post() {
                    binding.timeNum.setText(timeNum)
                }

                if (i in 30 downTo 15) {
                    handler.post() {
                        binding.person.setImageResource(R.drawable.angry1)
                    }
                } else if (i in 15 downTo 1) {
                    handler.post() {
                        binding.person.setImageResource(R.drawable.angry2)
                    }
                } else if (i == 0) {//게임오버
                    time=0

                    val intent = Intent(this, GameoverActivity::class.java)
                    intent.putExtra("score",score.toString())
                    startActivity(intent)
                    finish()


                    /*val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)*/
                }
            }
        }.start()

//****************************************************************************************************************************



        Thread() {
            binding.taco2.setOnClickListener() {
                if (tool == 1 && state2 == 0) {
                    state2 = 1
                    gone2()
                    binding.taco2.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state2 == 1) {
                    state2 = 2
                    binding.taco2.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state2 == 2) {
                    state2 = 3
                    binding.taco2.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state2 == 3) {
                    state2 = 4
                    binding.taco2.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state2 == 4) {
                    //잘 구워짐
                    state2 = 0
                    taco_container++
                    binding.taco2.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {
                    state2 = 0
                    binding.taco2.setImageResource(R.drawable.daco0)
                }
            }
        }.start()

        Thread() {
            binding.taco3.setOnClickListener() {
                if (tool == 1 && state3 == 0) {
                    state3 = 1
                    gone3()
                    binding.taco3.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state3 == 1) {
                    state3 = 2
                    binding.taco3.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state3 == 2) {
                    state3 = 3
                    binding.taco3.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state3 == 3) {
                    state3 = 4
                    binding.taco3.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state3 == 4) {
                    //잘 구워짐
                    state3 = 0
                    taco_container++
                    binding.taco3.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {
                    state3 = 0
                    binding.taco3.setImageResource(R.drawable.daco0)
                }
            }
        }.start()

        Thread() {
            binding.taco4.setOnClickListener() {
                if (tool == 1 && state4 == 0) {
                    state4 = 1
                    gone4()
                    binding.taco4.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state4 == 1) {
                    state4 = 2
                    binding.taco4.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state4 == 2) {
                    state4 = 3
                    binding.taco4.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state4 == 3) {
                    state4 = 4
                    binding.taco4.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state4 == 4) {
                    //잘 구워짐
                    state4 = 0
                    taco_container++
                    binding.taco4.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {
                    state4 = 0
                    binding.taco4.setImageResource(R.drawable.daco0)
                }
            }
        }.start()

        Thread() {
            binding.taco5.setOnClickListener() {
                if (tool == 1 && state5 == 0) {
                    state5 = 1
                    gone5()
                    binding.taco5.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state5 == 1) {
                    state5 = 2
                    binding.taco5.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state5 == 2) {
                    state5 = 3
                    binding.taco5.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state5 == 3) {
                    state5 = 4
                    binding.taco5.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state5 == 4) {
                    //잘 구워짐
                    state5 = 0
                    taco_container++
                    binding.taco5.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {
                    state5 = 0
                    binding.taco5.setImageResource(R.drawable.daco0)
                }
            }
        }.start()

        Thread() {
            binding.taco6.setOnClickListener() {
                if (tool == 1 && state6 == 0) {
                    state6 = 1
                    gone6()
                    binding.taco6.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state6 == 1) {
                    state6 = 2
                    binding.taco6.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state6 == 2) {
                    state6 = 3
                    binding.taco6.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state6 == 3) {
                    state6 = 4
                    binding.taco6.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state6 == 4) {
                    //잘 구워짐
                    state6 = 0
                    taco_container++
                    binding.taco6.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {
                    state6 = 0
                    binding.taco6.setImageResource(R.drawable.daco0)
                }
            }
        }.start()

        Thread() {
            binding.taco7.setOnClickListener() {
                if (tool == 1 && state7 == 0) {
                    state7 = 1
                    gone7()
                    binding.taco7.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state7 == 1) {
                    state7 = 2
                    binding.taco7.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state7 == 2) {
                    state7 = 3
                    binding.taco7.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state7 == 3) {
                    state7 = 4
                    binding.taco7.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state7 == 4) {
                    //잘 구워짐
                    state7 = 0
                    taco_container++
                    binding.taco7.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {
                    state7 = 0
                    binding.taco7.setImageResource(R.drawable.daco0)
                }
            }
        }.start()

        Thread() {
            binding.taco8.setOnClickListener() {
                if (tool == 1 && state8 == 0) {
                    state8 = 1
                    gone8()
                    binding.taco8.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state8 == 1) {
                    state8 = 2
                    binding.taco8.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state8 == 2) {
                    state8 = 3
                    binding.taco8.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state8 == 3) {
                    state8 = 4
                    binding.taco8.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state8 == 4) {
                    //잘 구워짐
                    state8 = 0
                    taco_container++
                    binding.taco8.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {
                    state8 = 0
                    binding.taco8.setImageResource(R.drawable.daco0)
                }
            }
        }.start()

        Thread() {
            binding.taco9.setOnClickListener() {
                if (tool == 1 && state9 == 0) {
                    state9 = 1
                    gone9()
                    binding.taco9.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state9 == 1) {
                    state9 = 2
                    binding.taco9.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state9 == 2) {
                    state9 = 3
                    binding.taco9.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state9 == 3) {
                    state9 = 4
                    binding.taco9.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state9 == 4) {
                    //잘 구워짐
                    state9 = 0
                    taco_container++
                    binding.taco9.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {
                    state9 = 0
                    binding.taco9.setImageResource(R.drawable.daco0)
                }
            }
        }.start()

        Thread() {
            binding.taco10.setOnClickListener() {
                if (tool == 1 && state10 == 0) {
                    state10 = 1
                    gone10()
                    binding.taco10.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state10 == 1) {
                    state10 = 2
                    binding.taco10.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state10 == 2) {
                    state10 = 3
                    binding.taco10.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state10 == 3) {
                    state10 = 4
                    binding.taco10.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state10 == 4) {
                    //잘 구워짐
                    state10 = 0
                    taco_container++
                    binding.taco10.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {
                    state10 = 0
                    binding.taco10.setImageResource(R.drawable.daco0)
                }
            }
        }.start()

        Thread() {
            binding.taco11.setOnClickListener() {
                if (tool == 1 && state11 == 0) {
                    state11 = 1
                    gone11()
                    binding.taco11.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state11 == 1) {
                    state11 = 2
                    binding.taco11.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state11 == 2) {
                    state11 = 3
                    binding.taco11.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state11 == 3) {
                    state11 = 4
                    binding.taco11.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state11 == 4) {
                    //잘 구워짐
                    state11 = 0
                    taco_container++
                    binding.taco11.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {
                    state11 = 0
                    binding.taco11.setImageResource(R.drawable.daco0)
                }
            }
        }.start()

        Thread() {
            binding.taco12.setOnClickListener() {
                if (tool == 1 && state12 == 0) {
                    state12 = 1
                    gone12()
                    binding.taco12.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state12 == 1) {
                    state12 = 2
                    binding.taco12.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state12 == 2) {
                    state12 = 3
                    binding.taco12.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state12 == 3) {
                    state12 = 4
                    binding.taco12.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state12 == 4) {
                    //잘 구워짐
                    state12 = 0
                    taco_container++
                    binding.taco12.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {
                    state12 = 0
                    binding.taco12.setImageResource(R.drawable.daco0)
                }
            }
        }.start()

        Thread() {
            binding.taco13.setOnClickListener() {
                if (tool == 1 && state13 == 0) {
                    state13 = 1
                    gone13()
                    binding.taco13.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state13 == 1) {
                    state13 = 2
                    binding.taco13.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state13 == 2) {
                    state13 = 3
                    binding.taco13.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state13 == 3) {
                    state13 = 4
                    binding.taco13.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state13 == 4) {
                    //잘 구워짐
                    state13 = 0
                    taco_container++
                    binding.taco13.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {
                    state13 = 0
                    binding.taco13.setImageResource(R.drawable.daco0)
                }
            }
        }.start()

        Thread() {
            binding.taco14.setOnClickListener() {
                if (tool == 1 && state14 == 0) {
                    state14 = 1
                    gone14()
                    binding.taco14.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state14 == 1) {
                    state14 = 2
                    binding.taco14.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state14 == 2) {
                    state14 = 3
                    binding.taco14.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state14 == 3) {
                    state14 = 4
                    binding.taco14.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state14 == 4) {
                    //잘 구워짐
                    state14 = 0
                    taco_container++
                    binding.taco14.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {
                    state14 = 0
                    binding.taco14.setImageResource(R.drawable.daco0)
                }
            }
        }.start()

        Thread() {
            binding.taco15.setOnClickListener() {
                if (tool == 1 && state15 == 0) {
                    state15 = 1
                    gone15()
                    binding.taco15.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state15 == 1) {
                    state15 = 2
                    binding.taco15.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state15 == 2) {
                    state15 = 3
                    binding.taco15.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state15 == 3) {
                    state15 = 4
                    binding.taco15.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state15 == 4) {
                    //잘 구워짐
                    state15 = 0
                    taco_container++
                    binding.taco15.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {
                    state15 = 0
                    binding.taco15.setImageResource(R.drawable.daco0)
                }
            }
        }.start()

        Thread() {
            binding.taco16.setOnClickListener() {
                if (tool == 1 && state16 == 0) {
                    state16 = 1
                    gone16()//
                    binding.taco16.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state16 == 1) {
                    state16 = 2
                    binding.taco16.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state16 == 2) {
                    state16 = 3
                    binding.taco16.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state16 == 3) {
                    state16 = 4
                    binding.taco16.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state16 == 4) {
                    //잘 구워짐

                    state16 = 0
                    taco_container++
                    binding.taco16.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {
                    state16 = 0
                    binding.taco16.setImageResource(R.drawable.daco0)
                }
            }
        }.start()

        Thread() {
            binding.taco1.setOnClickListener() {
                if (tool == 1 && state1 == 0) {
                    state1 = 1
                    gone1()
                    binding.taco1.setImageResource(R.drawable.daco1)
                } else if (tool == 2 && state1 == 1) {
                    state1 = 2
                    binding.taco1.setImageResource(R.drawable.daco2)
                } else if (tool == 3 && state1 == 2) {
                    state1 = 3
                    binding.taco1.setImageResource(R.drawable.daco3)
                } else if (tool == 4 && state1 == 3) {
                    state1 = 4
                    binding.taco1.setImageResource(R.drawable.daco4)
                } else if (tool == 3 && state1 == 4) { //잘 구워짐
                    //콘테이너에 옮겨짐
                    //postDelayed break

                    state1 = 0

                    taco_container++
                    binding.taco1.setImageResource(R.drawable.daco0)
                    taco()
                } else if (tool == 5) {

                    state1 = 0

                    binding.taco1.setImageResource(R.drawable.daco0)
                }
            }
        }.start()



    }





    //탄탕

    private fun gone1() {
        Thread() {
            for (i in 0..20) {
                val timeset1=i
                Thread.sleep(1000)
                if(timeset1==20){
                    Log.d("1",timeset1.toString())
                    state1=5
                    handler.post(){
                        binding.taco1.setImageResource(R.drawable.daco5)//탐
                    }
                }else if(state1==0){
                    break
                }
            }
        }.start()
    }



    private fun gone2(){
        Thread() {
            for (i in 0..20) {
                val timeset2 =i
                Thread.sleep(1000)
                if(timeset2==20){
                    Log.d("2",timeset2.toString())
                    state2=5
                    handler.post(){
                        binding.taco2.setImageResource(R.drawable.daco5)//탐
                    }
                }else if(state2==0){
                    break
                }
            }
        }.start()

    }


    private fun gone3(){
        Thread() {
            for (i in 0..20) {
                val timeset3 =i
                Thread.sleep(1000)
                if(timeset3==20){
                    Log.d("3",timeset3.toString())
                    state3=5
                    handler.post(){
                        binding.taco3.setImageResource(R.drawable.daco5)//탐
                    }
                }else if(state3==0){
                    break
                }
            }
        }.start()
    }


    private fun gone4(){
        Thread() {
            for (i in 0..20) {
                val timeset4 =i
                Thread.sleep(1000)
                if(timeset4==20){
                    Log.d("4",timeset4.toString())
                    state4=5
                    handler.post(){
                        binding.taco4.setImageResource(R.drawable.daco5)//탐
                    }
                }else if(state4==0){
                    break
                }
            }
        }.start()
    }

    private fun gone5(){
        Thread() {
            for (i in 0..20) {
                val timeset5 =i
                Thread.sleep(1000)
                if(timeset5==20){
                    Log.d("5",timeset5.toString())
                    state5=5
                    handler.post(){
                        binding.taco5.setImageResource(R.drawable.daco5)//탐
                    }
                }else if(state5==0){
                    break
                }
            }
        }.start()
    }

    private fun gone6(){
        Thread() {
            for (i in 0..20) {
                val timeset6 =i
                Thread.sleep(1000)
                if(timeset6==20){
                    Log.d("6",timeset6.toString())
                    state6=5
                    handler.post(){
                        binding.taco6.setImageResource(R.drawable.daco5)//탐
                    }
                }else if(state6==0){
                    break
                }
            }
        }.start()
    }

    private fun gone7(){
        Thread() {
            for (i in 0..20) {
                val timeset7 =i
                Thread.sleep(1000)
                if(timeset7==20){
                    Log.d("7",timeset7.toString())
                    state7=5
                    handler.post(){
                        binding.taco7.setImageResource(R.drawable.daco5)//탐
                    }
                }else if(state7==0){
                    break
                }
            }
        }.start()
    }

    private fun gone8(){
        Thread() {
            for (i in 0..20) {
                val timeset8 =i
                Thread.sleep(1000)
                if(timeset8==20){
                    Log.d("8",timeset8.toString())
                    state8=5
                    handler.post(){
                        binding.taco8.setImageResource(R.drawable.daco5)//탐
                    }
                }else if(state8==0){
                    break
                }
            }
        }.start()
    }

    private fun gone9(){
        Thread() {
            for (i in 0..20) {
                val timeset9 =i
                Thread.sleep(1000)
                if(timeset9==20){
                    Log.d("9",timeset9.toString())
                    state9=5
                    handler.post(){
                        binding.taco9.setImageResource(R.drawable.daco5)//탐
                    }
                }else if(state9==0){
                    break
                }
            }
        }.start()

    }
    private fun gone10(){
        Thread() {
            for (i in 0..20) {
                val timeset10 =i
                Thread.sleep(1000)
                if(timeset10==20){
                    Log.d("10",timeset10.toString())
                    state10=5
                    handler.post(){
                        binding.taco10.setImageResource(R.drawable.daco5)//탐
                    }
                }else if(state10==0){
                    break
                }
            }
        }.start()

    }


    private fun gone11(){
        Thread() {
            for (i in 0..20) {
                val timeset11 =i
                Thread.sleep(1000)
                if(timeset11==20){
                    Log.d("11",timeset11.toString())
                    state11=5
                    handler.post(){
                        binding.taco11.setImageResource(R.drawable.daco5)//탐
                    }
                }else if(state11==0){
                    break
                }
            }
        }.start()
    }


    private fun gone12(){
        Thread() {
            for (i in 0..20) {
                val timeset12 =i
                Thread.sleep(1000)
                if(timeset12==20){
                    Log.d("12",timeset12.toString())
                    state12=5
                    handler.post(){
                        binding.taco12.setImageResource(R.drawable.daco5)//탐
                    }
                }else if(state12==0){
                    break
                }
            }
        }.start()
    }

    private fun gone13(){
        Thread() {
            for (i in 0..20) {
                val timeset13 =i
                Thread.sleep(1000)
                if(timeset13==20){
                    Log.d("13",timeset13.toString())
                    state13=5
                    handler.post(){
                        binding.taco13.setImageResource(R.drawable.daco5)//탐
                    }
                }else if(state13==0){
                    break
                }
            }
        }.start()
    }

    private fun gone14(){
        Thread() {
            for (i in 0..20) {
                val timeset14 =i
                Thread.sleep(1000)
                if(timeset14==20){
                    Log.d("14",timeset14.toString())
                    state14=5
                    handler.post(){
                        binding.taco14.setImageResource(R.drawable.daco5)//탐
                    }
                }else if(state14==0){
                    break
                }
            }
        }.start()
    }

    private fun gone15(){
        Thread() {
            for (i in 0..20) {
                val timeset15 =i
                Thread.sleep(1000)//handler
                if(timeset15==20){
                    Log.d("15",timeset15.toString())
                    state15=5
                    handler.post(){
                        binding.taco15.setImageResource(R.drawable.daco5)//탐
                    }
                }else if(state15==0){
                    break
                }
            }
        }.start()
    }

    private fun gone16() {
        Thread() {
            for (i in 0..20) {
                val timeset16 = i
                Thread.sleep(1000)
                if (timeset16 == 20) {
                    Log.d("16", timeset16.toString())
                    state16 = 5
                    handler.post() {
                        binding.taco16.setImageResource(R.drawable.daco5)//탐
                    }
                } else if (state16 == 0) {
                    break
                }
            }
        }.start()
    }





    //버튼리셋
    private fun reset() {
        binding.flour.setImageResource(R.drawable.flour)
        binding.octo.setImageResource(R.drawable.octo)
        binding.pin.setImageResource(R.drawable.pin)
        binding.oil.setImageResource(R.drawable.oil)
        binding.hand.setImageResource(R.drawable.hand)
    }

    //타코콘테이너
    private fun taco() {
        if(time>0) {
            if (taco_container == 1 || taco_container % 3 == 1) {
                if (taco_container >= 4) {
                    binding.final3.setImageBitmap(null)
                    binding.final2.setImageBitmap(null)
                }
                binding.final1.setImageResource(R.drawable.taco)
            } else if (taco_container == 2 || taco_container % 3 == 2) {
                binding.final2.setImageResource(R.drawable.taco)
            } else if (taco_container == 3 || taco_container % 3 == 0) {

                binding.final3.setImageResource(R.drawable.taco)

                    handler.postDelayed({
                    binding.final1.setImageBitmap(null)
                    binding.final2.setImageBitmap(null)
                    binding.final3.setImageBitmap(null)
                        score += 30
                    binding.scoreNum.setText(score.toString())},
                            100)


            }
        }
    }


    override fun onPause() {
        super.onPause()
    }


}
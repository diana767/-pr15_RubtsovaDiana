package com.example.geoquizrubtsova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity2 : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var textView: TextView
    data class cls( val quustion: String, val answer: Boolean)
    private var index=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
        textView = findViewById(R.id.text_view)
        trueButton.setOnClickListener {
            checkAnswer(true)
        }
        falseButton.setOnClickListener {
            checkAnswer(false)
        }
        initializeQuestionsAndAnswers()
        setQuestion()
    }
    private lateinit var list: List<cls>
  private fun initializeQuestionsAndAnswers(){
      list= listOf(
    cls(getString(R.string.string_text),true),
          cls(getString(R.string.string_text2),true),
    cls(getString(R.string.string_text3),true),
          cls(getString(R.string.string_text4),false),
    cls(getString(R.string.string_text5),false),
          )
  }

private fun setQuestion(){
    val curentQuestion=list[index]
    textView.text=curentQuestion.quustion
}
private fun checkAnswer(userAnswer:Boolean){
    val curentQuestion =list[index]
    if (userAnswer==curentQuestion.answer){
        val toast=Toast.makeText(this,"Верно!",Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP,0,0)
        toast.show()
    }else
    {        val toast=Toast.makeText(this,"Не верно!",Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP,0,0)
        toast.show()
    }
    index++
    if(index<list.size){
        setQuestion()
    }else
    {        Toast.makeText(this,R.string.end,Toast.LENGTH_SHORT).show()
        application.onTerminate()    }
}




}
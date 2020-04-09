package com.diki.idn.basictype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val intNumbers: Int = 5
    private val doubleNumbers: Double = 7.25
    private val longNumbers: Long = 7L // lebih kecil dr Int
    private val floatNumbers: Float = 7.25F // lebih besar dari double, digunakan untuk koma

//    private var result: Long? = null

    private var intFirstNumbers: Int = 12
    private var intSecondNumbers: Int = 20

    private var doubleFirstNumbers: Double = 7.25
    private var doubleSecondNumbers: Double = 29.0

    private var longFirstNumbers: Long = 7
    private var longSecondNumbers: Long = 13

    private var floatFirstNumbers: Float = 14.25F
    private var result: Float? = null

//    private var result: Double? = null

//    private var result: Int? = null

//    private var resultint: Int? = null
//    private var resultdouble: Double? = null
//    private var resultlong: Long? = null
//    private var resultfloat: Float? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        intFirstNumbers = 12
        intSecondNumbers = 20

        doubleFirstNumbers = 7.25
        doubleSecondNumbers = 29.0

        longFirstNumbers = 7
        longSecondNumbers = 13

        floatFirstNumbers = 14.25F

        result = intFirstNumbers.toFloat() * intFirstNumbers.toFloat()
        hasil.setText(result.toString())

        result = intSecondNumbers.toFloat() * intSecondNumbers.toFloat()
        hasil2.setText(result.toString())

        result = doubleFirstNumbers.toFloat() * doubleFirstNumbers.toFloat()
        hasil3.setText(result.toString())

        result = doubleSecondNumbers.toFloat() * doubleSecondNumbers.toFloat()
        hasil4.setText(result.toString())

        result = longFirstNumbers.toFloat() * longFirstNumbers.toFloat()
        hasil5.setText(result.toString())

        result = longSecondNumbers.toFloat() * longSecondNumbers.toFloat()
        hasil6.setText(result.toString())

        result = floatFirstNumbers * floatFirstNumbers
        hasil7.setText(result.toString())

//        result = intNumbers.toLong() * intNumbers.toLong()
//        hasil.setText(result.toString())
//
//        result = doubleNumbers.toLong() * doubleNumbers.toLong()
//        hasil2.setText(result.toString())
//
//        result = longNumbers.toLong() * longNumbers.toLong()
//        hasil3.setText(result.toString())
//
//        result = floatNumbers.toLong() * floatNumbers.toLong()
//        hasil4.setText(result.toString())

//        result = intNumbers.toDouble() * intNumbers.toDouble()
//        hasil.setText(result.toString())
//
//        result = doubleNumbers.toDouble() * doubleNumbers.toDouble()
//        hasil2.setText(result.toString())
//
//        result = longNumbers.toDouble() * longNumbers.toDouble()
//        hasil3.setText(result.toString())
//
//        result = floatNumbers.toDouble() * floatNumbers.toDouble()
//        hasil4.setText(result.toString())


//        result = intNumbers.toInt() * intNumbers.toInt()
//        hasil.setText(result.toString())
//
//        result = doubleNumbers.toInt() * doubleNumbers.toInt()
//        hasil2.setText(result.toString())
//
//        result = longNumbers.toInt() * longNumbers.toInt()
//        hasil3.setText(result.toString())
//
//        result = floatNumbers.toInt() * floatNumbers.toInt()
//        hasil4.setText(result.toString())

//        resultint = intNumbers * intNumbers
//        hasil.setText(resultint.toString())
//
//        resultdouble = doubleNumbers * doubleNumbers
//        hasil2.setText(resultdouble.toString())
//
//        resultlong = longNumbers * longNumbers
//        hasil3.setText(resultlong.toString())
//
//        resultfloat = floatNumbers * floatNumbers
//        hasil4.setText(resultfloat.toString())
    }
}

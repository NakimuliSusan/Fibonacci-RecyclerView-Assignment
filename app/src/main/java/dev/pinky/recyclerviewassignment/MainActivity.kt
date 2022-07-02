package dev.pinky.recyclerviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.pinky.recyclerviewassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castNumbers()
    }

    fun castNumbers () {
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter = NamesRecyclerViewAdapter(fibonacciGenerator(100))

    }

    fun fibonacciGenerator (n:Int):List<Int> {
        var numbersList = ArrayList<Int>()
        var number1 = 0
        var number2 = 1


        for (i in 1..n){
            var sum = number1 + number2
            number1 = number2
            number2 = sum
            numbersList.add(sum)
        }
        return numbersList
    }

}
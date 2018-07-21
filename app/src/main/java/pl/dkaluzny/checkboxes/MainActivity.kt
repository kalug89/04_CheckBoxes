package pl.dkaluzny.checkboxes

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onCheckBoxClicked(view: View) {
        view as CheckBox // cast our view as a Checkbox object or type or View
        var isChecked: Boolean = view.isChecked

        when (view.id) {
            R.id.checkVeggies -> if (isChecked) {
                Log.wtf("Veggies", "IsChecked")
            } else {
                Log.wtf("Veggies", "NoChecked")
            }
            R.id.checkFruit -> if (isChecked) {
                Log.wtf("Fruit", "IsChecked")
            } else {
                Log.wtf("Fruit", "NoChecked")
            }
            R.id.checkMeat -> if (isChecked) {
                Log.wtf("Meat", "IsChecked")
            } else {
                Log.wtf("Meat", "NoChecked")
            }
        }
    }
}
//        Log.wtf("Checks", "Checkbox CLicked")

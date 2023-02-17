package salas.ian.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnColdDrinks: Button = findViewById<Button>(R.id.button_cold_drinks)
        var btnHotDrinks: Button = findViewById<Button>(R.id.button_hot_drinks)
        var btnSweets: Button = findViewById<Button>(R.id.button_sweets)
        var btnSalties: Button = findViewById<Button>(R.id.button_salties)
        var btnCombos: Button = findViewById<Button>(R.id.button_combos)
        var btnCustom: Button = findViewById<Button>(R.id.button_custom)

        btnColdDrinks.setOnClickListener {
            var intent:Intent = Intent(this@MenuActivity,ProductsActivity::class.java)
            intent.putExtra("key","cold")
            startActivity(intent)
        }
        btnHotDrinks.setOnClickListener {
            var intent:Intent = Intent(this@MenuActivity,ProductsActivity::class.java)
            intent.putExtra("key","hot")
            startActivity(intent)
        }
        btnSweets.setOnClickListener {
            var intent:Intent = Intent(this,ProductsActivity::class.java)
            intent.putExtra("key","sweet")
            startActivity(intent)
        }
        btnSalties.setOnClickListener {
            var intent:Intent = Intent(this,ProductsActivity::class.java)
            intent.putExtra("key","salt")
            startActivity(intent)
        }
        btnCombos.setOnClickListener {
            var intent:Intent = Intent(this,ProductsActivity::class.java)
            startActivity(intent)
        }
        btnCustom.setOnClickListener {
            var intent:Intent = Intent(this,ProductsActivity::class.java)
            startActivity(intent)
        }
    }


}
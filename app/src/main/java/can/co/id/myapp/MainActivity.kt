package can.co.id.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_btn_pindah.setOnClickListener {

            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity, SecondActivity::class.java)

            //menjalankan intent
            startActivity(go)
        }
    }
}
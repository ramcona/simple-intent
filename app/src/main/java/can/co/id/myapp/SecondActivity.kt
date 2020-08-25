package can.co.id.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        supportActionBar?.title = "Aktifitas Saya" //mengganti judul  ActionBar

        /*mulai menambahkan icon pada ActionBar*/
        supportActionBar?.setLogo(R.drawable.ic_launcher_foreground)
        supportActionBar?.setDisplayUseLogoEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        /*selesai menambahkan icon pada ActionBar*/

        supportActionBar?.subtitle = "Aktifitas 14 April 2020" // menambahkan subjudul

        supportActionBar?.setDisplayHomeAsUpEnabled(true) // menambahkan action kembali
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}
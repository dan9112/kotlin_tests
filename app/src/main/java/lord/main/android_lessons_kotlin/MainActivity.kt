package lord.main.android_lessons_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import lord.main.android_lessons_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            buttonPlay.setOnClickListener {
                startService(
                    Intent(
                        this@MainActivity,
                        PlaySongService::class.java
                    )
                )
            }
            buttonStop.setOnClickListener {
                stopService(
                    Intent(
                        this@MainActivity,
                        PlaySongService::class.java
                    )
                )
            }
        }
    }
}

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.thethirdlabactivities.R
import com.example.yourappname.DisplayDataActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit: Button = findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val editTextName: EditText = findViewById(R.id.editTextName)
            val userName = editTextName.text.toString()

            // Создаем Intent для перехода к второй активности
            val intent = Intent(this, DisplayDataActivity::class.java)

            // Передаем данные через Intent
            intent.putExtra("USERNAME", userName)

            // Запускаем вторую активность
            startActivity(intent)
        }
    }
}
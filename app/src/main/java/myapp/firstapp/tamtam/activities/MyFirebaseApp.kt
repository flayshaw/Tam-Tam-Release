package myapp.firstapp.tamtam.activities

import android.app.Application
import com.google.firebase.database.FirebaseDatabase

class MyFirebaseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        FirebaseDatabase.getInstance().setPersistenceEnabled(true)
        FirebaseDatabase.getInstance().reference.keepSynced(true)
    }
}
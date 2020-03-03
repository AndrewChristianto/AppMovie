package com.skylake.mov.signin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.skylake.mov.R
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener



class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("message")

        myRef.setValue("Hello, World!")

        // Read from the database
        // Read from the database
        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) { // This method is called once with the initial value and again
// whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)
                Log.d("Test", "Value is:" + value!!)
            }

            override fun onCancelled(error: DatabaseError) { // Failed to read value
                Log.w("Test", "Failed to read value.", error.toException())
            }
        })
    }
}

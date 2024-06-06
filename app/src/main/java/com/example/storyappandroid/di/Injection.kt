package com.example.storyappandroid.di

import android.content.Context
import com.example.storyappandroid.data.UserRepository
import com.example.storyappandroid.data.pref.UserPreference
import com.example.storyappandroid.data.pref.dataStore

object Injection {
    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        return UserRepository.getInstance(pref)
    }
}
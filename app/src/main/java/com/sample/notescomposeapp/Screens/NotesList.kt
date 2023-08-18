package com.sample.notescomposeapp.Screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sample.notescomposeapp.model.Note

@Composable
fun NotesList(notesList: List<Note>)
{
    LazyColumn {
        items(notesList)
        {
            Text(text = "Title: ${it.title}")
            Text(text = "Description: ${it.description}")
            Divider(modifier = Modifier.padding(vertical = 8.dp))
        }
    }
}
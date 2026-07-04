package com.example.rev_todolist

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rev_todolist.ui.theme.TodoViewModel
import java.text.SimpleDateFormat

@RequiresApi(Build.VERSION_CODES.O)
@Composable

fun TodoListPage(todoviewModel: TodoViewModel){

    val todolist by todoviewModel.todolist.observeAsState(initial = emptyList())

    var input by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(8.dp)
    ) {

        Spacer(modifier = Modifier.height(4  .dp))

        Row{

            OutlinedTextField(value = input, onValueChange = {input = it} , modifier = Modifier.weight(1f))

            Button(onClick = { todoviewModel.addTodo(input)
            input = "" } ) {
                Text(text = "Add")
            }

        }


            LazyColumn(
                content = {
                    itemsIndexed(todolist) { index: Int, item: Todo ->
                        TododItem(item, todoviewModel)
                    }
                }
            )

    }
}


@Composable
fun TododItem(item : Todo , todoviewModel: TodoViewModel){

        Row(
            modifier = Modifier
                .fillMaxHeight()
                .padding(8.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(MaterialTheme.colorScheme.primary)
                .padding(16.dp)
        ){
                Column(
                    modifier = Modifier.weight(1f)
                ){

                    Text(text = SimpleDateFormat("yyyy-MM-dd").format(item.createdAt) ,
                        fontSize = 18.sp ,
                        color = Color.Black)

                    Spacer(modifier = Modifier.height(1.dp))
                    Text(text = item.title , fontSize = 18.sp ,
                        color = Color.Black)
                }

            IconButton(onClick = { todoviewModel.deleteTodo(item.id) }) {
                Icon(painter = painterResource(id = R.drawable.baseline_delete_24), contentDescription = "Delete")
            }
        }

}

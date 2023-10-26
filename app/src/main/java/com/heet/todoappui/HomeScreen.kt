package com.heet.todoappui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.heet.todoappui.ui.theme.BackgroundColor
import com.heet.todoappui.ui.theme.CardColor
import com.heet.todoappui.ui.theme.ComponentColor1
import com.heet.todoappui.ui.theme.ComponentColor2
import com.heet.todoappui.ui.theme.ComponentColor3
import com.heet.todoappui.ui.theme.HighBackgroundColor
import com.heet.todoappui.ui.theme.MediumBackgroundColor
import com.heet.todoappui.ui.theme.SecondaryColor
import com.heet.todoappui.ui.theme.TextColor
import com.heet.todoappui.ui.theme.ThinTextColor

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    Scaffold(
        modifier = Modifier
            .background(BackgroundColor)
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(BackgroundColor)
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding()
        ) {
            LazyColumn(
                modifier = Modifier
                    .padding(start = 18.dp, end = 18.dp, top = 8.dp, bottom = 82.dp)
                    .fillMaxSize()
                    .background(Color.Transparent)

            ) {
                item {
                    val helloText = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = ThinTextColor,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Light
                            )
                        ) {
                            append("Hello")
                        }
                        withStyle(
                            style = SpanStyle(
                                color = TextColor,
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                        ) {
                            append(" Heet 👋")
                        }
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        var isClicked by remember {
                            mutableStateOf(false)
                        }
                        Text(text = helloText)
                        IconButton(
                            onClick = {
                                isClicked = !isClicked
                            }, modifier = Modifier
                                .clip(CircleShape)
                                .background(CardColor)
                        ) {
                            if (isClicked) {
                                Icon(
                                    painter = painterResource(id = R.drawable.bell_filled),
                                    contentDescription = "notification",
                                    tint = SecondaryColor
                                )
                            } else {
                                Icon(
                                    painter = painterResource(id = R.drawable.bell_light),
                                    contentDescription = "notification",
                                    tint = Color.White
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "Manage Your\nDaily Task",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 32.sp,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
//                        .background(Color.White)
                        ,
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Box {
                            ElevatedCard(
                                shape = RoundedCornerShape(16.dp),
                                colors = CardDefaults.elevatedCardColors(
                                    containerColor = ComponentColor1
                                ),
                                modifier = Modifier
//                                .height(intrinsicSize = IntrinsicSize.Max)
//                                .heightIn()
                                    .fillMaxWidth(0.4f)
                                    .shadow(
                                        elevation = 50.dp,
                                        shape = CircleShape,
                                        ambientColor = ComponentColor1,
                                        spotColor = ComponentColor1,
                                        clip = false
                                    ),


                                ) {
                                Column(
                                    modifier = Modifier
                                        .padding(
                                            top = 30.dp,
                                            start = 20.dp,
                                            end = 20.dp,
                                            bottom = 20.dp
                                        ), horizontalAlignment = Alignment.Start,
                                    verticalArrangement = Arrangement.SpaceEvenly
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.color_pallate),
                                        contentDescription = "img",
                                        modifier = Modifier
                                            .padding(bottom = 8.dp)
                                            .size(60.dp)
                                    )
                                    Spacer(modifier = Modifier.height(5.dp))

                                    Column(modifier = Modifier) {
                                        Text(
                                            text = "Mobile",
                                            color = Color.Black,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 24.sp
                                        )
                                        Spacer(modifier = Modifier.height(3.dp))
                                        Text(
                                            text = "6 Tasks",
                                            color = Color.Black,
                                            fontWeight = FontWeight.Thin,
                                            fontSize = 16.sp
                                        )
                                    }
                                }
                            }
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Column(verticalArrangement = Arrangement.SpaceBetween) {
                            ElevatedCard(
                                shape = RoundedCornerShape(16.dp),
                                elevation = CardDefaults.elevatedCardElevation(
                                    defaultElevation = 8.dp
                                ),
                                colors = CardDefaults.elevatedCardColors(
                                    containerColor = ComponentColor3
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .shadow(
                                        elevation = 20.dp,
                                        shape = CircleShape,
                                        ambientColor = ComponentColor3,
                                        spotColor = ComponentColor1,
                                        clip = false
                                    )
                            ) {
                                Row(
                                    modifier = Modifier
                                        .padding(
                                            top = 20.dp,
                                            start = 10.dp,
                                            end = 15.dp,
                                            bottom = 20.dp
                                        )
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.color_pallate),
                                        contentDescription = "img",
                                        modifier = Modifier
                                            .padding(bottom = 8.dp)
                                            .size(60.dp)
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Column {
                                        Text(
                                            text = "Wireframe",
                                            color = Color.Black,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 20.sp
                                        )
                                        Spacer(modifier = Modifier.height(3.dp))
                                        Text(
                                            text = "12 Tasks",
                                            color = Color.Black,
                                            fontWeight = FontWeight.Thin,
                                            fontSize = 16.sp
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            ElevatedCard(
                                shape = RoundedCornerShape(16.dp),
                                elevation = CardDefaults.elevatedCardElevation(
                                    defaultElevation = 8.dp
                                ),
                                colors = CardDefaults.elevatedCardColors(
                                    containerColor = ComponentColor2
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .shadow(
                                        elevation = 20.dp,
                                        shape = CircleShape,
                                        ambientColor = ComponentColor2,
                                        spotColor = ComponentColor1,
                                        clip = false
                                    )
                            ) {
                                Row(
                                    modifier = Modifier
                                        .padding(
                                            top = 20.dp,
                                            start = 10.dp,
                                            end = 15.dp,
                                            bottom = 20.dp
                                        )
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.color_pallate),
                                        contentDescription = "img",
                                        modifier = Modifier
                                            .padding(bottom = 8.dp)
                                            .size(60.dp)
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Column {
                                        Text(
                                            text = "Website",
                                            color = Color.Black,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 20.sp
                                        )
                                        Spacer(modifier = Modifier.height(3.dp))
                                        Text(
                                            text = "5 Tasks",
                                            color = Color.Black,
                                            fontWeight = FontWeight.Thin,
                                            fontSize = 16.sp
                                        )
                                    }
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = "Ongoing",
                            fontWeight = FontWeight.ExtraBold,
                            color = TextColor,
                            fontSize = 30.sp
                        )

                        Text(text = "See All", color = SecondaryColor, fontSize = 18.sp)
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = CardColor)
                    ) {
                        Column(
                            modifier = Modifier.padding(
                                top = 20.dp,
                                end = 16.dp,
                                start = 20.dp,
                                bottom = 20.dp
                            )
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "High",
                                    color = TextColor,
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(20.dp))
                                        .background(HighBackgroundColor)
                                        .padding(horizontal = 12.dp, vertical = 8.dp),
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 16.sp
                                )
                                Text(text = "82%", color = TextColor, fontSize = 16.sp)
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Salon App Wireframe",
                                color = Color.White,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 22.sp
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Row {
                                Icon(
                                    painter = painterResource(id = R.drawable.clock),
                                    contentDescription = "Time",
                                    tint = ThinTextColor,
                                    modifier = Modifier.size(28.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))

                                Text(
                                    text = "10:00 AM - 6:00 PM",
                                    color = ThinTextColor,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 20.sp
                                )
                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            val dueDate = buildAnnotatedString {
                                withStyle(
                                    SpanStyle(
                                        color = ThinTextColor,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 18.sp
                                    )
                                ) {
                                    append("Due Date: ")
                                }

                                withStyle(
                                    SpanStyle(
                                        color = TextColor,
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Normal
                                    )
                                ) {
                                    append("August 25")
                                }
                            }

                            Text(dueDate)
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = CardColor)
                    ) {
                        Column(
                            modifier = Modifier.padding(
                                top = 20.dp,
                                end = 16.dp,
                                start = 20.dp,
                                bottom = 20.dp
                            )
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "Medium",
                                    color = TextColor,
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(20.dp))
                                        .background(MediumBackgroundColor)
                                        .padding(horizontal = 12.dp, vertical = 8.dp),
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 16.sp
                                )
                                Text(text = "61%", color = TextColor, fontSize = 16.sp)
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Marketing App",
                                color = Color.White,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 22.sp
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Row {
                                Icon(
                                    painter = painterResource(id = R.drawable.clock),
                                    contentDescription = "Time",
                                    tint = ThinTextColor,
                                    modifier = Modifier.size(28.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))

                                Text(
                                    text = "10:00 AM - 6:00 PM",
                                    color = ThinTextColor,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 20.sp
                                )
                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            val dueDate = buildAnnotatedString {
                                withStyle(
                                    SpanStyle(
                                        color = ThinTextColor,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 18.sp
                                    )
                                ) {
                                    append("Due Date: ")
                                }

                                withStyle(
                                    SpanStyle(
                                        color = TextColor,
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Normal
                                    )
                                ) {
                                    append("August 25")
                                }
                            }

                            Text(dueDate)
                        }
                    }
                }
            }
            BottomBar(Modifier.align(Alignment.BottomCenter))
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(bottom = 35.dp)
                    .clip(CircleShape)
                    .background(SecondaryColor)
                    .align(Alignment.BottomCenter)
                    .padding(10.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "add",
                    tint = Color.Black,
                    modifier = Modifier.size(40.dp)
                )
            }
        }
    }
}

@Composable
fun BottomBar(modifier: Modifier = Modifier) {

    var navNum by remember {
        mutableStateOf(0)
    }

//    Box(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(CardColor)
                .padding(vertical = 15.dp, horizontal = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (navNum == 0) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.home_filled),
                            contentDescription = "home",
                            tint = SecondaryColor,
                            modifier = Modifier
                                .size(25.dp)
                        )
                    }

                } else {
                    IconButton(onClick = { navNum = 0 }) {
                        Icon(
                            painter = painterResource(id = R.drawable.home_light),
                            contentDescription = "home",
                            tint = ThinTextColor,
                            modifier = Modifier
                                .size(25.dp)
                        )
                    }
                }


                Spacer(modifier = Modifier.width(8.dp))
                if (navNum == 1) {

                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.calendar_filled),
                            contentDescription = "home",
                            tint = SecondaryColor,
                            modifier = Modifier.size(25.dp)
                        )
                    }
                } else {
                    IconButton(onClick = { navNum = 1 }) {
                        Icon(
                            painter = painterResource(id = R.drawable.calendar_light),
                            contentDescription = "home",
                            tint = ThinTextColor,
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (navNum == 2) {

                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.message_filled),
                            contentDescription = "home",
                            tint = SecondaryColor,
                            modifier = Modifier.size(25.dp)
                        )
                    }
                } else {
                    IconButton(onClick = { navNum = 2 }) {
                        Icon(
                            painter = painterResource(id = R.drawable.message_light),
                            contentDescription = "home",
                            tint = ThinTextColor,
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.width(8.dp))
                if (navNum == 3) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.user_filled),
                            contentDescription = "home",
                            tint = SecondaryColor,
                            modifier = Modifier.size(25.dp)
                        )
                    }
                } else {
                    IconButton(onClick = { navNum = 3 }) {
                        Icon(
                            painter = painterResource(id = R.drawable.user_light),
                            contentDescription = "home",
                            tint = ThinTextColor,
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            }
        }
//    }
}


@Preview(showBackground = true,)
@Composable
fun BottomNavPreview() {
    Box(modifier = Modifier.padding(vertical = 50.dp, horizontal = 10.dp)) {
        BottomBar(modifier=Modifier.align(Alignment.BottomCenter))
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(bottom = 35.dp)
                .clip(CircleShape)
                .background(SecondaryColor)
                .align(Alignment.BottomCenter)
                .padding(10.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "add",
                tint = Color.Black,
                modifier = Modifier.size(40.dp)
            )
        }
    }
}

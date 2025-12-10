package vv.monika.jetpacklearn.screens

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Button

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true, showSystemUi = false)
fun MyScaffold(modifier: Modifier = Modifier) {
    var selectedItem by remember { mutableStateOf(true) }

    Scaffold(
//        top and bottom bar

        topBar = {
            TopAppBar(
//                modifier = Modifier.statusBarsPadding(),  -->status bar chhod dega

                title = { Text("Neat Roots") },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        "More Options",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                },
                actions = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        "Profile"
                    )
                    Icon(
                        imageVector = Icons.Default.Search,
                        "Search",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.DarkGray,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White
                ),

                )

        },

        bottomBar = {
//            BottomAppBar(
////                modifier = Modifier.fillMaxWidth(), -->by default max width le hi rha hai
//                containerColor = Color.DarkGray,
//                contentColor = Color.White
//            ) {
//                Icon(
//                    imageVector = Icons.Default.Home,
//                    "Home"
//                )
//                Icon(
//                    imageVector = Icons.Default.ShoppingCart,
//                    "Shopping Cart"
//                )
//                Icon(
//                    imageVector = Icons.Default.Person,
//                    "Profile"
//                )
//
//
//            }

            NavigationBar(
//                modifier = Modifier.fillMaxWidth(),
                containerColor = Color.DarkGray,
                contentColor = Color.White
            ) {
                NavigationBarItem(
                    selected = true,
                    onClick = {},
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Home,
                            "Home"
                        )
                    },
                    label = { Text("Home") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Red,
                        selectedTextColor = Color.Red,
                        indicatorColor = Color.Green,
                        unselectedIconColor = Color.Black,
                        unselectedTextColor = Color.Black,
                    )
                )
                NavigationBarItem(
                    selected = false,
                    onClick = {},
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            "Search"
                        )
                    },
                    label = { Text("Search") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        indicatorColor = Color.White,
                        unselectedIconColor = Color.Black,
                        unselectedTextColor = Color.Black,
                    )
                )
                NavigationBarItem(
                    selected = false,
                    onClick = {},
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            "Person"
                        )
                    },
                    label = { Text("Person") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        indicatorColor = Color.White,
                        unselectedIconColor = Color.Black,
                        unselectedTextColor = Color.Black,
                    )
                )
            }
        },
        floatingActionButton = {

            Button(
                onClick = {},
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color.DarkGray,
//                    contentColor = Color.White
//                ),
//                shape = RoundedCornerShape(10.dp)
            ) {

                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.wrapContentSize(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        "Add"
                    )
                    Text("Add")
                }

            }

        }


    ) { innerPadding ->
//        content

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
        ) {
            ProfileCard()
            ProfileCard()
            ProfileCard()
            ProfileCard()
            ProfileCard()
            ProfileCard()
            ProfileCard()
            ProfileCard()
            ProfileCard()
            ProfileCard()
            ProfileCard()
        }

    }

}

@Composable
fun ProfileCard(modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 4.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {

            Card(
                modifier = Modifier.size(50.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                ),
                shape = CircleShape,
            ) {
                Icon(imageVector = Icons.Default.Person, "profile Pic")

            }
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                "Item 1",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
package vv.monika.jetpacklearn.screens

import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationItemIconPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.squareup.wire.internal.newMutableMap

@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, showSystemUi = true)
@Composable

fun SimpleLazyColumn(modifier: Modifier = Modifier) {


    var selectedItem by remember { mutableStateOf(true) }

    Scaffold(
        topBar = {
            TopAppBar(
//                modifier = Modifier.statusBarsPadding(),
//                -->status bar chhod dega
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
//

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
            FloatingActionButton(
                onClick = {},
                containerColor = Color.DarkGray,
                contentColor = Color.White,
                shape = CircleShape,
                modifier = Modifier.size(60.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    "Add",
                    modifier = Modifier.size(30.dp)
                )
            }


        }


    ) { innerPadding ->
//        content
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .padding(top = 8.dp, start = 8.dp),
            verticalArrangement = Arrangement.spacedBy(9.dp)
        ) {
            items(10) { index ->
                Text(
                    text = "Item no. $index",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .background(
                            color = Color.DarkGray,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .padding(16.dp)
                )

            }

        }

    }

}

@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SimpleLazyRow() {
    Scaffold(
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
            FloatingActionButton(
                onClick = {},
                containerColor = Color.DarkGray,
                contentColor = Color.White,
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(60.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    "Add",
                    modifier = Modifier.size(30.dp)
                )
            }


        }


    ) { innerPadding ->
        LazyRow(
            modifier = Modifier
                .padding(innerPadding)
                .padding(2.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            items(10) {
                Text(
                    text = "Item $it",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .background(
                            color = Color.DarkGray,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .padding(16.dp)
                )

            }
        }

    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
//@Preview(showBackground = true, showSystemUi = true)
fun LazyColumnWithCard(modifier: Modifier = Modifier) {

    Scaffold(
        topBar = {
            TopAppBar(
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
//

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
            FloatingActionButton(
                onClick = {},
                containerColor = Color.DarkGray,
                contentColor = Color.White,
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(60.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    "Add",
                    modifier = Modifier.size(30.dp)
                )
            }


        }


    ) { innerPadding ->
//        content
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            items(10) { item ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Text(
                        "Card Item $item",
                        modifier = Modifier.padding(20.dp)
                    )
                }
            }
        }

    }


}

@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LazyRowWithCardAndImage(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
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
//

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
            FloatingActionButton(
                onClick = {},
                containerColor = Color.DarkGray,
                contentColor = Color.White,
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(60.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    "Add",
                    modifier = Modifier.size(30.dp)
                )
            }


        }


    ) { innerPadding ->
//        content
        LazyRow(
            modifier = Modifier
                .padding(innerPadding)
                .padding(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            items(10) { item ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .background(
                                    color = Color.Green,
                                    shape = CircleShape
                                )
                        )
                        Spacer(Modifier.width(8.dp))
                        Text("Card Item")
                    }

                }

//

            }
        }

    }
}

//MixedLazyList
@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MixedLazyLists(modifier: Modifier = Modifier) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Neat Roots") },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "More Options",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )

                },

                actions = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile"
                    )
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.DarkGray,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White
                )

            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = Color.DarkGray
            ) {
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Home,
                            contentDescription = "Home"
                        )
                    },
                    label = { Text("Home") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Search,
                            contentDescription = "Search"
                        )
                    },
                    label = { Text("Search") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Person,
                            contentDescription = "Person"
                        )
                    },
                    label = { Text("Person") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )

            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = Color.DarkGray,
                contentColor = Color.White,
                modifier = Modifier.size(60.dp),
                shape = CircleShape
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            items(10) { rowIndex ->
                Text(
                    "Category $rowIndex",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )

                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {

                    items(15) {
                        Box(
                            modifier = Modifier
                                .size(100.dp)
                                .background(
                                    color = Color.LightGray,
                                    shape = RoundedCornerShape(10.dp)
                                )
                        )
                    }
                }

            }
        }
    }

}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, showSystemUi = true)
fun SimpleVerticalGrid(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Neat Roots") },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "More Options",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )

                },

                actions = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile"
                    )
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.DarkGray,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White
                )

            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = Color.DarkGray
            ) {
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Home,
                            contentDescription = "Home"
                        )
                    },
                    label = { Text("Home") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Search,
                            contentDescription = "Search"
                        )
                    },
                    label = { Text("Search") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Person,
                            contentDescription = "Person"
                        )
                    },
                    label = { Text("Person") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )

            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = Color.DarkGray,
                contentColor = Color.White,
                modifier = Modifier.size(60.dp),
                shape = CircleShape
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    ) { innerPadding ->

        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(10) { index ->

                Box(
                    modifier = Modifier
                        .height(100.dp)
                        .background(
                            color = Color.LightGray,
                            shape = RoundedCornerShape(10.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text("Item $index")
                }
            }
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AdaptiveVerticalGrid(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Neat Roots") },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "More Options",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )

                },

                actions = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile"
                    )
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.DarkGray,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White
                )

            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = Color.DarkGray
            ) {
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Home,
                            contentDescription = "Home"
                        )
                    },
                    label = { Text("Home") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Search,
                            contentDescription = "Search"
                        )
                    },
                    label = { Text("Search") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Person,
                            contentDescription = "Person"
                        )
                    },
                    label = { Text("Person") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )

            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = Color.DarkGray,
                contentColor = Color.White,
                modifier = Modifier.size(60.dp),
                shape = CircleShape
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    ) { innerPadding ->

        LazyVerticalGrid(
            GridCells.Adaptive(minSize = 115.dp),
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(30) { index ->
                Box(
                    modifier = Modifier
                        .height(100.dp)
                        .background(
                            color = Color.LightGray,
                            shape = RoundedCornerShape(10.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text("Item $index")
                }
            }
        }

    }
}


@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SimpleHorizontalGrid(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Neat Roots") },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "More Options",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )

                },

                actions = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile"
                    )
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.DarkGray,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White
                )

            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = Color.DarkGray
            ) {
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Home,
                            contentDescription = "Home"
                        )
                    },
                    label = { Text("Home") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Search,
                            contentDescription = "Search"
                        )
                    },
                    label = { Text("Search") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Person,
                            contentDescription = "Person"
                        )
                    },
                    label = { Text("Person") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )

            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = Color.DarkGray,
                contentColor = Color.White,
                modifier = Modifier.size(60.dp),
                shape = CircleShape
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    ) { innerPadding ->

        LazyHorizontalGrid(
            rows = GridCells.Fixed(2),
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .height(100.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            items(20) { index ->

                Box(
                    modifier = Modifier
                        .background(
                            color = Color.LightGray,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .width(200.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Item $index",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TypesOfItems(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Neat Roots") },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "More Options",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )

                },

                actions = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile"
                    )
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.DarkGray,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White
                )

            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = Color.DarkGray
            ) {
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Home,
                            contentDescription = "Home"
                        )
                    },
                    label = { Text("Home") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Search,
                            contentDescription = "Search"
                        )
                    },
                    label = { Text("Search") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Person,
                            contentDescription = "Person"
                        )
                    },
                    label = { Text("Person") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )

            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = Color.DarkGray,
                contentColor = Color.White,
                modifier = Modifier.size(60.dp),
                shape = CircleShape
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    ) { innerPadding ->

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
//            01 -item
            LazyColumn(modifier = Modifier.padding(innerPadding)) {
                item { Text("Header") }
            }
//            02 -items
            LazyColumn(modifier = Modifier.padding(innerPadding)) {
                items(10) { index ->
                    Text("Item $index")
                }
            }

//            03list
            val names = listOf("Monika", "light", "yuchiki", "haru", "jam")

            LazyColumn(
                modifier = Modifier.padding(innerPadding)
            ) {
                items(names) { name ->
                    Text(name)
                }
            }

            LazyColumn(modifier = Modifier.padding(innerPadding)) {
                itemsIndexed(names) { index, name ->
                    Text("Name $name - Index $index")
                }
            }
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Template(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Neat Roots") },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "More Options",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )

                },

                actions = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile"
                    )
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.DarkGray,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White
                )

            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = Color.DarkGray
            ) {
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Home,
                            contentDescription = "Home"
                        )
                    },
                    label = { Text("Home") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Search,
                            contentDescription = "Search"
                        )
                    },
                    label = { Text("Search") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    icon = {
                        Icon(
                            Icons.Default.Person,
                            contentDescription = "Person"
                        )
                    },
                    label = { Text("Person") },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White,
                        selectedIconColor = Color.Black,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White
                    )

                )

            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = Color.DarkGray,
                contentColor = Color.White,
                modifier = Modifier.size(60.dp),
                shape = CircleShape
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    ) { innerPadding ->
    }

}

package vv.monika.jetpacklearn.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)

@Composable
@Preview(showBackground = true, showSystemUi = true)
private fun MyLazyApp() {
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


        val myProducts = listOf(
            Product(
                "Earphones",
                "Wireless earphones with noise cancellation",
                19.99,
                Color.Red
            ),
            Product(
                "Smartphone",
                "Latest model of a smartphone with a large display",
                899.99,
                Color.Green
            ),
            Product(
                "Laptop",
                "High-performance laptop for professional use",
                1299.99,
                color = Color.Black
            ),
            Product(
                "Headphones",
                "Over-ear headphones with noise cancellation",
                149.99,
                color = Color.Cyan
            ),

            Product(
                "Headphones",
                "High-quality headphones for music lovers",
                149.99, Color.Yellow
            ),
            Product(
                "Smartwatch",
                "Fitness tracker and health monitoring smartwatch",
                299.99,
                Color.Gray
            ),
            Product(
                "External Hard Drive",
                "1TB external hard drive for storage",
                129.99,
                Color.Magenta
            ),
            Product(
                "Bluetooth Speaker",
                "Portable speaker with wireless connectivity",
                99.99,
                Color.Cyan
            ),


            )
        LazyColumn(
            Modifier
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            items(myProducts) { product ->
                ProductCard(product)
            }
        }
    }

}

@Composable
fun ProductCard(product: Product) {

    Card(
        modifier = Modifier.fillMaxWidth()
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(
                        color = product.color,
                        shape = RoundedCornerShape(16.dp)
                    )
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column {

                Text(
                    text = product.name,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.SemiBold
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = product.description,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.DarkGray
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = product.price.toString(),
                    color = Color.Red,
                    fontWeight = FontWeight.Bold
                )
            }

        }

    }
}

data class Product(
    val name: String,
    val description: String,
    val price: Double,
    val color: Color
)
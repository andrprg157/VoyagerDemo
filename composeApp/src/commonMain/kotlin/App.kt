
import androidx.compose.runtime.*
import cafe.adriel.voyager.navigator.Navigator
import org.jetbrains.compose.ui.tooling.preview.Preview
import screen.home.HomeScreen

@Composable
@Preview
fun App() {
   Navigator(HomeScreen())
}
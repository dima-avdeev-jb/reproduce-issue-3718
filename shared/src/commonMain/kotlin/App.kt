import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi

@Composable
fun App() {
    SelectionContainer {
        Column(Modifier.padding(40.dp)) {
            Text("aaa")
            Text("")
            Text("ccc ddd eee fff ggg hhh iii")
        }
    }
}

expect fun getPlatformName(): String
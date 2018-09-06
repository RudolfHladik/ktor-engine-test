import io.ktor.client.HttpClient
import io.ktor.client.engine.*

object Api {
    val engineApache: HttpClientEngine = Apache
    val engineCio: HttpClientEngine = CIO

    val client = HttpClient(engineApache)
}

# Ktor Http engine import conflict
this repository shows import conflict of different http engines in one project.
I would expect to be able to use both engines after import
```import io.ktor.client.engine.*```

In Api (src/main/kotlin/Api) object created by me I am able to use interface HttpClientEngine which is in same package "io.ktor.client.engine", but I am not
able to create instances of objects CIO or Apache which are both in same packege "io.ktor.client.engine"
but they are downloaded from different modules from dependencies

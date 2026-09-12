package ch.sifakas.sudocool

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
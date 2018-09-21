package co.kaush.msusf.movies

data class MSMovieVs(
    val searchBoxText: String = "",
    val searchedMovieTitle: String = "",
    val searchedMovieRating: String = "",
    val searchedMoviePoster: String = ""
)

sealed class MSMovieEvent {
    object ScreenLoadEvent : MSMovieEvent()
    data class SearchMovieEvent(val searchedMovieTitle: String = "") : MSMovieEvent()
}

sealed class MSMovieResult {
    object ScreenLoadResult : MSMovieResult()
    data class SearchMovieResult(val movie: MSMovie) : MSMovieResult()
}
package vv.monika.jetpacklearn.advanceJetpack.coroutine


/*
* Coroutine -> Network call runs in main thread leading  to freeze of application
*              So coroutine, keeps ui smooth, in a single thread there could be multiple coroutine
*              Coroutine runs on background
*
* Coroutine = lightweight background task that doesn’t block UI
*
* suspend	Function that can pause & resume
* CoroutineScope	Lifetime of coroutine
* Dispatchers.IO	For API / database
* Dispatchers.Main	For UI
* viewModelScope	Safe scope tied to ViewModel
*
 */
class CoroutineExample {
}
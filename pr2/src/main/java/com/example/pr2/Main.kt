// 1 задача.
fun main1 (){
    print("Введите: ")
    var d = 0
    d = readlnOrNull()?.toInt()!!

    if (d >= 35)
    {
        println(d - 0.0075 * d)
    }
    else {
        println("Введите больше 35!")
    }
}

// 2 задача.
fun main2 () {
    var likes = 0
    print("Введите: ")
    likes = readlnOrNull()?.toInt()!!

    if ('1' == likes.toString().last() && likes != 11) {
        println("Понравилось ${likes} человеку")
    }
    else {
        println("Понравилось ${likes} людям.")
    }

}

// 3 Задача.
fun main () {
   println("Клиент постоянный? 0 или 1")
    val client = readln()
    println("Сумма покупки: ")
    val komka = when(val sum = readln().toInt().toFloat())
    {
        in 0f..1000f -> sum
        in 1001f..10000f -> sum-100f
        else -> sum - sum * 0.05f
    }
    if (client == "1") {
        println("Сумма составила ${komka - komka * 0.01f} долларов.")
    }
    else {
        println("Сумма составила $komka долларов.")
    }
}


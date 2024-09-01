open class Ticket(val filmName: String = "", val place: Int = 1, var number: Int = 0) {



    open fun ticketBy(ticketArray: ArrayList<Ticket>, filmArray: Array<Films>): ArrayList<Ticket> {

            println("Выберите фильм и сеанс или нажмите Q для выхода")
            for (elem in filmArray.indices) {
                println("$elem Фильм '${filmArray[elem].name}' начало в '${filmArray[elem].timeStart}'")
            }
            println("Введите число сеанса - ")

            var input = readln().toInt()
            if (input >= filmArray.size && input <= 0 ) {
                var film = filmArray.get(input)
                println("Вы выбрали $film")
                println()
                println("Выберите место")
                println(film.places.contentToString())
                var input2 = readln()
                var place = film.places.get(input2.toInt() - 1)

                println("-------------------------------------------------")
                println("Вы выбрали: $film и место: $place! Для подтверждения введите 1, для отмены 2")
                println()
                var input3 = readln()
                if (input3 == "1") {
                    number += 1
                    film.places[input2.toInt() - 1] = 0
                    ticketArray.add(Ticket(film.toString(), place, number))
                } else if (input3 == "2") {
                    println("Вы отменили операцию: билет не был добавлен")
                }

            } else {
                println("Такого значения нет")
            }
        return ticketArray
    }

    override fun toString(): String {
        return "Билет № $number Фильм: $filmName место № $place "
    }

    fun givTicket(ticketArray: ArrayList<Ticket>){
        for (i in ticketArray.indices){
            println(ticketArray[i].toString())
        }
    }

}
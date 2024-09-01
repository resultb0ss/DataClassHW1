fun main() {

    val ticketArray: ArrayList<Ticket> = ArrayList<Ticket>()
    val filmArray: Array<Films> = arrayOf(Films("Гадкий я", "12.00",
        intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)),
        Films("Гадкий я", "16.00",
            intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)),
        Films("Гадкий я", "18.00",
            intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)),
        Films("Головоломка 2", "10.00",
            intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)),
        Films("Головоломка 2", "13.00",
            intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)),
        Films("Головоломка 2", "15.00",
            intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)),)

    var byTheTicket = Ticket()


    while (true){
        println("Выберите что хотите сделать: \n1 - добавить билет на сеанс \n2 - посмотреть все купленные билеты \nQ - выйти")
        var inputDo = readln()

        when (inputDo) {
            "1" -> byTheTicket.ticketBy(ticketArray, filmArray)
            "2" -> if (ticketArray.isEmpty()) {
                println("Пока нет купленных билетов попробуйте добавить еще раз")
                break
            } else {
                byTheTicket.givTicket(ticketArray)
            }

            "q" -> {
                println("Программа завершена, хорошего дня!")
                break
            }

            "Q" -> {
                println("Программа завершена, хорошего дня!")
                break
            }

            else -> {
                println("Такого значения нет")
                break
            }
        }

    }


}



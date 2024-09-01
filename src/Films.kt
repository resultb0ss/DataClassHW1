class Films(val name: String,val timeStart: String, val places: IntArray) {

    override fun toString(): String {
        return "Фильм: $name, начало в: '$timeStart' "
    }
}


package data

fun AscendingforA(dataArray: Array<Int>):Array<Int> {
    return dataArray.sortedArray()
}

fun sortingTwo(dataArray: Array<Int>): Array<Int> {
    val result = dataArray.mapIndexed { index, value ->
        if (index == 0) {
            value * dataArray[dataArray.size - 1]
        } else {
            value * dataArray[dataArray.size - index - 1]
        }
    }
    return result.toTypedArray()
}

fun sortingThree(data: Array<Int>): Array<Int> {
    for (three in data.indices) {
        if (data[three] == data[data.size - 1]) {
            break
        } else if (three % 2 == 0) {
            data[three] = data[three] + data[three + 1]
        } else {
            data[three] = data[three] - data[three + 1]
        }
    }
    return data.copyOfRange(0, data.size - 1)
}
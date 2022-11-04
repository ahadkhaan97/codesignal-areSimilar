fun main() {
    print(
        solution(
            mutableListOf(1, 2, 1, 2),
            mutableListOf(2, 2, 1, 1)
        )
    )
}

fun solution(a: MutableList<Int>, b: MutableList<Int>): Boolean {

    var difference = 0

    for (i in 0 until a.size) {
        if (a[i] != b[i]) {
            difference++
        }
    }

    a.sort()
    b.sort()

    return if (a == b) {
        difference <= 2
    } else {
        false
    }
}

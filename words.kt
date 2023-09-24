import kotlin.math.sqrt
import java.math.*

fun main(args: Array<String>){
    var word_lst: MutableList<String> = args.toMutableList()
    var word_map = word_lst.map { it to it.length }.toMap()
    // Compute average word length
    var total_len = 0
    word_map.forEach { total_len+=it.value }
    var av_len = total_len/word_lst.size
    println("Average Length: $av_len")

    // Compute word stdev
    var numerator = 0.0
    word_map.forEach { numerator +=Math.pow(it.value.toDouble()-av_len, 2.0) }
    var st_dev = sqrt(numerator/2.0)

    println("Standard Deviation: $st_dev")
}

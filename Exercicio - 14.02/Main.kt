import java.util.*

public fun calcMedia() {
    var input = Scanner(System.`in`)

    var n1 = input.nextFloat()
    var n2 = input.nextFloat()
    val pr_totais : Float = 50F
    var faltas : Float = 10F

    var faltas_por : Float = (pr_totais - faltas)/(pr_totais) * 100

    println(faltas_por)

    if(faltas_por >= 75)
    {
        var result : Float = (n1 + n2)/2

        if(result >= 9)
            println("A")
        else if(result >= 7.5)
            println("A")
        else if(result >= 6)
            println("A")
        else
            println("D")
    }
    else
    {
        println("FF")
    }

}

public fun palPaling() {
    var input = Scanner(System.`in`)
    var palavra = input.next()
    var tam : Int = palavra.length-1

    var aux: Int = 0
    var msg: String = "é palindromo"

    while(aux < tam)
    {
        if(palavra[aux] != palavra[tam-aux])
        {
            msg = "errou"
            break
        }
        aux++
    }
    println(msg)
}

fun main() {

    var input = Scanner(System.`in`)

    var op = input.nextInt()

    var ativo : Boolean = true

    // dado de entrada para a operação "EXIT".
    var exit = input.nextInt()

    // declarado o valor correspondente a operação é finalizada e a menssagem é mostrada.
    if (exit == 1) {
        ativo = false
        println("GAME OVER!")
    }


    while (ativo) {
        when (op) {
            1 -> calcMedia()
            2 -> palPaling()
            3 -> exit
            else -> "Finalzido"
        }
    }

}
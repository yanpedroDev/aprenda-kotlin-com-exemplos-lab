// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel {
    BASICO, INTERMEDIARIO, AVANCADO
}

class Usuario

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel) {
    override fun toString(): String {
        return ("Conteúdo: ${nome} / Duração: ${duracao}min / Nível: ${nivel}")
    }

    data class Formacao(val nome: String, val conteudos: ConteudoEducacional) {

        override fun toString(): String {
            return ("Avaliação: ${nome}\n${conteudos}")
        }

        data class Matricular(val aluno: String, val grade: ConteudoEducacional.Formacao) {
            override fun toString(): String {
                return ("Aluno matriculado: ${aluno}\n${grade}\n")
            }
        }
    }
}


fun main() {

    println(
        ConteudoEducacional.Formacao.Matricular(
            "Yan", ConteudoEducacional.Formacao(
                "Algoritmos 1",
                conteudos = ConteudoEducacional(
                    "Functions em Kotlin",
                    15,
                    Nivel.BASICO
                )
            )
        )
    )

    println(
        ConteudoEducacional.Formacao.Matricular(
            "Maria",
            ConteudoEducacional.Formacao(
                "Algoritmos 2",
                conteudos = ConteudoEducacional(
                    "POO em Kotlin",
                    30,
                    Nivel.INTERMEDIARIO
                )
            )
        )
    )

    println(
        ConteudoEducacional.Formacao.Matricular(
            "Joao",
            ConteudoEducacional.Formacao(
                "Algoritmos 3",
                conteudos = ConteudoEducacional(
                    "Lambda Functions em Kotlin",
                    60,
                    Nivel.AVANCADO
                )
            )
        )
    )
}

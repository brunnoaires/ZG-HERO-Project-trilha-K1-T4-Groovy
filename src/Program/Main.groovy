package Program

import Entities.Candidato
import Entities.Empresa

def candidato1 = new Candidato(nomeC: "Andrew",emailC: "andrew@gmail.com", estadoC: "Goias", descricaoC: "Web dev",
        cep:"123", idade:"20", competencias: "Python")

def candidato2 = new Candidato(nomeC: "Gian",emailC: "gian@hotmail.com", estadoC: "Rio de janeiro", descricaoC: "procuro me tornar um dev profissional",
        cep:"153412", idade:"40", competencias: "ruby")

def candidato3 = new Candidato(nomeC: "Brayan",emailC: "brayan@outlook.com", estadoC: "Sao Paulo", descricaoC: "Sou um profissional nivel senior",
        cep:"312321", idade:"21", competencias: "web dev em js, react e css")

def candidato4 = new Candidato(nomeC: "Lara",emailC: "lara@gmail.com", estadoC: "Rio grande do norte", descricaoC: "desc",
        cep:"123", idade:"20", competencias: "competencia")

def candidato5 = new Candidato(nomeC: "Amanda",emailC: "amanda@outlook.com", estadoC: "Goias", descricaoC: "procurando um estagio em java",
        cep:"5123421", idade:"18", competencias: "web dev fullstack em java")

List<Candidato> candidatoList = [] as List<Candidato>

candidatoList.add(candidato1)
candidatoList.add(candidato2)
candidatoList.add(candidato3)
candidatoList.add(candidato4)
candidatoList.add(candidato5)

println("CANDIDATOS:")
int ic = 0
candidatoList.each { itemc ->
    {
        println("_________________________")
        println("Candidato ${ic + 1}")
        println(itemc)
        ic++
    }
}
println()

        List<Empresa> empresalist = [] as List<Empresa>

        def empresa1 = new Empresa(nomeE: "Jr", emailE: "Jr@gmail.com", estadoE: "Rio de Janeiro", cpnjE: "312312", pais: "Brazil", descricaoE: "Focada em desenvolvimento web")
        def empresa2 = new Empresa(nomeE: "Devs", emailE: "devs@gmail.com", estadoE: "Sao Paulo", cpnjE: "321421", pais: "Brazil", descricaoE: "Empresa focada em formar novos desenvovledores")
        def empresa3 = new Empresa(nomeE: "Elo", emailE: "elo@gmail.com", estadoE: "Goias", cpnjE: "1252312312", pais: "Brazil", descricaoE: "Somos lobos")
        def empresa4 = new Empresa(nomeE: "Dale", emailE: "dale@gmail.com", estadoE: "Rio grande do norte", cpnjE: "241312312", pais: "Brazil", descricaoE: "Empresa focada em dados")
        def empresa5 = new Empresa(nomeE: "Pequi", emailE: "pequi@gmail.com", estadoE: "Goias", cpnjE: "3210-932910", pais: "Brazil and United States", descricaoE: "Empresa com ampla area de tecnologia, buscamos profissionais focados em desenvolvimento e analise de dados")

        empresalist.add(empresa1)
        empresalist.add(empresa2)
        empresalist.add(empresa3)
        empresalist.add(empresa4)
        empresalist.add(empresa5)

println("EMPRESAS:")
        int ie = 0
        empresalist.each { iteme ->
            {
                println("_________________________")
                println("Empresa ${ie + 1}")
                println(iteme)
                ie++
            }
        }



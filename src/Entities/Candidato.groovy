package Entities

class Candidato {
    String nomeC, emailC, estadoC, descricaoC, competencias;
    String cep, idade;


    @Override
    public String toString() {
        return  "nomeC='" + nomeC + '\'' +
                ", emailC='" + emailC + '\'' +
                ", estadoC='" + estadoC + '\'' +
                ", descricaoC='" + descricaoC + '\'' +
                ", cep=" + cep +
                ", idade=" + idade +
                ", competencias=" + competencias

    }
}

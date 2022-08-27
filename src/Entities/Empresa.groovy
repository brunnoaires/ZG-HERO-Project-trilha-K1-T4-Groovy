package Entities

class Empresa {
    String nomeE, emailE, estadoE,descricaoE;
    String cepE,cpnjE, pais;


    @Override
    public String toString() {
        return  "nomeE='" + nomeE + '\'' +
                ", emailE='" + emailE +
                ", estadoE='" + estadoE  +
                ", descricaoE='" + descricaoE + '\'' +
                ", cepE='" + cepE + '\'' +
                ", cpnjE='" + cpnjE + '\'' +
                ", pais='" + pais

    }
}

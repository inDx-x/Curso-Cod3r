package ArraysCollections.EqualsHashode;

import java.util.Objects;

public class Usuario {

    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {

        if (objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Usuario usuario = (Usuario) o;
//        return Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nome, email);
//    }



    // O Hashcode será feito manualmente em nova aula.
}

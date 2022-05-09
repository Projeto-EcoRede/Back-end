package com.generation.ecorede.model;

<<<<<<< HEAD
<<<<<<< HEAD
public class Tema {

}
=======
=======
>>>>>>> 737bf679c02ff68dce641bf4e9b3d73a47b45948
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//imports de relacionamento ainda não utilizados, mas já inseridos.

@Entity //create table
@Table(name = "tb_temas") 
public class Tema {
	
	        @Id // Primary Key id
	        @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	        private Long id;

	        @NotBlank(message = "O atributo topico é obrigatório!")
	        @Size(min = 5, max = 155, message = "O atributo topico deve conter no min 5 e no máximo 155")
	        private String topico;

	        @NotBlank(message = "O atributo descrição é obrigatório!")
	        @Size(min = 10, max = 1000, message = "O atributo descrição deve conter no min 10 e no máximo 1000")
	        private String descricao;

	        //@OneToMany(mappedBy = "tema", cascade = CascadeType.REMOVE)
	        //@JsonIgnoreProperties("tema")
	       // private List<Postagem> postagem;

	        public Long getId() {
	            return id;
	        }

	        public void setId(Long id) {
	            this.id = id;
	        }

	        public String getTopico() {
	            return topico;
	        }

	        public void setTopico(String topico) {
	            this.topico = topico;
	        }

	        public String getDescricao() {
	            return descricao;
	        }

	        public void setDescrição(String descricao) {
	            this.descricao = descricao;
	        }

	       // public List<Postagem> getPostagem() {
	        //    return postagem;
	       // }

	       // public void setPostagem(List<Postagem> postagem) {
	       //     this.postagem = postagem;
	       // }
	    //}

}
	

<<<<<<< HEAD
>>>>>>> 737bf679c02ff68dce641bf4e9b3d73a47b45948
=======
>>>>>>> 737bf679c02ff68dce641bf4e9b3d73a47b45948

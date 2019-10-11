import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Livros implements Identificavel{

	@Id
	@GeneratedValue	
	public Long Id;
	public Long ISBN;
	public String Titulo;
	public Long Ano;

	@ManyToOne
	@JoinColumn(name="id_editora")
	private Editora editora;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name="id_autor")
	private Autor autor;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getISBN() {
		return ISBN;
	}
	public void setISBN(Long iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public Long getAno() {
		return Ano;
	}
	public void setAno(Long ano) {
		Ano = ano;
	}
	
	
}

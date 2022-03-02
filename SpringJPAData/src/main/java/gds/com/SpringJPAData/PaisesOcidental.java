package gds.com.SpringJPAData;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "PaisesOcidental")
@Table(name = "paisesOcidental",uniqueConstraints = {@UniqueConstraint(name="paisesOcidental_nome_unique",columnNames = "nome")})
public class PaisesOcidental {
    @Id
    @SequenceGenerator(name = "paisesOcidental_sequence",sequenceName = "paisesOcidental_sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE,generator = "paisesOcidental_sequence")
    @Column(name = "id", updatable = false)
    private Long id;
    @Column(name = "nome",nullable = false, columnDefinition = "TEXT")
    private String nome;
    @Column(name = "capital",nullable = false, columnDefinition = "TEXT")
    private String capital;
    @Column(name = "moeda",nullable = false, columnDefinition = "TEXT")
    private String moeda;
    @Column(name = "idioma",nullable = false, columnDefinition = "TEXT")
    private String idioma;
    @Column(name = "populacao",nullable = false)
    private Integer populacao;

    /*Construtor*/
    public PaisesOcidental(String nome, String capital, String moeda, String idioma, Integer populacao) {
        this.nome = nome;
        this.capital = capital;
        this.moeda = moeda;
        this.idioma = idioma;
        this.populacao = populacao;
    }
    /*to String*/
    @Override
    public String toString() {
        return "PaisesOcidental{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", capital='" + capital + '\'' +
                ", moeda='" + moeda + '\'' +
                ", idioma='" + idioma + '\'' +
                ", populacao=" + populacao +
                '}';
    }
    /*Getters Setters*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }
}

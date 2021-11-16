package Classes;
import java.time.LocalDate;

public class Locação {
    private LocalDate dataLocacao;
    private String cpfcliente;
    private Integer cdlivro;
    private LocalDate dtdevolucao;
    private String status = "devolvido";

    
    @Override
    public String toString() {
        return "Locação [cdlivro=" + cdlivro + ", cpfcliente=" + cpfcliente + ", dataLocacao=" + dataLocacao
                + ", dtdevolucao=" + dtdevolucao + ", status=" + status + "]";
    }

    public Locação(LocalDate dataLocacao, String cpfcliente, Integer cdlivro, LocalDate dtdevolucao, String status) {
        this.dataLocacao = dataLocacao;
        this.cpfcliente = cpfcliente;
        this.cdlivro = cdlivro;
        this.dtdevolucao = dtdevolucao;
        this.status = status;
    }
    
    public LocalDate getDataLocacao() {
        return dataLocacao;
    }
    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }
    public String getCpfcliente() {
        return cpfcliente;
    }
    public void setCpfcliente(String cpfcliente) {
        this.cpfcliente = cpfcliente;
    }
    public Integer getCdlivro() {
        return cdlivro;
    }
    public void setCdlivro(Integer cdlivro) {
        this.cdlivro = cdlivro;
    }
    public LocalDate getDtdevolucao() {
        return dtdevolucao;
    }
    public void setDtdevolucao(LocalDate dtdevolucao) {
        this.dtdevolucao = dtdevolucao;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

  
    
    
}

public class Cliente {

    private String nomeCliente;
    private String cpfCliente;
    private String telefoneCliente;

    public Cliente(String nome, String cpf,String telefone){
        this.nomeCliente = nome;
        this.cpfCliente = cpf;
        this.telefoneCliente = telefone;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String toString(){
       return String.format("CPF: %s\nNome: %s\nTelefone: %s",
                this.cpfCliente, this.nomeCliente, this.telefoneCliente);
    }

}
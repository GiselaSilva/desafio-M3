public class Cidade
{
    private int codigo;
    private String descricao;
    private String uf;
    private int qtestudantes;
    
    //construtor
    public Cidade(int codigo, String descricao, String uf){
        this.codigo = codigo;
        this.descricao = descricao;
        this.uf = uf;
    }
    
    //Método Get
    public int getCodigo(){
        return codigo;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getUf () {
        return uf;
    }
    //Metodo Set
    public void setCodigo (int novoCodigo){
        codigo = novoCodigo;
    }
    public void setDescricao (String novaDescricao){
        descricao = novaDescricao;
    }
    public void setUf (String novaUf){
        uf = novaUf;
    }
    
    //Método adicionaNovoEstudante
    public void adicionaNovoEstudante() {
        qtestudantes = qtestudantes + 1;
    }
    
    //Metodo exibeDados
    public void exibeDados(){
        System.out.println("");
        System.out.println("\n-------------- CIDADE --------------");
        System.out.println("Código da cidade: " + codigo);
        System.out.println("Descrição da cidade: " + descricao);
        System.out.println("UF: " + uf);
        System.out.println("Quantidade de Estudantes: " + qtestudantes);
    }
}

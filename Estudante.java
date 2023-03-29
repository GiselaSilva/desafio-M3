public class Estudante
{
   private int codigoEstudante;
   private String nome;
   private String dtNascimento;
   private String email;
   private String senha;
   private Cidade cidade;
   
   //Metodo construtor
   public Estudante (int codigoEstudante, String nome, String dtNascimento, String email, String senha, Cidade cidade){
       this.codigoEstudante = codigoEstudante;
       this.nome = nome;
       this.dtNascimento = dtNascimento;
       this.email = email;
       this.senha = senha;
       this.cidade = cidade; //o parâmetro cidade possui o objeto Cidade. Este objeto será atribuido para o atributo cidade.
       cidade.adicionaNovoEstudante();
   }
   
   //Metodo Get
   public int getCodigoEstudante(){
       return codigoEstudante;
   }
   public String getNome(){
       return nome;
   }
   public String getDtNascimento(){
       return dtNascimento;
   }
   public String getEmail(){
       return email;
   }
   public String getSenha(){
       return senha;
   }
   public Cidade getCidade(){
       return cidade;
   }
   
   //Metodo Set
   public void setCodigoEstudante (int novoCodigoEstudante){
       codigoEstudante = novoCodigoEstudante;
   }
   public void setNome (String novoNome){
       nome = novoNome;
   }
   public void setDtNascimento (String novaDtNascimento){
       dtNascimento = novaDtNascimento;
   }
   public void setEmail (String novoEmail){
       email = novoEmail;
   }
   public void setSenha (String novaSenha){
       senha = novaSenha;
   }
   public void setCidade (Cidade novaCidade){
       cidade = novaCidade;
   }
   
   //Metodo exibeDados
   public void exibeDados(){
       System.out.printf("--------Estudante %d --------", codigoEstudante);
       System.out.println("\nCódigo Estudante: " + codigoEstudante);
       System.out.println("Nome: " + nome);
       System.out.println("Data de Nascimento: " + dtNascimento);
       System.out.println("E-mail: " + email);
       System.out.println("Senha: " + senha);
       System.out.println("Cidade: " + cidade.getDescricao());
   }
}

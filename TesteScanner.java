import java.util.Scanner;

public class TesteScanner
{
    public static void main(String args[]){
        //variaveis do construtor cidade
        int codigo;
        String descricao;
        String uf;
        
        Scanner input = new Scanner(System.in);
        
        //cadastro cidade 1
        System.out.println("------------ Cadastro Cidade -------------");
        System.out.print("Digite o código da Cidade: ");
        codigo = input.nextInt();
        
        input.nextLine();//esvazia bufffer
        System.out.print("Digite o nome da Cidade: ");
        descricao = input.nextLine();
        
        System.out.print("Digite a UF: ");
        uf = input.nextLine();
        
        Cidade c1 = new Cidade(codigo, descricao, uf);
                
        //construtor estudande (int codigoEstudante, String nome, String dtNascimento, String email, String senha, Cidade cidade)
        int codigoEstudante;
        String nome;
        String dtNascimento;
        String email;
        String senha;
        Cidade cidade;
        
        //cadastro aluno1
        System.out.println("---------- Cadastro Aluno 1 ----------");
        System.out.println("Digite o código do estudante: ");
        codigoEstudante = input.nextInt();
        
        input.nextLine();//esvazia buffer
        System.out.println("Digite o nome completo do estudante: ");
        nome = input.nextLine();
        
        System.out.println("Digite a data de nascimento: ");
        dtNascimento = input.nextLine();
        
        System.out.println("Digite o email: ");
        email = input.nextLine();
        
        System.out.println("Digite a senha: ");
        senha = input.nextLine();
        
        cidade = c1;
   
    
        Estudante e1 = new Estudante(codigoEstudante,nome,dtNascimento,email,senha,cidade); //- objeto e1
        
        //Alteração da senha
        System.out.println("\n---------- Atualização de Senha ----------");
        System.out.println("\nDigite a senha do Estudante 01: ");
        String senhaAnterior1 = input.nextLine();
        if ((e1.getSenha()).equals(senhaAnterior1)) {
            System.out.println("Digite a nova Senha: ");
            String novaSenha = input.nextLine();
            System.out.println("Digite a nova senha novamente: ");
            String novaSenhaRep = input.nextLine();
            
            if (novaSenha.equals(novaSenhaRep)) {
                e1.setSenha(novaSenha);
                System.out.print("---------------- Senha Alterada com Sucesso ----------------"); 
            } else {
                System.out.print("Não foi possível alterar a senha! \nAs senhas digitadas não conferem!");
            }} else {
                System.out.print("Não foi possível alterar a senha! \nA senha digitada não é igual a cadastrada!");
            }
        
        //cadastro aluno e2
        System.out.println("\n");
        System.out.println("\n---------- Cadastro Aluno 2 ----------");
        System.out.println("\nDigite o código do estudante: ");
        codigoEstudante = input.nextInt();
        
        input.nextLine();//esvazia buffer
        System.out.println("Digite o nome completo do estudante: ");
        nome = input.nextLine();
        
        System.out.println("Digite a data de nascimento: ");
        dtNascimento = input.nextLine();
        
        System.out.println("Digite o email: ");
        email = input.nextLine();
        
        System.out.println("Digite a senha: ");
        senha = input.nextLine();
        
        cidade = c1;
        Estudante e2 = new Estudante(codigoEstudante,nome,dtNascimento,email,senha,cidade);
            
        //Alteração da senha e2
        System.out.println("\n---------- Atualização de Senha ----------");
        System.out.println("\nDigite a senha do Estudante 02: ");
        String senhaAnterior2 = input.nextLine();
        if ((e2.getSenha()).equals(senhaAnterior2)) {
            System.out.println("Digite a nova Senha: ");
            String novaSenha = input.nextLine();
            System.out.println("Digite a nova senha novamente: ");
            String novaSenhaRep = input.nextLine();
            
            if (novaSenha.equals(novaSenhaRep)) {
                e2.setSenha(novaSenha);
                System.out.print("---------------- Senha Alterada com Sucesso ----------------"); 
            } else {
                System.out.print("Não foi possível alterar a senha! \nAs senhas digitadas não conferem!");
            }} else {
                System.out.print("Não foi possível alterar a senha! \nA senha digitada não é igual a cadastrada!");
            }
    
        System.out.print("\n");
        c1.exibeDados();
        e1.exibeDados();
        e2.exibeDados();
        System.out.print("\n********************Tecle Enter para prosseguir********************"); //para "pausar" e execução
        String pausa = input.nextLine(); 
        
        //cadastro cidade 2
        System.out.println("\f------------ Cadastro Cidade -------------");
        System.out.println("Digite o código da Cidade: ");
        codigo = input.nextInt();
        
        input.nextLine();//esvazia bufffer
        System.out.println("Digite o nome da Cidade: ");
        descricao = input.nextLine();
        
        System.out.println("Digite a UF: ");
        uf = input.nextLine();
        
        Cidade c2 = new Cidade(codigo, descricao, uf); //objeto c2
        
        //cadastro aluno e3
        System.out.println("---------- Cadastro Aluno 3 ----------");
        System.out.println("Digite o código do estudante: ");
        codigoEstudante = input.nextInt();
        
        input.nextLine();//esvazia buffer
        System.out.println("Digite o nome completo do estudante: ");
        nome = input.nextLine();
        
        System.out.println("Digite a data de nascimento: ");
        dtNascimento = input.nextLine();
        
        System.out.println("Digite o email: ");
        email = input.nextLine();
        
        System.out.println("Digite a senha: ");
        senha = input.nextLine();
        
        cidade = c2;
   
    
        Estudante e3 = new Estudante(codigoEstudante,nome,dtNascimento,email,senha,cidade);
        
        //Alteração da senha e3
        System.out.println("\n---------- Atualização de Senha ----------");
        System.out.println("\nDigite a senha do Estudante 03: ");
        String senhaAnterior3 = input.nextLine();
        if ((e3.getSenha()).equals(senhaAnterior3)) {
            System.out.println("Digite a nova Senha: ");
            String novaSenha = input.nextLine();
            System.out.println("Digite a nova senha novamente: ");
            String novaSenhaRep = input.nextLine();
            
            if (novaSenha.equals(novaSenhaRep)) {
                e3.setSenha(novaSenha);
                System.out.print("---------------- Senha Alterada com Sucesso ----------------"); 
            } else {
                System.out.print("Não foi possível alterar a senha! \nAs senhas digitadas não conferem!");
            }} else {
                System.out.print("Não foi possível alterar a senha! \nA senha digitada não é igual a cadastrada!");
            }
            
        //cadastro aluno e4
        System.out.print("\n");
        System.out.println("\n---------- Cadastro Aluno 4 ----------");
        System.out.println("Digite o código do estudante: ");
        codigoEstudante = input.nextInt();
        
        input.nextLine();//esvazia buffer
        System.out.println("Digite o nome completo do estudante: ");
        nome = input.nextLine();
        
        System.out.println("Digite a data de nascimento: ");
        dtNascimento = input.nextLine();
        
        System.out.println("Digite o email: ");
        email = input.nextLine();
        
        System.out.println("Digite a senha: ");
        senha = input.nextLine();
        
        cidade = c2;
   
    
        Estudante e4 = new Estudante(codigoEstudante,nome,dtNascimento,email,senha,cidade); //cria objeto estudante 4
        
        //Alteração da senha e4
        System.out.println("\n---------- Atualização de Senha ----------");
        System.out.println("\nDigite a senha do Estudante 04: ");
        String senhaAnterior4 = input.nextLine();
        if ((e4.getSenha()).equals(senhaAnterior4)) {
            System.out.println("Digite a nova Senha: ");
            String novaSenha = input.nextLine();
            System.out.println("Digite a nova senha novamente: ");
            String novaSenhaRep = input.nextLine();
            
            if (novaSenha.equals(novaSenhaRep)) {
                e4.setSenha(novaSenha);
                System.out.print("---------------- Senha Alterada com Sucesso ----------------"); 
            } else {
                System.out.print("Não foi possível alterar a senha! \nAs senhas digitadas não conferem!");
            }} else {
                System.out.print("Não foi possível alterar a senha! \nA senha digitada não é igual a cadastrada!");
            }
        
        c2.exibeDados();
        e3.exibeDados();
        e4.exibeDados();
    }
}

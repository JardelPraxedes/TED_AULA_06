import classes.Cliente;
import classes.Funcionario;

public class app {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Funcionario funcionario = new Funcionario();
        System.out.println("Dados do cliente: \n" + "ID: " + cliente.getId_cliente(312) +
         "\nNome: " + cliente.getNome("Eitor soares dos Santos")+
        "\nCPF: " + cliente.getCpf("127.856.587-98")+
        "\nEndereço: " + cliente.getEndereco("Rua Amorin Perreira, 58 - SP")+
        "\nEmail: " + cliente.getEmail("eitorsoares112@gmail.com") +
                "\nDados do funcionário: \n"   +  "Matricula: " +   funcionario.getMatricula(175871)+
        "\nNome: " + funcionario.getNome("Emanuel Ferreira Cunha")+
        "\nCPF: " + funcionario.getCpf("852.451.254-96")+
        "\nEndereço: "+ funcionario.getEndereco("Rua Pedro Cabral, 12 - SP")+
        "\nEmail: " + funcionario.getEmail("emanuelcunha@gmail.com"));


    }
}

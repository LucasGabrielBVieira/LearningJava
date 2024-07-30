public class App {

    //Classes
    public class Person {
        //modificador-de-acesso/ class/ nome-da-classe

        //para atribuir variaveis na classe, o modificador de aceesso tambem é utilizado
        public String name;
        public Integer idade;
        //Com o modificador de acesso private, não é possível manipular o atributo ou função fora da classe
        private Integer salary;
        //Com o modificador de acesso protected, é possível manipular o attr ou a função a nível de pacote
        protected String endereco;

        //métodos de classe
        public void setname(String name) {
            this.name = name;
        }

        public String getname() {
            return this.name;
        }
        //Construtor
        //Um método que carrega o nome da classe e inicia a instancia com atributos
        public Person(String name, int idade) {
            this.name = name;
            this.idade = idade;
        }
    }

    public static void main(String[] args) {
        
    }   
}

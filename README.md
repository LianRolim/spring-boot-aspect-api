<h1>Exemplo de inicialização orientada a aspectos (AOP) do Spring Boot.</h1><br />
Este é uma pequena api de exemplo que mostra como criar o Aspect que lida com questões transversais. Demonstra 2 aspectos diferentes:<br />

TimeLogAspect: um aspecto aplicado através da anotação @Timed que registra a duração de uma chamada de método.<br />
RequestLogAspect: um aspecto aplicado aos métodos com o Spring @RequestMapping que registra os caminhos de solicitação<br />

<h1>Como executar a aplicação</h1><br />
$ mvn spring-boot:run <br />
<br />
<br />
Dúvidas Insira uma Issue neste projeto :-)

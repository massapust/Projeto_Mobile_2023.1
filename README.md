# Projeto_Mobile_2023.1


<h1>Documento de Requisitos</h1>



<hr></hr>
Equipe Responsável pela Elaboração
Lucas Batista da Silva – Desenvolvedor – Matrícula:01334252
katia pereira da silva - Desenvolvedor - Matrícula: 01527087
<hr> </hr>
<h1>Público Alvo</h1>
Podem doar sangue pessoas entre 16 e 69 anos e que estejam pesando mais de 50kg. 
Além disso, é preciso apresentar documento oficial com foto
e menores de 18 anos
só podem doar com consentimento formal dos responsáveis.
<hr> </hr>






<hr></hr>
Dúvidas, críticas e sugestões devem ser encaminhadas por escrito para o seguinte endereço postal:
especifique o endereço para correspondência: Avenida Antônio Cabral De Souza, 350 - Vila Torres Galvão – Paulista-PE – 53403-610.
Ou para o seguinte endereço eletrônico:
01528401@sempreuninassau.com.br
Recomendamos que o assunto seja identificado com o título desta obra. Alertamos ainda para a importância de se identificar o endereço e o nome completos do remetente para que seja possível o envio de respostas.

<hr> </hr>
<b>Hora de Doar são marcas registradas da  WEB 
<hr> </hr>
<h2>Sumário</h2>

INTRODUÇÃO...........................................................................................................

Visão geral deste documento.................................................................................................

<strong>Convenções, termos e abreviações</strong>.......................................................................................
1.Identificação dos Requisitos.........................................................................................
2.Prioridades dos Requisitos...........................................................................................

Referências..............................................................................................................................

<h3>CAPÍTULO 1 - DESCRIÇÃO GERAL DO SISTEMA	C1. 6</h3>

Abrangência e sistemas relacionados	C1. 6

Descrição dos usuários	C1. 6
1.	Jovens a partir dos 16 anos	C1. 6
2. Doador	C1. 6
3.Doadores de sangue	C1.6

<h3>CAPÍTULO 2 - REQUISITOS FUNCIONAIS (CASOS DE USO)	C2. 7</h3>

Interfaces Agrupadas	C2. 7
[RF001] Tela de Acesso	C2. 7
             
[RF002] Locais de doação	C2. 8

<h3>CAPÍTULO 3 - REQUISITOS NÃO FUNCIONAIS	C3. 9</h3>

Usabilidade	C3. 9
[NR001] Verificação de 2 Etapas	C3. 9
[NR002] Notificações	C3. 9

Confiabilidade	C3. 9
[NR003] Falha Na conexão	C3. 9

Desempenho	C3.9
          [NR004] Pedidos de Doação	C3. 9

Distribuição	C3. 10
[NR005] Versões Atualizada	C3. 10


Padrões	C3 .10
[NR006] Versões 	C3.10


Hardware e software	C3.10
[NR007] Dispositivos	C3.10

<h3> CAPÍTULO 4 DESCRIÇÃO DA INTERFACE COM O USUÁRIO	C4.11</h3>

Logo Tipo 	C4.11
1.Descrição 	C4 .11

<h4>Tela Principal Do Aplicativo	C4.12</h4>
2.Descrição 	C4 .12


Tela De Pergunta ao Usuário	C4.12
3.Descrição 	C4 .12


Tela De Login Do Doador	C4.13
4.Descrição 	C4 .13


Tela De Cadastro Do Doador	C4.13
5.Descrição 	C4 .13

Tela De Endereço laboratório	C4.14
6.Descrição 	C4 .14


Tela De Perfil 	C4.14
7.Descrição 	C4 .14


Tela De Redefinição de Senha	C4.15
8.Descrição 	C4 .15


Referências..............................................................................................................................12 
<hr> </hr>


<h2>Introdução</h2>

    Este documento especifica o sistema, Hora de Doar pela tal como fornecendo aos desenvolvedores as informações necessárias para o projeto, implementação e metodologia ágil, assim como para a realização dos testes e homologação do sistema.
Visão geral deste documento	
Esta introdução fornece as informações necessárias para fazer um bom uso deste documento, explicitando seus objetivos e as convenções que for

  <h1> Logo Tipo</h1>

![download](https://user-images.githubusercontent.com/102639688/231070220-9ef7b342-db91-428f-b387-3c1f1291089b.jpg)

<h3>.1	Detalhes</h3>
Desenvolvido por Lucas Batista:
 Logo Tipo do aplicativo Hora de doar, onde se trata de dois Emojis que são:Duas mão segurando um coração. 









  <h1> Tela Principal do Aplicativo	</h1>
![Tela 1 - pimeira tarefa](https://user-images.githubusercontent.com/102639688/231066144-72ce9e32-c2b6-4da1-a339-b529f88a7747.jpeg)



<h3>1.	Detalhes</h3>
Desenvolvido por Lucas Batista :
 Tela de Início do Aplicativo onde apresenta a logo do Aplicativo é o botões. 


   <h1>Tela De Cadastro do Doador	</h1>
   ![tela 2 - cadastro](https://user-images.githubusercontent.com/102639688/231065963-98de01b9-ba39-48b9-bc4f-bbe95206873c.jpeg)

   
   <h3>1.	Detalhes:</h3>
Desenvolvido por Lucas Batista :
		Se o usuário não tiver conta ele será direcionado para está aba, onde terá que preencher todo o formulário com seus dados pessoais. Existindo a possibilidade do usuário ler os termos de condições.

<h1>Tela de termo de uso</h1>
![tela 3 - termos de uso](https://user-images.githubusercontent.com/102639688/231068716-c07522a6-609f-46bd-b2da-6cde6e31e70d.jpeg)
 
 Desenvolvida por Lucas Batista:
 Tela de termo de uso contendo informações sobre o aplicativo.


  <h1> Tela De Login Já Cadastrado</h1>	
   ![tela 4 - login](https://user-images.githubusercontent.com/102639688/231066034-fe3e25e2-df2c-4fbf-929d-16fd04d29047.jpeg)

   <h3>1.	Detalhes:</h3>
Desenvolvido por Lucas Batista:
		Se o usuário já for casdatrado ele será redirecionado para está aba, onde haverá a possibilidade de acessar sua conta. Entretanto, se houver esquecimento da senha também será possível redefinir.

 <h1>  Tela Para identificar conta</h1>
  ![tela 5 - recuperar senha](https://user-images.githubusercontent.com/102639688/231066075-68850fa3-ffbb-40cc-a634-7d1afb8bed7c.jpeg)

<h3>  1.	Detalhes:</h3>
Desenvolvida por Lucas Batista:
	Caso o usuário Esqueça a senha ele será direcionado para essa aba onde colocara o Email para recuperar.

  <h1> Tela De Redefinição de Senha</h1>
  ![tela 6 - nova senha](https://user-images.githubusercontent.com/102639688/231066110-21aa648b-8435-490d-a34c-dec891857b22.jpeg)

   
  <h3> 1.	Detalhes:</h3>
Desenvolvido por Lucas Batista:
		Caso o usuário perca o acesso a sua conta, será redirecionado para está página onde pedirá o E-mail de acesso a conta.
    
    <h1>Tela de menu</h1>
    ![tela 7 - Menu](https://user-images.githubusercontent.com/102639688/231066387-a18b7807-b4c7-4be1-b27f-472ee548a2a2.jpeg)
    
    Desenvolvido por Lucas Batista:
    tela de menu do aplicativo com funções de Mudar Cadastro,Pedir Doação, mensagens de pedidos e pesquisa.

  <h1>tela Mudar Cadastro</h1>
  
  ![tela 8 - alterar cadastro](https://user-images.githubusercontent.com/102639688/231067014-b621f9b2-89c9-4ae6-8b4a-2abf2b3ad016.jpeg)

  Desenvolvido por Lucas batista:
  tela contendo informções do cadastro do usario onde pode ser alterados.
  
  <h1>Tela Pedir Doação</h1>
  ![tela 9 - pedir doação](https://user-images.githubusercontent.com/102639688/231067272-f8222b8d-1869-4050-b3e7-ab54e20146e6.jpeg)
  
      Desenvolvido por Lucas batista:
      Tela para pedir doação de sangue com informções do necessitados onde você pedido doação chegara mensagem para todos os usuarios do app.
      
      <h1>Tela Mensagens</h1>
      ![tela 10 -mensagens](https://user-images.githubusercontent.com/102639688/231067582-ab37eaad-ef31-4705-8272-b335125d9241.jpeg)
        Desenvolvido Por Lucas Batista:
      Tela contendo pedido de doação de pessoas.

  <h1>Tela Pesquisa Laboratorio</h1>
![tela 11 - locais de doação](https://user-images.githubusercontent.com/102639688/231067953-6301a379-8a28-4ec2-b6f0-e36e266783cc.jpeg)

Dsenvolvido por Lucas Batista:
 Tela contem barra de pesquisa para laboratórios.
 
 <h1>Tela Local de Doação</h1>
 ![tela 12 - local da doação](https://user-images.githubusercontent.com/102639688/231068325-f850e98a-53ef-4421-a02f-1fe86b991e2e.jpeg)

 Desenvolvida Por Lucas Batista:
 Tela contendo informações e endereço do laboratorio no qual o usuario pesquisou.

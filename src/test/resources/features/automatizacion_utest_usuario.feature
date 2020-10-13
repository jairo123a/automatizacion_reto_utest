# language:es
Característica: : Realizar un registro exitoso en el sitio web utest
  como usuario
  quiero ingresar al sitio web y diligenciar unos campos
  para realizar un registro exitoso
  @caso1
  Escenario: : Ingresar al sitio web y diligenciar un formulario para registrar un usuario
    Dado que un usuario ingresa al sitio web
    Cuando el Diligencia un formulario y registra un usuario
    |   nombre   |apellido  |correo          |mes      |dia   |ano   |password   |confirmarpass|
    |  jairo     |henao     |12304@gmail.com |December |30    |1987  |Pjairo12345|Pjairo12345  |
    Entonces el verifica el registro exitoso"Welcome to the world's largest community of freelance software testers!"
